# BookingApp
BookingApp es una aplicación Java diseñada para gestionar reservas de vehículos, ofreciendo funcionalidades como la gestión de clientes, localizaciones, vehículos y códigos promocionales. La aplicación sigue una estructura modular y está orientada a objetos, implementando un sistema de clases que interactúan entre sí para llevar a cabo las distintas operaciones.

## Estructura del Proyecto
El proyecto se organiza en módulos y paquetes de la siguiente manera:

### Módulo principal: booking
Este módulo es el núcleo del proyecto y contiene todo el código necesario para la funcionalidad de la aplicación.

### Paquete raíz: org.ulpgc.is1
Dentro de este paquete se organizan las clases en dos subpaquetes principales:

#### Paquete control:
Este paquete contiene la clase Main, que es la encargada de ejecutar la aplicación. Aquí se inicializan las operaciones clave y se realizan las pruebas de funcionamiento.

#### Paquete model:
Este paquete contiene todas las clases que modelan el dominio del problema, tales como Member, Customer, Location, Booking, Vehicle, entre otras. Estas clases definen los objetos principales y sus interacciones, representando la lógica del negocio.

## Descripción General de las Clases
- **Clase Member**: Representa a los miembros de la aplicación. Actúa como clase base para otros tipos de usuarios, y se utiliza para almacenar información personal esencial.

- **Clase Customer**: Subclase de Member, específica para los clientes del sistema. Añade información relevante para los clientes y facilita su gestión en el sistema de reservas.

- **Clase Location**: Se encarga de representar las localizaciones asociadas a las reservas, como las direcciones físicas donde se llevan a cabo los servicios o donde se encuentran los vehículos.

- **Clase Booking**: Esta clase gestiona las reservas. Incluye información sobre las localizaciones, clientes y vehículos asociados, así como los detalles de la fecha y los precios calculados en base a la reserva y posibles descuentos.

- **Clase PromotionalCode**: Se encarga de manejar los códigos promocionales que pueden aplicarse a las reservas para ofrecer descuentos. Está vinculada directamente con las instancias de la clase Booking.

- **Clase VehicleType**: Define una enumeración de los distintos tipos de vehículos disponibles para la reserva, categorizándolos según su tipo.

- **Clase Vehicle**: Representa los vehículos disponibles en el sistema para su reserva. Cada vehículo tiene características propias como su matrícula, tipo y precio, y está vinculado a las reservas realizadas.

- **Clase Plate**: Modela la matrícula de un vehículo, asegurando que cumple con los formatos de validación requeridos.

- **Clase BookingManager**: Es la clase central que coordina todas las funcionalidades del sistema. A través de esta clase, se gestionan la adición de clientes, vehículos, y códigos promocionales, además de crear y gestionar las reservas. Proporciona los métodos clave como addCustomer(), addVehicle(), book(), y otros.

## Funcionamiento General
1. El programa comienza ejecutando la clase Main, que inicializa y gestiona las operaciones necesarias para comprobar el correcto funcionamiento del sistema.

2. La clase BookingManager actúa como la interfaz central, permitiendo añadir clientes, vehículos, y realizar reservas a través de sus métodos.

3. El sistema evita la duplicación de clientes, vehículos y códigos promocionales, y permite aplicar descuentos a las reservas a través de códigos promocionales.

4. La información de las reservas, incluyendo detalles de clientes, vehículos, y localizaciones, se puede mostrar de manera clara en la salida de la aplicación.

**Anotación**
Todos los getter y setter que no se usaban se han eliminado a modo de tener un código más limpio.
