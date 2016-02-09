The purpose of this project is to be minimal example of generating multiple docker images from one SBT project.
This is full answer to this question http://stackoverflow.com/questions/35267971/multiple-docker-images-from-sbt

`sbt> docker:stage` will generate two Dockerfile's 

`> find . -name Dockerfile`  
>./api/target/docker/Dockerfile  
>./api/target/docker/stage/Dockerfile  
>./job/target/docker/Dockerfile  
>./job/target/docker/stage/Dockerfile  

`sbt> docker:publishLocal` will build Docker images

`> docker images`
```
REPOSITORY                                     TAG                 IMAGE ID            CREATED             VIRTUAL SIZE  
docker.example.com/some_group/goo-api-docker   latest              0cfb8d04b3da        15 seconds ago      829 MB  
docker.example.com/some_group/goo-api-docker   prod                0cfb8d04b3da        15 seconds ago      829 MB  
docker.example.com/some_group/foo-job-docker   latest              7949a3a96f46        16 seconds ago      829 MB  
docker.example.com/some_group/foo-job-docker   prod                7949a3a96f46        16 seconds ago      829 MB  
```
For documentation please check
http://www.scala-sbt.org/sbt-native-packager/formats/docker.html
