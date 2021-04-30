# 后面只发布不运行的话,需要在服务端执行下面命令启动容器
# JAVA_OPTIONS: jvm参数
# SPRING_PROFILES_ACTIVE: spring环境变量
docker run -d -p 8889:8888 \
          -e "JAVA_OPTIONS=-Xmx1024m -Djava.security.egd=file:/dev/./urandom" \
          -e "SPRING_PROFILES_ACTIVE=dev" \
          -v /app/logs:/app/logs \
          --name maven-docker-demo 172.17.0.9:9001/library/maven-docker-demo
