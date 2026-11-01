package mx.uam.cua.parque.service.impl;

import mx.uam.cua.parque.entity.TipoPaseEntity;
import mx.uam.cua.parque.repository.TipoPaseRepository;
import mx.uam.cua.parque.service.TipoPaseService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TipoPaseServiceImpl implements TipoPaseService {

    private final TipoPaseRepository tipoPaseRepository;

    public TipoPaseServiceImpl(TipoPaseRepository tipoPaseRepository) {
        this.tipoPaseRepository = tipoPaseRepository;
    }

    @Override
    public TipoPaseEntity save(TipoPaseEntity tipoPase) {
        return tipoPaseRepository.save(tipoPase);
    }

    @Override
    public List<TipoPaseEntity> findAll() {
        return tipoPaseRepository.findAll();
    }

    @Override
    public Optional<TipoPaseEntity> findById(Integer id) {
        return tipoPaseRepository.findById(id);
    }

    @Override
    public TipoPaseEntity update(Integer id, TipoPaseEntity tipoPase) {
        TipoPaseEntity existente = tipoPaseRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Tipo de pase no encontrado"));

        existente.setNombre(tipoPase.getNombre());
        existente.setModalidad(tipoPase.getModalidad());
        existente.setPrecio(tipoPase.getPrecio());
        existente.setNivel(tipoPase.getNivel());
        existente.setCategoria(tipoPase.getCategoria());

        return tipoPaseRepository.save(existente);
    }

    @Override
    public void delete(Integer id) {
        TipoPaseEntity existente = tipoPaseRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Tipo de pase no encontrado"));

        tipoPaseRepository.delete(existente);
    }
}