package org.theleakycauldron.prophetsowlerysystem.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.theleakycauldron.prophetsowlerysystem.dtos.SignUpEmailDto;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */

@Configuration
public class OwlerySystemConfiguration {

    @Bean
    public KafkaAdmin.NewTopics topics(){
        NewTopic signup = new NewTopic("user-signup-email", 1, (short) 1);
        NewTopic changePassword = new NewTopic("generated-change-password-link", 1, (short) 1);

        return new KafkaAdmin
                .NewTopics(signup, changePassword);
    }


}
