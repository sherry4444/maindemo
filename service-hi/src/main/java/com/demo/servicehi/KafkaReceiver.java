package com.demo.servicehi;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static org.apache.kafka.common.requests.DeleteAclsResponse.log;

@Component
@Slf4j
public class KafkaReceiver implements MessageListener<String, Object> {

    @KafkaListener(topics = {"abc123"})
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();

            System.out.print("record = " + record);
            System.out.print("message = " + message);
//            log.info("record =" + record);
//            log.info("message =" + message);
        }
    }

    @Override
    public void onMessage(ConsumerRecord<String, Object> record) {

    }
}
