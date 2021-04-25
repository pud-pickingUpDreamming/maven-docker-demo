FROM mcr.microsoft.com/java/jdk:8u272-zulu-centos
ENV JAVA_OPTIONS=""
ADD target/*.jar /app.jar
HEALTHCHECK --interval=60s --timeout=30s --start-period=60s --retries=3 CMD curl -f http://localhost/check/heart || exit 1
CMD java $JAVA_OPTIONS -jar /app.jar