package com.abibliadigital.consumir.api.services;

import com.abibliadigital.consumir.api.infra.config.TwilioConfig;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WhatsappService {

    @Autowired
    private TwilioConfig config;

    public void enviarMensagem(String destinatario, String mensagem) {
        Twilio.init(this.config.getACCOUNT_SID(), this.config.getAUTH_TOKEN());

        Message.creator(
                        new com.twilio.type.PhoneNumber("whatsapp:" + destinatario),
                        new com.twilio.type.PhoneNumber("whatsapp:" + this.config.getWHATSAPP_NUMBER()),
                        mensagem)
                .create();
    }
}
