package mx.uam.cua.parque.mapper;

import mx.uam.cua.parque.dto.ClienteDTO;
import mx.uam.cua.parque.entity.ClienteEntity;

public interface ClienteMapper {

    ClienteEntity toClienteEntity(ClienteDTO clienteDTO);

    ClienteDTO toClienteDTO(ClienteEntity clienteEntity);
}
