# Spring Boot Project
**Spring** es un *framework* para el desarrollo de aplicaciones y contenedor de inversión de control, de código abierto para la plataforma Java.
**Spring Boot** es una herramienta que acelera y simplifica el desarrollo de microservicios y aplicaciones web con Spring Framework gracias a tres funciones principales:
- Configuración automática.
- Un enfoque de configuración obstinado.
- La capacidad de crear aplicaciones autónomas.
## Requisitos
- Spring Tools 4
- Java JDK 17
- IntelliJ Idea

> En nuestro caso usaremos el IDE de JetBrains, IntelliJ Idea, pero con las SpringTools4 podrás utilizar tu entorno favorito.

## Iniciar proyecto
- Spring Initialzr
- Maven
- Añadir dependencias:
	- Spring Web
	- Oracle Driver
	- Spring Data JPA

	- > Si vamos a crear entidades "a mano" también es óptimo instalar la dependencia **Lombok**.

## Paquetes
Tras iniciar el proyecto debemos crear los siguiente paquete.
- Model
- Repositories
- Controller
> Puedes encontrar estos paquetes en el código del repositorio

## Establecer conexión con la base de datos
Establecer conexión proporcionando los datos como el *host*, *sid*, *port*...
En nuestro caso estableceremos conexión con una base de datos de **Oracle**.
Esta base de datos contiene información sobre futbol. Trataremos de crear una *API* para acceder a estos datos.

## Entidades asociadas a las tablas
En el paquete **Model**, crear las entidades asociadas a las tablas de la base de datos.

> En IntelliJ, podemos crear las entidades de forma automática:
>  - `View > ToolWindows > Persistence`
>  - `GeneretePersistenceMapping > ByDataBaseSchema`
>   - Seleccionar el paquete Model
>   - Seleccionar todas las tablas

En nuestro caso, contamos con la entidad **Equipo**. Se encuentra archivada en el código del repositorio.

## Application Properties
Añadir al archivo Application Properties
- Database url
- Username
- Password

`spring.datasource.url=jdbc:oracle:xxx:@XX.XX.XXX.XX:1521:xxx
spring.datasource.username=user
spring.datasource.password=pass`

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

El código del Controller también se encuentra en el repositorio.

## Ejecutar
Para ejecutar nuestra Spring Boot App:
- Build > BuildProject
- Run
Spring Boot montará automaticamente un Tomcat en el puerto 8080
> localhost/8080/
