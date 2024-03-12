# Spring Boot Project
**Spring** es un *framework* para el desarrollo de aplicaciones y contenedor de inversión de control, de código abierto para la plataforma Java.
**Spring Boot** es una herramienta que acelera y simplifica el desarrollo de microservicios y aplicaciones web con Spring Framework gracias a tres funciones principales:
- Configuración automática.
- Un enfoque de configuración obstinado.
- La capacidad de crear aplicaciones autónomas.
## Requisitos
- Spring Tools 4
- Java JDK 17

## Iniciar proyecto
- Spring Initialzr
- Maven
- Añadir dependencias:
	- Spring Web
	- Oracle Driver
	- Spring Data JPA

	- > Si vamos a crear entidades a mano también es óptimo instalar la dependencia **Lombok**

## Paquetes
- Model
- Repositories
- Controller

## Establecer conexión con la base de datos
Establecer conexión proporcionando los datos como el *host*, *sid*, *port*...

## Entidades asociadas a las tablas
En el paquete **Model**, crear las entidades asociadas a las tablas de la base de datos.

> En IntelliJ, podemos crear las entidades de forma automática:
>  - `View > ToolWindows > Persistence`
>  - `GeneretePersistenceMapping > ByDataBaseSchema`
>   - Seleccionar el paquete Model
>   - Seleccionar todas las tablas

## Application Properties
Añadir al archivo Application Properties
- Database url
- Username
- Password


## Repositorio
Crear una interfaz por cada tabla de la base de datos en el paquete **Repositories**:
`public iterface Interfaz extends CrudRepositori<Entity, IDType)>{}`

## Controller
Crear clase Controller en el paquete **Controller**.
- @RestController, @CrossOrigin, @AutoWired, @RequestMapping...
- Recoger  los datos de la base de datos
- Almacenarlos en `Iterable<Object>`
- Parsear `Iterable<Object>` a JSON.
- Devolver el JSON.
