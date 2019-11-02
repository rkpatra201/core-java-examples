package com.java.kafka.producer;

import org.apache.kafka.clients.producer.*;

import java.util.Properties;

// https://kafka.apache.org/0100/javadoc/index.html?org/apache/kafka/clients/producer/KafkaProducer.html
public class ProducerCallbackMain {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(props);
        for (int i = 0; i < 100; i++) {
             producer.send(new ProducerRecord<String, String>("my-topic", Integer.toString(i), Integer.toString(i)), new ProducerMessageCallback());
        }
        producer.close();
    }
}

class ProducerMessageCallback implements Callback
{
    @Override
    public void onCompletion(RecordMetadata recordMetadata, Exception e) {
        String result = String.format("message sent to partition: %d and offset: %d",recordMetadata.partition(),recordMetadata.offset());
        System.out.println(result);
    }
}

