package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    private static Object bookings;

    public static void main(String[] args) {

        BookingManager bookingManager = new BookingManager();

        //i. Crear dos clientes, el primero es un cliente normal y el segundo es un cliente miembro.
        Customer customer1 = new Customer("Raquel", "Almeida");
        Member customer2 = new Member("Jorge", "Morales", 644449779, LocalDate.of(2003, 4, 23));

        bookingManager.addCustomer(customer1);
        bookingManager.addMember(customer2);

        //ii. Crear dos códigos promocionales
        PromotionalCode promotionalCode1 = new PromotionalCode("PROMO1", 15);
        PromotionalCode promotionalCode2 = new PromotionalCode("PROMO2", 30);

        bookingManager.addPromotionalCode(promotionalCode1);
        bookingManager.addPromotionalCode(promotionalCode2);

        //iii. Crear dos vehículos
        Plate plate1 = new Plate("9420HDL");
        Plate plate2 = new Plate("1785KHS");

        Vehicle vehicle1 = new Vehicle(156978, "Renault", "Megane", 12500, VehicleType.URBAN, plate1);
        Vehicle vehicle2 = new Vehicle(789568, "Mercedes", "GLE Coupe", 35000, VehicleType.KIDS, plate2);

        bookingManager.addVehicle(vehicle1);
        bookingManager.addVehicle(vehicle2);

        //iv. Hacer una reserva para el primer cliente del segundo vehículo con el segundo código promocional.
        Location from1 = new Location("Avenida Pintor Felo Monzón", 28, 35019, "Las Palmas de Gran Canaria");
        Location to1 = new Location("Calle Remedios", 10, 35002, "Las Palmas de Gran Canaria");

        Booking booking1 = new Booking(1, LocalDate.of(2024, 10, 12), customer1, vehicle2, promotionalCode2, from1, to1);
        bookingManager.Book(booking1);


        //v. . Hacer dos reservas para el segundo cliente. La primera para el segundo vehículo sin código promocional
        Location from2 = new Location("Avenida Rafael Cabrera", 12, 35002, "Las Palmas de Gran Canaria");
        Location to2 = new Location("Calle Pinto Pepe Dámaso", 45, 35018, "Las Palmas de Gran Canaria");
        Booking booking2 = new Booking(2, LocalDate.of(2024, 11, 23), customer2, vehicle2, null, from2, to2);
        Booking booking3 = new Booking(3, LocalDate.of(2024, 12, 1), customer2, vehicle1, promotionalCode1, from2, to2);

        bookingManager.Book(booking2);
        bookingManager.Book(booking3);

        //vi. Mostrar de forma clara los datos de las reservas del segundo vehículo, incluyendo todos los datos asociados a las mismas.
        int count = 0;
        for (Booking booking : bookingManager.getBookingList()) {
            if (booking.getVehicle().equals(vehicle2)) {
                count++;
            }
        }

        System.out.println("El vehículo 2 tiene " + count + " reservas");
        System.out.println();
        System.out.println("*******************************************************");
        System.out.println("        Reservas del vehículo (Lic. " + vehicle2.getLicense() + ")");
        System.out.println("*******************************************************");
        System.out.println("*) Datos del vehículo:");
        System.out.println("     |- Licencia: " + vehicle2.getLicense());
        System.out.println("     |- Matrícula: " + vehicle2.getPlate().getNumber());
        System.out.println("     |- Marca: " + vehicle2.getBrand());
        System.out.println("     |- Modelo: " + vehicle2.getModel());
        System.out.println("     |- Tipo: " + vehicle2.getType());
        System.out.println("     |- Precio: " + vehicle2.getPrice());
        System.out.println();

        int numberReservations = 1;
        for (Booking booking : bookingManager.getBookingList()) {
            if (booking.getVehicle().equals(vehicle2)) {
                System.out.println("        Reserva (cod. " + numberReservations + ")");
                System.out.println("*******************************************************");
                System.out.println("*)Datos de la reserva:");
                System.out.println("     |- Código de reserva: " + booking.getId());
                System.out.println("     |- Confirmada el día: " + booking.getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                System.out.println("     |- Punto de inicio: " + booking.getFrom().getStreet() + " número " + booking.getFrom().getNumber() + " (CP: " + booking.getFrom().getPostalCode() + ") en " + booking.getFrom().getCity());
                System.out.println("     |- Punto de llegada: " + booking.getTo().getStreet() + " número " + booking.getTo().getNumber() + " (CP: " + booking.getTo().getPostalCode() + ") en " + booking.getTo().getCity());
                System.out.println("     |- Precio de la reserva: " + booking.price() + " euros.");
                if (booking.getPromotionalCode() != null) {
                    System.out.println("     |- Código promocional [" + booking.getPromotionalCode().getId() + "] con un descuento del " + booking.getPromotionalCode().getDiscount() + "%");
                } else {
                    System.out.println("     |- Sin código promocional.");
                }
                System.out.println();
                System.out.println("    Reserva realizada por " + booking.getCustomer().getName() + " " + booking.getCustomer().getSurname());
                System.out.println("---------------------------------------------");
                System.out.println();
                numberReservations++;
            }
        }
    }
}
