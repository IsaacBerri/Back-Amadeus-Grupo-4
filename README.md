# Proyecto Backend Java con Spring Boot

## Descripción

Este proyecto es una aplicación backend desarrollada en **Java** utilizando el framework **Spring Boot**. Está diseñado bajo los principios de **arquitectura limpia**, lo que asegura que la aplicación sea escalable, mantenible y fácilmente extensible.

La aplicación gestiona operaciones y se conecta a dos bases de datos: **MongoDB** (para gestionar destinos) y **PostgreSQL** (para captura datos del usuario y respuestas de preferencias del usuario). Además, la aplicación expone múltiples endpoints para interactuar con los datos.

---

## Estructura del Proyecto

La estructura del proyecto sigue los principios de arquitectura limpia, separando claramente las diferentes responsabilidades en capas. A continuación se describe la organización y los componentes clave:

### 1. Controladores (Controllers)

Los controladores son responsables de gestionar las solicitudes HTTP y de devolver las respuestas adecuadas.

- **DestinationController.java**: Gestiona las operaciones para los destinos almacenados en MongoDB.
- **AnswersController.java**: Gestiona las operaciones para las respuestas.
- **UserController.java**: Gestiona las operaciones para los usuarios.

### 2. Servicios (Services)

Los servicios contienen la lógica de negocio de la aplicación y son los encargados de realizar las operaciones sobre los datos.

- **AnswersService.java**: Contiene la lógica de negocio para gestionar las respuestas.
- **UserService.java**: Contiene la lógica de negocio para gestionar los usuarios.
- **DestinationsService.java**: Contiene la lógica de negocio para gestionar los destinos en MongoDB.
- **GenericEntityService.java**: Proporciona métodos genéricos para la creación y búsqueda de entidades.

### 3. Modelos (Models)

Los modelos representan las entidades del dominio de la aplicación. Cada clase corresponde a una tabla o colección de base de datos.

- **DestinationsEntity.java**: Representa un destino en MongoDB.
- **ActivityEntity.java**: Representa una actividad.
- **AgeEntity.java**: Representa un rango de edad.
- **AnswersEntity.java**: Representa una respuesta.
- **DestinationEntity.java**: Representa un destino.
- **HostingEntity.java**: Representa un alojamiento.
- **TravelEntity.java**: Representa un viaje.
- **UserEntity.java**: Representa un usuario.
- **WeatherEntity.java**: Representa un clima.

### 4. Repositorios (Repositories)

Los repositorios interactúan con la base de datos utilizando **Spring Data JPA**. Son los encargados de realizar las operaciones sobre las entidades.

- **DestinationsRepository.java**: Repositorio para gestionar los destinos en MongoDB.
- **ActivityRepository.java**: Repositorio para gestionar las actividades.
- **AgeRepository.java**: Repositorio para gestionar los rangos de edad.
- **AnswersRepository.java**: Repositorio para gestionar las respuestas.
- **DestinationRepository.java**: Repositorio para gestionar los destinos.
- **HostingRepository.java**: Repositorio para gestionar los alojamientos.
- **TravelRepository.java**: Repositorio para gestionar los viajes.
- **UserRepository.java**: Repositorio para gestionar los usuarios.
- **WeatherRepository.java**: Repositorio para gestionar los climas.

### 5. Mappers

Los mappers son responsables de convertir las entidades en **DTOs** (Data Transfer Objects) y viceversa.

- **AnswersMapper.java**: Mapea la entidad `AnswersEntity` a su correspondiente **AnswersDTO** y viceversa.

### 6. Contracts

Los contracts define los **DTOs** utilizados para transferir datos entre el backend y otras capas o servicios.

- **UserDTO**: Representa los datos (nombre y correo electrónico) con validaciones para asegurarse de que los campos no estén vacíos.
- **AnswersDTO**: Representa las respuestas de un usuario, todos los campos están validados para que no queden vacíos.
- **DestinationsDTO**: Representa los destinos turísticos en América y Europa, con detalles sobre el sitio y el país,utiliza la serialización JSON para facilitar el intercambio de datos.

### 7. Validation

El paquete Validation maneja las excepciones de validación y devuelve respuestas con los errores de los datos enviados.

- **ValidationExceptionHandler**:Maneja los errores de validación en las solicitudes y devuelve una respuesta personalizada para ayudar a los desarrolladores o usuarios a entender qué campos tienen errores y qué mensajes de validación están asociados con ellos.
 
Imagen de las carpetas:

[![Imagenes de las carpetas](https://i.postimg.cc/k5TJTDzX/Captura-de-pantalla-2024-11-26-193637.png)](https://postimg.cc/06J1Q59L)

---

## Configuración y Ejecución
### Prerequisitos

Asegúrate de tener instalados los siguientes componentes antes de ejecutar la aplicación:

- **Java 17** o superior.
- **Gradle** (como herramienta de construcción).
- **MongoDB** (para gestionar los destinos).
- **PostgreSQL** (para otros datos).

### Configuración

Configura las propiedades de la aplicación en el archivo `application.properties`:

```properties
spring.application.name=AmadeusNodo
spring.data.mongodb.uri=mongodb+srv://<usuario>:<contraseña>@<cluster-url>/<database>
```
Reemplaza usuario, contraseña , cluster-url , y database por las credenciales de tu base de datos MongoDB.
## Ejecución

Para ejecutar la aplicación en un entorno local, abre una terminal y ejecuta el siguiente comando:

```
bash
./gradlew bootRun
```
## Endpoints
La aplicación proporciona una serie de endpoints RESTful para interactuar con los recursos de usuarios, respuestas y destinos.

### Usuarios

- **GET /users**: Lista de todos los usuarios.
- **GET /user/{id}**: Obtiene un usuario por su ID.
- **POST /user**: Crea un nuevo usuario.
- **DELETE /user/{id}**: Elimina un usuario por su ID.

### Respuestas

- **GET /answers**: Lista de todas las respuestas.
- **GET /answer/{id}**: Obtiene una respuesta por su ID.
- **POST /answer**: Crea una nueva respuesta.
- **DELETE /answer/{id}**: Elimina una respuesta por su ID.

### Destinos (MongoDB)

- **GET /Destination**: Lista de destinos (comentado en el controlador actual).

## Pruebas
Para ejecutar las pruebas:
```
bash
./gradlew test
```

## Contribuciones

Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un **fork** del repositorio.
2. Crea una rama con el nombre de tu feature.
3. Realiza tus cambios y pruebas.
4. Envía un **pull request** con tus cambios.

## Licencia
Este proyecto está licenciado bajo los términos de la MIT License.
