# Usa uma imagem base oficial com Java 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia a pasta inteira do back-end para dentro do container
COPY agendamento/ .

# Dá permissão de execução ao script do Gradle
RUN chmod +x ./gradlew

# Constrói a aplicação
RUN ./gradlew build

# Expõe a porta que a aplicação vai rodar
EXPOSE 8080

# Comando para iniciar a aplicação
CMD ["java", "-jar", "build/libs/agendamento-0.0.1-SNAPSHOT.jar"]