# KafkaDemo
Spring Boot Kafka Demo for YouTube video

Start Kafka in Docker

docker-compose -f kafka_docker_compose.yml up -d


Stop Kafka in Docker

docker-compose -f kafka_docker_compose.yml down


Shell into docker container for kafka

docker exec -it kafka /bin/sh


Create Topic

/bin/kafka-topics --create --replication-factor 1 --partitions 1 --topic first_topic --bootstrap-server localhost:29092


List Topics

/bin/kafka-topics --list --bootstrap-server localhost:29092

Start Consumer on Docker kafka command line

/bin/kafka-console-consumer --bootstrap-server localhost:29092 --topic first_topic --from-beginning

Start Producer on Docker kafka command line

/bin/kafka-console-producer --broker-list localhost:29092 --topic first_topic


