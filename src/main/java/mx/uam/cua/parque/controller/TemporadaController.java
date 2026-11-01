
package mx.uam.cua.parque.controller;

import mx.uam.cua.parque.entity.TemporadaEntity;
import mx.uam.cua.parque.service.TemporadaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/temporadas")
public class TemporadaController {

    private final TemporadaService temporadaService;

    public TemporadaController(TemporadaService temporadaService) {
        this.temporadaService = temporadaService;
    }

    @GetMapping
    public List<TemporadaEntity> findAll() {
        return temporadaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TemporadaEntity> findById(@PathVariable Integer id) {
        return temporadaService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TemporadaEntity save(@RequestBody TemporadaEntity temporada) {
        return temporadaService.save(temporada);
    }

    @PutMapping("/{id}")
    public TemporadaEntity update(
            @PathVariable Integer id,
            @RequestBody TemporadaEntity temporada) {
        return temporadaService.update(id, temporada);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        temporadaService.delete(id);
    }
}
