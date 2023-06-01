### automatize dockerizing consider naming, versioning

### cache some parts of docker and java app

### container name can contain lowercase and uppercase letters, digits, underscores, periods, and hyphens

### describe topics inside kafka docker container
/opt/kafka/bin/kafka-topics.sh   --bootstrap-server localhost:9092 --list
/opt/kafka/bin/kafka-topics.sh   --bootstrap-server localhost:9092 --describe

Topic: topic2   TopicId: tBJqINTxR-GNz4zAtNOJRg PartitionCount: 3       ReplicationFactor: 1    Configs: segment.bytes=1073741824
Topic: topic2   Partition: 0    Leader: 1001    Replicas: 1001  Isr: 1001
Topic: topic2   Partition: 1    Leader: 1001    Replicas: 1001  Isr: 1001
Topic: topic2   Partition: 2    Leader: 1001    Replicas: 1001  Isr: 1001
Topic: __consumer_offsets       TopicId: dlBCvpYrTm2JtvelGFknvA PartitionCount: 50      ReplicationFactor: 1    Configs: compression.type=producer,cleanup.policy=compact,segment.bytes=104857600
Topic: __consumer_offsets       Partition: 0    Leader: 1001    Replicas: 1001  Isr: 1001
...

If we restart the java instance
[Consumer clientId=consumer-group_id-1, groupId=group_id] Found no committed offset for partition test_topic-2
[Consumer clientId=consumer-group_id-1, groupId=group_id] Found no committed offset for partition test_topic-0
[Consumer clientId=consumer-group_id-1, groupId=group_id] Setting offset for partition test_topic-1 to the committed offset FetchPosition{offset=6,...

### Implement Jaas and security in kafka
### CompletableFuture and log 
### Use sl4j and log4j, arrange log appenders
### use prometheus and grafana
### consider event sourcing and seperate listener and procesors
### seperate bl and spring boot, use JEE annotations in bl part
### distribute cache 
### IAC, terraform
### Docker inspect for ip of containers
### docker network settings dilemma between localhost <-> prometheus

Swagger- Open Api : http://localhost:8080/swagger-ui/index.html
Prometheus : http://localhost:9090/
Prometheus Metrics: http://localhost:9090/metrics
Grafana: http://localhost:3000/
Actuator Prometheus data: http://localhost:8080/actuator/prometheus

https://github.com/Einsteinish/Docker-Compose-Prometheus-and-Grafana/blob/master/docker-compose.yml
https://github.com/tarantool/grafana-dashboard/blob/master/docker-compose.yml


