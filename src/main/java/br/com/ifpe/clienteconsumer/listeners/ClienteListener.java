package br.com.ifpe.clienteconsumer.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.ifpe.clienteconsumer.model.Cliente;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class ClienteListener {

    public static final String TOPICO_CLIENTE_SAVE = "cliente-save";

    @KafkaListener(groupId = "group-1", topics = TOPICO_CLIENTE_SAVE, containerFactory = "jsonContainerFactory")
    public void listener(@Payload Cliente cliente) {

	log.info("Recebendo dados do cliente: ");
	log.info("Id: {}", cliente.getId());
	log.info("Nome: {}", cliente.getNome());
	log.info("CPF: {}", cliente.getCpf());
    }
}