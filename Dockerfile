FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=build/dependency

COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","com.jsantos.aws_project01.AwsProject01Application"]
