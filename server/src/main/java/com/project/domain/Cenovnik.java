package com.project.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Cenovnik implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Temporal(TemporalType.DATE)
    private Date datumVazenja;

    @ManyToOne
    @JoinColumn(name = "valuta_id", nullable = false)
    private  Valuta valuta;

    @ManyToOne
    @JoinColumn(name = "preduzece_id", nullable = false)
    private Preduzece preduzece;

    @OneToMany(mappedBy = "cenovnik")
    private List<StavkaCenovnika> stavkaCenovnikaList;

    public Cenovnik() {
    }

    public Cenovnik(Long id, Date datumVazenja) {
        this.id = id;
        this.datumVazenja = datumVazenja;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public Preduzece getPreduzece() {
        return preduzece;
    }

    public void setPreduzece(Preduzece preduzece) {
        this.preduzece = preduzece;
    }

    public List<StavkaCenovnika> getStavkaCenovnikaList() {
        return stavkaCenovnikaList;
    }

    public void setStavkaCenovnikaList(List<StavkaCenovnika> stavkaCenovnikaList) {
        this.stavkaCenovnikaList = stavkaCenovnikaList;
    }

    public Date getDatumVazenja() {
        return datumVazenja;
    }

    public void setDatumVazenja(Date datumVazenja) {
        this.datumVazenja = datumVazenja;
    }
}
