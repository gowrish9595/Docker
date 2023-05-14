FROM registry.access.redhat.com/ubi9/openjdk-17
USER root
RUN mkdir /apps/ && \
    useradd -u 1001 cpgusr && \
    chown cpgusr:cpgusr /apps
USER cpgusr
COPY ./target/Docker-Sample-0.0.1-SNAPSHOT.jar /apps/
ENTRYPOINT ["java", "-jar", "/apps/Docker-Sample-0.0.1-SNAPSHOT.jar"]
