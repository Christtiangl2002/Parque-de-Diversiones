
package mx.uam.cua.parque.repository;

import mx.uam.cua.parque.entity.TemporadaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporadaRepository extends JpaRepository<TemporadaEntity, Integer> {
}
