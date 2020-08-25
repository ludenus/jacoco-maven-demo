FROM openjdk:14

ENV JAVA_OPTS="-server -Xms128m -Xmx128m"

COPY target/demo-*.jar /demo.jar
COPY entrypoint.sh /entrypoint.sh
RUN chmod 755 /entrypoint.sh
ENTRYPOINT ["/entrypoint.sh"]