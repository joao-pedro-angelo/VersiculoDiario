package com.abibliadigital.consumir.api.services;

import com.abibliadigital.consumir.api.infra.feignClient.BibliaDigitalClient;
import com.abibliadigital.consumir.api.models.versiculos.VersiculoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersiculoService {

    @Autowired
    private BibliaDigitalClient client;
    @Autowired
    private WhatsappService whatsappService;

    public VersiculoDTO versiculo(){
        return this.client.retornaVersiculo();
    }

    public void enviarVersiculoParaUsuario(String numero){
        VersiculoDTO versiculo = this.versiculo();
        String mensagem = "Versículo do Dia:\n" +
                "Capítulo: " + versiculo.chapter() + "\n" +
                "Número: " + versiculo.number() + "\n" +
                "Texto: " + versiculo.text();
        this.whatsappService.enviarMensagem(numero, mensagem);
    }
}
