# Versículo do Dia

Este é um projeto que tem como objetivo enviar um versículo da Bíblia por dia para os usuários cadastrados.

---
## Funcionalidades

- Envio diário de um versículo da Bíblia para os usuários cadastrados.
- Suporte para envio de versículos via WhatsApp.

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

### Execução

Para executar o projeto, você pode usar a classe principal `VersiculoDoDiaApplication` e acessar a URL:
```bash
http://localhost:8080/versiculos/seuNumero
```

### Uso

Para receber o versículo do dia via WhatsApp, envie uma mensagem para o número +14155238886 com o conteúdo `join generally-nine`.
