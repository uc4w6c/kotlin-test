FROM adoptopenjdk/openjdk11
VOLUME /tmp
RUN mkdir /app
WORKDIR /app
COPY . /app/
RUN sh gradlew build
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dspring.profiles.active=docker -Djava.security.egd=file:/dev/./urandom -Xms1024m -jar build/libs/demo-0.0.1-SNAPSHOT.jar" ]
# EXPOSE 8080
# ENTRYPOINT ["sh", "./gradlew", "bootRun"]

