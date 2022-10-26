Dubbo Spring Boot Example
============================

This example shows how to use Dubbo Spring Boot Starter to develop Dubbo application.

# Maven modules

* interface, provides Dubbo service definition
* provider, implements Dubbo service
* consumer, consumes Dubbo service

# Get started

* Start Zookeeper: `docker-compose up -d`
* Open project in IntelliJ IDEA with JDK 1.8
* Start service provider
* Start service consumer
* Check RPC call `curl http://localhost:8080`

# References

* Apache Dubbo: https://dubbo.apache.org/en/