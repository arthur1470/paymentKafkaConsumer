package br.com.payment.consumer.consumer;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import br.com.payment.PaymentBankSlip;
import br.com.payment.PaymentCreditCard;
import br.com.payment.PaymentPix;

@Component
@KafkaListener(topics = {"${credit.card.payment}", "${pix.payment}", "${bank.slip.payment}"})
public class PaymentConsumer {

	
	@KafkaHandler
	public void consumerPix(PaymentPix paymentPix, Acknowledgment ack) {
		System.out.println(paymentPix);
		
		ack.acknowledge();
	}
	
	@KafkaHandler
	public void consumerPix(PaymentCreditCard paymentCreditCard, Acknowledgment ack) {
		System.out.println(paymentCreditCard);
		
		ack.acknowledge();
	}
	
	@KafkaHandler
	public void consumerPix(PaymentBankSlip paymentBankSlip, Acknowledgment ack) {
		System.out.println(paymentBankSlip);
		
		ack.acknowledge();
	}
}
