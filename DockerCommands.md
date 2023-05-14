# Docker Commands

1. docker build -t spring-boot-java .
2. docker build -t spring-boot-java:latest .

## docker run
1. docker run spring-boot-java // creates new container
2. docker run --rm spring-boot-java - remove container after running
3. docker run --it spring-boot-java - interactive
4. docker run  --name spring-app spring-boot-java

### cheeck docker contatiners
1. docker ps - running containers
3. docker ps -a - all the containers created


### Managing containers

docker start <container-id> / <conntainer-name> // run as detached mode
docker stop  <container-id> / <conntainer-name> // run as detached mode


when using start command by default containers are started in dettach mode

to start in attach mode

docker start -a <container-id> / <conntainer-name>


### attaching to dettaching container

docker attach <container-id> / <conntainer-name>

### attaching to logs of a container
docker logs -f <container-id> / <conntainer-name>


### removeing container

docker stop -a <container-id> / <conntainer-name>
docker rmdof -a <container-id> / <conntainer-name>


### images
docker images
docker rmi imageid
docker inspect imageid


### copying  files into containers and out of containers

docker cp test.txt angry_easley:/apps/
docker cp angry_easley:/apps/test.txt .


### share images

1. share docker file - need to build
2. built image 


