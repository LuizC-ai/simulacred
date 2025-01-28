# Usa uma imagem oficial do Java para rodar a aplicação
FROM eclipse-temurin:17-jdk

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR gerado pelo Maven para o container
COPY target/simulacred.jar app.jar

# Expõe a porta da aplicação
EXPOSE 8080

# Comando para rodar a aplicação dentro do container
ENTRYPOINT ["java", "-jar", "app.jar"]
