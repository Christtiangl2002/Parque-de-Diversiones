package mx.uam.cua.parque.repository;

import mx.uam.cua.parque.entity.TipoPaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPaseRepository extends JpaRepository<TipoPaseEntity, Integer> {
}
