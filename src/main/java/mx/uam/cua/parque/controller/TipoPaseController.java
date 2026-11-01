package mx.uam.cua.parque.controller;

import mx.uam.cua.parque.entity.TipoPaseEntity;
import mx.uam.cua.parque.service.TipoPaseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipos-pase")
public class TipoPaseController {

    private final TipoPaseService tipoPaseService;

    public TipoPaseController(TipoPaseService tipoPaseService) {
        this.tipoPaseService = tipoPaseService;
    }

    @GetMapping
    public List<TipoPaseEntity> findAll() {
        return tipoPaseService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoPaseEntity> findById(@PathVariable Integer id) {
        return tipoPaseService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TipoPaseEntity save(@RequestBody TipoPaseEntity tipoPase) {
        return tipoPaseService.save(tipoPase);
    }

    @PutMapping("/{id}")
    public TipoPaseEntity update(
            @PathVariable Integer id,
            @RequestBody TipoPaseEntity tipoPase) {
        return tipoPaseService.update(id, tipoPase);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        tipoPaseService.delete(id);
    }
}
