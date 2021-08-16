FROM java:8
# 预先编译好项目，然后直接找到 jar 进行 push
MAINTAINER dizzy
## 复制文件到容器 leave-preview-7.01.jar
ADD ./target/initial-0.0.1-SNAPSHOT.jar /initial-0.0.1-SNAPSHOT.jar
ENV TZ=Asia/Shanghai
ENV LANG C.UTF-8
## 声明需要暴露的端口
EXPOSE 7890
## 配置容器启动后执行的命令 # 执行jar包
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","-Xmx128m","-Xms128m","/initial-0.0.1-SNAPSHOT.jar"]
