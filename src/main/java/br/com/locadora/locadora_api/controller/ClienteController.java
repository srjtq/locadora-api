package br.com.locadora.api.controller;

import br.com.locadora.api.entity.Cliente;
import br.com.locadora.api.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    // READ - listar todos
    @GetMapping
    public List<Cliente> listar() {
        return service.listarTodos();
    }

    // READ - buscar por id
    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id,
                             @RequestBody Cliente cliente) {
        return service.atualizar(id, cliente);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
