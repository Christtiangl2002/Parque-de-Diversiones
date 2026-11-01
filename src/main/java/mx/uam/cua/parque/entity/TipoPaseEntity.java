package mx.uam.cua.parque.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tipo_pase")
public class TipoPaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_pase")
    private Integer idTipoPase;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "modalidad", nullable = false, length = 20)
    private String modalidad;

    @Column(name = "precio", nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(name = "nivel")
    private Integer nivel;

    @Column(name = "categoria", nullable = false, length = 20)
    private String categoria;

    public Integer getIdTipoPase() {
        return idTipoPase;
    }

    public void setIdTipoPase(Integer idTipoPase) {
        this.idTipoPase = idTipoPase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
