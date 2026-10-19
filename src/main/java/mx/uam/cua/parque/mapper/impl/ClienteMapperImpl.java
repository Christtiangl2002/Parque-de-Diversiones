package mx.uam.cua.parque.mapper.impl;

import mx.uam.cua.parque.dto.ClienteDTO;
import mx.uam.cua.parque.entity.ClienteEntity;
import mx.uam.cua.parque.mapper.ClienteMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteEntity toClienteEntity(ClienteDTO clienteDTO) {
        ClienteEntity clienteEntity = new ClienteEntity();

        BeanUtils.copyProperties(clienteDTO, clienteEntity);

        return clienteEntity;
    }

    @Override
    public ClienteDTO toClienteDTO(ClienteEntity clienteEntity) {
        ClienteDTO clienteDTO = new ClienteDTO();

        BeanUtils.copyProperties(clienteEntity, clienteDTO);

        return clienteDTO;
    }
}