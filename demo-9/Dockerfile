#从docker仓库中获取基础镜像
FROM  openjdk:8
#用于执行后面跟着的命令行命令
RUN mkdir /app
#指定工作目录
WORKDIR /app
#自动复制并解压到 <目标路径>
ADD target/demo-0.0.1-SNAPSHOT.jar /app

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/app/demo-0.0.1-SNAPSHOT.jar"]
#暴露端口,建议与项目端口一致
EXPOSE 8088
