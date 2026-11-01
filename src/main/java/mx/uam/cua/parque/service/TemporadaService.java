
package mx.uam.cua.parque.service;

import mx.uam.cua.parque.entity.TemporadaEntity;
import java.util.List;
import java.util.Optional;

public interface TemporadaService {

    TemporadaEntity save(TemporadaEntity temporada);

    List<TemporadaEntity> findAll();

    Optional<TemporadaEntity> findById(Integer id);

    TemporadaEntity update(Integer id, TemporadaEntity temporada);

    void delete(Integer id);
}
