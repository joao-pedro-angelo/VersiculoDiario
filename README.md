# Versículo do Dia

> Consumo da API: https://www.abibliadigital.com.br/<br>
> Envio via whatsapp por meio do Twilio: https://www.twilio.com/docs/whatsa<br>

---
## Funcionalidades

- Suporte para envio de versículos via WhatsApp: [Visão do Celular](https://drive.google.com/file/d/1ZdrbYJoiNvcCPhC4-FKVDZNuzB8nJh4b/view?usp=sharing)<br>
- Geração aleatória de versículos da Bíblia: [Vídeo Demonstração](https://drive.google.com/file/d/1-xF_-mGCkj_RDRwQqlsxfCe0Wlz2uWRq/view?usp=sharing)

---
## Como Usar

### Configuração

Crie uma conta em: https://www.twilio.com/en-us<br>
Após criar a conta (free), você receberá os itens necessários para configurar.<br>
Certifique-se de configurar corretamente as credenciais do Twilio no arquivo `application.properties`.

```properties
twilio.account_sid=SEU_ACCOUNT_SID
twilio.auth_token=SUA_AUTH_TOKEN
twilio.whatsapp_number=SEU_NUMERO_TWILIO
```

> Caso o número twilio gerado após criar sua conta não esteja funcionando, use: +14155238886

### Execução

Execute a classe principal `Application`;<br>
Para gerar um versículo aleatório, acesse a url: `http://localhost:8080/versiculos`;<br>
Para enviar o versículos via whatsapp, acesse a url: `http://localhost:8080/versiculos/{whatsappNumero}`

> Observação: O número de whatsapp deve estar no formato +CodigoPaisDDDNumero<br>
> Exemplo: +558392345678 (sem o 9 extra)

### Permissão

A API Twilio precisa de permisão para enviar a mensagem para o whatsapp.<br>
Para receber o versículo do dia via WhatsApp, envie uma mensagem para o número +14155238886 com o conteúdo `join generally-nine`.<br>
Isso permitirá que a API do Twilio se comunique com o seu número.
