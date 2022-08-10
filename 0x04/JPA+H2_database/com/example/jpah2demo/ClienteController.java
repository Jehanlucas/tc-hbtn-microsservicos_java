package com.example.jpah2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/addClient")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
        Cliente _cliente = clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(_cliente);
    }

    @GetMapping("/findAllClients")
    public ResponseEntity<List<Cliente>> findAllClients() {
        List<Cliente> clientes = clienteRepository.findAll();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/findClientById/{id}")
    public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
        Optional<Cliente> clienteData = clienteRepository.findById(idClient);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteData.get());
    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient) {
        clienteRepository.deleteById(idClient);
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente) {
        Optional<Cliente> clienteData = clienteRepository.findById(id);
        if (clienteData.isPresent()) {
            Cliente _cliente = clienteData.get();

            _cliente.setNome(cliente.getNome());
            _cliente.setEmail(cliente.getEmail());

            clienteRepository.save(_cliente);
        }
    }
}