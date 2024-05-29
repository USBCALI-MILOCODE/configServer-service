
# Parcial parte 1.

Microservicios Eureka y Estudiante. 

```bash
  http://localhost:8761

```
## Ejercicios de teoria:

### 1. Debe investigar y colocar en este documento el significado de cada uno de  los decoradores que se encuentra en esta clase (Entidad Alumno).

| Decorador             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| @Entity |  Este decorador , indica que la clase representa una tabla en una base de datos relacional. Cada instancia de esta clase representa una fila en esa tabla. |
| @Table | Este decorador se utiliza en combinación con @Entity para especificar el nombre de la tabla en la base de datos que está asociada con la entidad.|
| @ToString | Este decorador, también parte de Lombok, genera automáticamente un método toString() para la clase que incluye la representación de cadena de todos los campos de la clase. |
| @NoArgsConstructor | Este decorador, nuevamente de Lombok, genera automáticamente un constructor sin argumentos para la clase. Este constructor vacío puede ser útil en situaciones donde necesitas crear instancias de la clase sin proporcionar argumentos. |

### 2. Investigar y colocar dentro de este documento el concepto del decorador Transaction.

| Decorador             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| @Transactional |  Este decorador, se utiliza para definir el alcance de la transacción que rodea a un método. Puede configurarse para diferentes propósitos, como solo lectura o lectura/escritura. Esto asegura la consistencia de la base de datos y ayuda a prevenir problemas de concurrencia y pérdida de datos.|
| @Transactional(readOnly = true) |  Este decorador indica que el método está configurado para operaciones de solo lectura en la base de datos. |

### 3. Definir que significa los siguientes conceptos en Spring Boot :

| Concepto             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| ResponseEntity<?> | Es una clase que representa la respuesta HTTP completa en Spring, incluyendo código de estado, cabeceras y cuerpo. Se usa en controladores para devolver respuestas personalizadas. |
| Optional | Es una clase de Java que envuelve un valor que puede ser presente o ausente, ayudando a evitar excepciones de puntero nulo. |
| @PathVariable | Es una anotación de Spring MVC que se utiliza en métodos de controlador para vincular variables de ruta de la URL a parámetros de método, también puede extraer valores de la URL de una solicitud HTTP y utilizarlos en el método del controlador.  |


### 4. Investigar y colocar en este parte del documento lo que es el servidor EUREKA como parte de Spring Cloud

| Concepto             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| EUREKA | El servidor Eureka es un componente de Spring Cloud que proporciona un servicio de registro y descubrimiento para microservicios en un entorno distribuido, lo cual permite que los microservicios se encuentren unos a otros dinámicamente. |

# Parcial, parte 2.

Microservicios Common y Gateway.


## Ejercicios de teoria
### 1. Buscar y poner en esta parte el concepto de Spring Cloud Gateway

| Concepto             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| Spring Cloud Gateway |Spring Cloud Gateway es un enrutador y servidor de paso de API construido sobre Spring Framework. Proporciona una manera flexible y potente de enrutar y filtrar las solicitudes HTTP que van hacia servicios internos o externos en una arquitectura de microservicios. |

### 2. Con la orientación del profesor colocar en este parte del documento el significado de cada una de las propiedades del anterior archivo

| Propiedades             | Significado                                                                |
| ----------------- | ------------------------------------------------------------------ |
| spring.cloud.gateway.mvc.routes[0].id: | Identificador único para la ruta del microservicio de usuarios.|
|spring.cloud.gateway.mvc.routes[0].uri: | URI donde se encuentra el microservicio de usuarios, usando un balanceador de carga. | 
| spring.cloud.gateway.mvc.routes[0].predicates: |  Especifica las condiciones que una solicitud debe cumplir para que sea dirigida a la ruta del microservicio de usuarios. En este caso, la condición es que la solicitud tenga la ruta /api/alumno/**. |
| spring.cloud.gateway.mvc.routes[0].filters | Filtro que elimina los dos primeros segmentos del URI de la solicitud antes de reenviarla al microservicio.|

# Parcial, parte 3.

Microservicios Eureka y Estudiante. 

## Eureka
```bash
  http://localhost:8761

```

## SpringGateway
```bash
  http://localhost:8090

```

## Usuarios
```bash
  http://localhost:65409

```
## (fetch = FetchType.LAZY)

El argumento fetch = FetchType.LAZY dentro de la relación @OneToMany en la clase Curso indica que la carga de los objetos relacionados (Alumno en este caso) se realizará de forma perezosa o "lazy". Esto significa que los objetos de Alumno no se cargarán de la base de datos hasta que se acceda explícitamente a ellos.

Al utilizar FetchType.LAZY, la carga de los alumnos se pospone hasta que realmente necesites acceder a ellos, lo que puede ayudar a optimizar el rendimiento de la aplicación al reducir la cantidad de datos que se recuperan de la base de datos en una sola operación.
