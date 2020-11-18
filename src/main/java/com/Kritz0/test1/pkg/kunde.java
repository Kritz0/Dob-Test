package com.Kritz0.test1.pkg;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Kunde")
@Table(name="Kunde")
public class kunde {
    @Id
    @Column(name="id_Kunde")
    private Integer idKunde;
    @Column(name="vorname")
    private String vorname;
    @Column(name="nachname")
    private String nachname;
    @Column(name="rechnung")
    private Integer rechnung;
    @OneToMany(mappedBy="kunde", cascade=CascadeType.ALL)
    private List<rechnung> getRechnungen;

    public kunde(Integer idKunde, String vorname, String nachname, Integer rechnung,
                 List<com.Kritz0.test1.pkg.rechnung> getWork) {
        super();
        this.idKunde = idKunde;
        this.vorname = vorname;
        this.nachname = nachname;
        this.rechnung = rechnung;
        this.getRechnungen = getWork;
    }

    public Integer getIdKunde() {
        return idKunde;
    }

    public void setIdKunde(Integer idKunde) {
        this.idKunde = idKunde;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Integer getRechnung() {
        return rechnung;
    }

    public void setRechnung(Integer rechnung) {
        this.rechnung = rechnung;
    }

    public List<rechnung> getGetWork() {
        return getRechnungen;
    }

    public void setGetWork(List<rechnung> getWork) {
        this.getRechnungen = getWork;
    }

    @Override
    public String toString() {
        return "kunde [idKunde=" + idKunde + ", vorname=" + vorname + ", nachname=" + nachname + ", rechnung="
                + rechnung + ", getRechnungen=" + getRechnungen + "]";
    }

}
