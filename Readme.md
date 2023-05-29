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

### Implement Jaas and security in kafka
### CompletableFuture and log 
### Use sl4j and log4j, arrange log appenders
### use prometheus and grafana
### consider event sourcing and seperate listener and procesors
### seperate bl and spring boot, use JEE annotations in bl part
### distribute cache 
### IAC, terraform 