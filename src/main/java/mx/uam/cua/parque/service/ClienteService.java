
package mx.uam.cua.parque.service;

import mx.uam.cua.parque.dto.ClienteDTO;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    ClienteDTO save(ClienteDTO clienteDTO);

    List<ClienteDTO> findAll();

    Optional<ClienteDTO> findById(Integer id);

    ClienteDTO update(Integer id, ClienteDTO clienteDTO);

    void delete(Integer id);
}
