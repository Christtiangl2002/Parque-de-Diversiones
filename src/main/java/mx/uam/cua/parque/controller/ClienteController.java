
package mx.uam.cua.parque.controller;

import mx.uam.cua.parque.dto.ClienteDTO;
import mx.uam.cua.parque.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<ClienteDTO> findAll() {
        return clienteService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO save(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.save(clienteDTO);
    }
}
