
package mx.uam.cua.parque.service;

import mx.uam.cua.parque.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {

    ClienteDTO save(ClienteDTO clienteDTO);

    List<ClienteDTO> findAll();
}
