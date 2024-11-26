package org.theleakycauldron.prophetsowlerysystem.kafkalisteners;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.theleakycauldron.prophetsowlerysystem.dtos.ChangePasswordLinkDto;
import org.theleakycauldron.prophetsowlerysystem.dtos.SignUpEmailDto;

@Service
public class OwleryChangePasswordListener {

    @KafkaListener(topics = "generated-change-password-link", id = "change-password")
    public void listen(ConsumerRecord<String, ChangePasswordLinkDto> dto) {
        System.out.println(dto.value());
    }
}
