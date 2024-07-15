# Foro-Hub

# Proyecto Spring Boot con JWT

Este proyecto es una aplicación de Spring Boot que implementa operaciones CRUD en tres tablas (`users`, `topicos`, `respuestas`) y utiliza JSON Web Tokens (JWT) para la autenticación y seguridad.

## Requisitos

- Java 17 o superior
- Maven 3.6.0 o superior
- Base de datos (MySQL, PostgreSQL)

## Endpoints:
-> crear usuario: http://localhost:8080/api/auth/register
-> Autenticar usuario: http://localhost:8080/api/auth/login
-> Crear Topico: http://localhost:8080/topicos
-> Actualizar Topico: http://localhost:8080/topicos
-> Eliminar Topico: http://localhost:8080/topicos/2
-> Mostrar Topicos: http://localhost:8080/topicos/8
-> Traer un Topico espesifico: http://localhost:8080/topicos/8

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/FranklinRomero22/Foro-Hub.git
   cd tu-repositorio
