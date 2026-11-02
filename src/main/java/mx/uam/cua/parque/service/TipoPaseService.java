package mx.uam.cua.parque.service;

import mx.uam.cua.parque.entity.TipoPaseEntity;
import java.util.List;
import java.util.Optional;

public interface TipoPaseService {

    TipoPaseEntity save(TipoPaseEntity tipoPase);

    List<TipoPaseEntity> findAll();

    Optional<TipoPaseEntity> findById(Integer id);

    TipoPaseEntity update(Integer id, TipoPaseEntity tipoPase);

    void delete(Integer id);
}