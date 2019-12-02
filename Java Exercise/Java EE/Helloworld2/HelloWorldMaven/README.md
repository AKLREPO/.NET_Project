# Build
mvn clean package && docker build -t com.mycompany/HelloWorldMaven .

# RUN

docker rm -f HelloWorldMaven || true && docker run -d -p 8080:8080 -p 4848:4848 --name HelloWorldMaven com.mycompany/HelloWorldMaven 