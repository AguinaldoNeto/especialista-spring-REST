package com.algaworks.algafood;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService service;

    public MeuPrimeiroController(AtivacaoClienteService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente cliente = new Cliente("Neto", "neto@email", "4499999-8888");

        service.ativar(cliente);
        return cliente.getNome();
    }
}
