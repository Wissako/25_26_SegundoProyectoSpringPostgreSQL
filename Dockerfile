# Imagen base con Java 21
FROM openjdk:21-jdk

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el JAR generado por Maven
COPY target/*.jar app.jar

# Render expone el puerto 10000 (lo configuramos dinámicamente)
ENV PORT=10000
EXPOSE 10000

# Comando de arranque
ENTRYPOINT ["java", "-jar", "app.jar"]