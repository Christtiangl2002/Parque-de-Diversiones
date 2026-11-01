
package mx.uam.cua.parque.service.impl;

import mx.uam.cua.parque.entity.TemporadaEntity;
import mx.uam.cua.parque.repository.TemporadaRepository;
import mx.uam.cua.parque.service.TemporadaService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TemporadaServiceImpl implements TemporadaService {

    private final TemporadaRepository temporadaRepository;

    public TemporadaServiceImpl(TemporadaRepository temporadaRepository) {
        this.temporadaRepository = temporadaRepository;
    }

    @Override
    public TemporadaEntity save(TemporadaEntity temporada) {
        return temporadaRepository.save(temporada);
    }

    @Override
    public List<TemporadaEntity> findAll() {
        return temporadaRepository.findAll();
    }

    @Override
    public Optional<TemporadaEntity> findById(Integer id) {
        return temporadaRepository.findById(id);
    }

    @Override
    public TemporadaEntity update(Integer id, TemporadaEntity temporada) {
        TemporadaEntity existente = temporadaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Temporada no encontrada"));

        existente.setNombre(temporada.getNombre());
        existente.setFechaInicio(temporada.getFechaInicio());
        existente.setFechaFin(temporada.getFechaFin());
        existente.setEstado(temporada.getEstado());

        return temporadaRepository.save(existente);
    }

    @Override
    public void delete(Integer id) {
        TemporadaEntity existente = temporadaRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Temporada no encontrada"));

        temporadaRepository.delete(existente);
    }
}
