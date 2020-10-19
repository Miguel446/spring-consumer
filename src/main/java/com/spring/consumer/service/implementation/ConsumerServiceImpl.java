package com.spring.consumer.service.implementation;

import org.springframework.stereotype.Service;

import com.spring.consumer.dto.Message;
import com.spring.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void action(Message message) throws Exception {
		System.out.println("Uma nova mensagem foi recebida!");
		System.out.println(message.getText());
	}

}
