#!/bin/bash
java -javaagent:./splunk-otel-javaagent.jar -Dotel.service.name=java-webflux-crud -Dotel.resource.attributes=deployment.environment=dev -jar ./target/Splunk-Java-Webflux-CRUD-0.0.1-SNAPSHOT.jar