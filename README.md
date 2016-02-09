The purpose of this project is to be minimal example of generating multiple docker images from one SBT project.
This is full answer to this question http://stackoverflow.com/questions/35267971/multiple-docker-images-from-sbt

`sbt> docker:stage` will generate two Dockerfile's 

`find . -name Dockerfile`  
>./api/target/docker/Dockerfile  
>./api/target/docker/stage/Dockerfile  
>./job/target/docker/Dockerfile  
>./job/target/docker/stage/Dockerfile  

For documentation please check
http://www.scala-sbt.org/sbt-native-packager/formats/docker.html
