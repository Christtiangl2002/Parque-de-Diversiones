
package mx.uam.cua.parque.service.impl;

import mx.uam.cua.parque.dto.ClienteDTO;
import mx.uam.cua.parque.entity.ClienteEntity;
import mx.uam.cua.parque.mapper.ClienteMapper;
import mx.uam.cua.parque.repository.ClienteRepository;
import mx.uam.cua.parque.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteMapper clienteMapper;
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(
            ClienteMapper clienteMapper,
            ClienteRepository clienteRepository) {
        this.clienteMapper = clienteMapper;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteDTO save(ClienteDTO clienteDTO) {

        ClienteEntity clienteEntity =
                clienteMapper.toClienteEntity(clienteDTO);

        clienteEntity = clienteRepository.save(clienteEntity);

        return clienteMapper.toClienteDTO(clienteEntity);
    }

    @Override
    public List<ClienteDTO> findAll() {

        List<ClienteEntity> clienteEntities =
                clienteRepository.findAll();

        List<ClienteDTO> clienteDTOs = new ArrayList<>();

        for (ClienteEntity clienteEntity : clienteEntities) {
            clienteDTOs.add(
                    clienteMapper.toClienteDTO(clienteEntity)
            );
        }

        return clienteDTOs;
    }

    @Override
    public Optional<ClienteDTO> findById(Integer id) {

        return clienteRepository.findById(id)
                .map(clienteMapper::toClienteDTO);
    }
}
    
