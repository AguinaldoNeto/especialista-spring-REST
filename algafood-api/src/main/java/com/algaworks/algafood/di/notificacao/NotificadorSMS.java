package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando o %s por SMS através do telefone %s: usando o SMTP %S: %s%n",
                cliente.getNome(),
                cliente.getTelefone(),
                mensagem);
    }
}
