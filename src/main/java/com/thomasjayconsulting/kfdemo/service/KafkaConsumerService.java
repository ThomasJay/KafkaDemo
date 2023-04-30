package com.thomasjayconsulting.kfdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "#{'${kafka.topic}'}", groupId = "spring-boot")
    public void processMessage(String message,
                               @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                               @Header(KafkaHeaders.RECEIVED_PARTITION_ID) List partitions,
                               @Header(KafkaHeaders.RECEIVED_TOPIC) List topics,
                               @Header(KafkaHeaders.OFFSET) List offsets) {
        log.info("Received Key: {} Topic: {} Partition: {} Offset: {} Message: {}", key, topics.get(0), partitions.get(0), offsets.get(0), message);
    }


}
