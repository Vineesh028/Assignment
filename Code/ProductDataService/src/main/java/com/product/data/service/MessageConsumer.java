package com.product.data.service;

import java.io.UnsupportedEncodingException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessageConsumer {

	@Value("${app.dlq.topic}")
	private String dlqTopic;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@KafkaListener(id = "ProductListener", topics = "${app.message.topic}")
	public void consume(ConsumerRecord<String, String> consumerRecord, Acknowledgment acknowledgment)
			throws IllegalStateException, UnsupportedEncodingException, JsonMappingException, JsonProcessingException {

		String json = String.valueOf(consumerRecord.value());
		log.info("Consuming message {}", json);

		try {

			readAndSaveProductData(json);
			// countryRepository.save(modelMapper.map(country, CountryEntity.class));

		} catch (Exception e) {
			log.info("Message consumption failed for message {}", json);
			String originalTopic = consumerRecord.topic();
			ProducerRecord<String, String> record = new ProducerRecord<>(dlqTopic, json);
			// record.headers().add(Constants.ORIGINAL_TOPIC_HEADER_KEY,
			// originalTopic.getBytes(StandardCharsets.UTF_8));
			// Header retryCount =
			// consumerRecord.headers().lastHeader(Constants.RETRY_COUNT_HEADER_KEY);
//			if (retryCount != null) {
//				record.headers().add(retryCount);
//			}
			kafkaTemplate.send(record);
		} finally {
			acknowledgment.acknowledge();
		}
	}

	private void readAndSaveProductData(String json) {
		// TODO Auto-generated method stub

	}
}