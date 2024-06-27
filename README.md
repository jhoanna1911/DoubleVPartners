# DoubleVPartners Project

## Descripción DEMO

Este proyecto es una API para crear, eliminar, editar y recuperar tickets con paginación.

## Requisitos

- JDK 17
- Maven 
- Git

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/jhoanna1911/DoubleVPartners.git
    cd DoubleVPartners
    ```

2. Construye el proyecto:

    ```bash
    mvn clean install
    ```

## Configuración

1. Crea `application.properties` en `src/main/resources`:

    ```properties
    # MySQL Database Configuration
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

    # JPA Configuration
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

## Ejecución

1. Inicia la aplicación:

    ```bash
    mvn spring-boot:run
    ```

2. La API estará disponible en `http://localhost:8080`.

## Pruebas

Usa Postman u otra herramienta para probar la API. Ejemplo:

```bash
GET http://localhost:9090/api/tickets
POST http://localhost:9090/api/tickets/create  
JSON: 
`{
    "usuario": "Gabriel22",
    "estatus": "abierto"
}`



## Descripción PERFILES

Este proyecto es una API para consultar perfiles de usuarios utilizando datos de GitHub.

## Requisitos

- JDK 17
- Maven 
- Git

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/jhoanna1911/DoubleVPartners.git
    cd DoubleVPartners
    ```

2. Construye el proyecto:

    ```bash
    mvn clean install
    ```

## Configuración

1. Crea `application.properties` en `src/main/resources`:

    # GitHub API Configuration
    github.api.url=https://api.github.com
    github.api.token=your_github_token
    ```

## Ejecución

1. Inicia la aplicación:

    ```bash
    mvn spring-boot:run
    ```

2. La API estará disponible en `http://localhost:8080`.

## Pruebas

Usa Postman u otra herramienta para probar la API. Ejemplo:

```bash
GET http://localhost:9099/github/users/Mateus-Brito
