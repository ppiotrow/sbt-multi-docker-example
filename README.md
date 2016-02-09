The purpose of this project is to be minimal example of generating multiple docker images from one SBT project.
It is a full answer to this question http://stackoverflow.com/questions/35267971/multiple-docker-images-from-sbt

`sbt> docker:stage` will generate two Dockerfile's 

`find . -name Dockerfile`  
>./api/target/docker/Dockerfile  
>./api/target/docker/stage/Dockerfile  
>./job/target/docker/Dockerfile  
>./job/target/docker/stage/Dockerfile  
