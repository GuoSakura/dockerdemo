FROM java:8u261-jdk
MAINTAINER guo <guoshaohua@outlook.com>
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
VOLUME /tmp
ADD DockerDemo.jar /webapp/DockerDemo.jar
RUN bash -c 'touch /webapp/DockerDemo.jar'
ENTRYPOINT ["java","-jar","/webapp/DockerDemo.jar"]