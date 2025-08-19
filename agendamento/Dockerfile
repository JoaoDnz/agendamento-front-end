# Usa uma imagem base oficial com Java 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o wrapper do Gradle
COPY gradlew .
COPY gradle ./gradle

# Copia o arquivo de build
COPY build.gradle .
COPY settings.gradle .

# Copia o código-fonte da aplicação
COPY src ./src

# Constrói a aplicação
RUN ./gradlew build

# Expõe a porta que a aplicação vai rodar
EXPOSE 8080

# Comando para iniciar a aplicação
CMD ["java", "-jar", "build/libs/agendamento-0.0.1-SNAPSHOT.jar"]