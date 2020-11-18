package com.Kritz0.test1.pkg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="Kechnung")
@Table(name="Rechnung")
public class rechnung {
    @Id
    @Column(name="id_Rechnungsnummer")
    private Integer idRechnungsnummer;
    @Column(name="rechnungsDatum")
    private String rechnungsDatum;
    @Column(name="rechnungsBetrag")
    private Integer rechnungsBetrag;
    @Column(name="kunde")
    private Integer kunde;
    @ManyToOne
    @JoinColumn(name = "rechnung", insertable=false, updatable=false)
    public kunde getKunde;

    public rechnung(Integer idRechnungsnummer, String rechnungsDatum, Integer rechnungsBetrag, Integer kunde,
                    com.Kritz0.test1.pkg.kunde getKunde) {
        super();
        this.idRechnungsnummer = idRechnungsnummer;
        this.rechnungsDatum = rechnungsDatum;
        this.rechnungsBetrag = rechnungsBetrag;
        this.kunde = kunde;
        this.getKunde = getKunde;
    }

    public Integer getIdRechnungsnummer() {
        return idRechnungsnummer;
    }

    public void setIdRechnungsnummer(Integer idRechnungsnummer) {
        this.idRechnungsnummer = idRechnungsnummer;
    }

    public String getRechnungsDatum() {
        return rechnungsDatum;
    }

    public void setRechnungsDatum(String rechnungsDatum) {
        this.rechnungsDatum = rechnungsDatum;
    }

    public Integer getRechnungsBetrag() {
        return rechnungsBetrag;
    }

    public void setRechnungsBetrag(Integer rechnungsBetrag) {
        this.rechnungsBetrag = rechnungsBetrag;
    }

    public Integer getKunde() {
        return kunde;
    }

    public void setKunde(Integer kunde) {
        this.kunde = kunde;
    }

    public kunde getGetKunde() {
        return getKunde;
    }

    public void setGetKunde(kunde getKunde) {
        this.getKunde = getKunde;
    }

    @Override
    public String toString() {
        return "rechnung [idRechnungsnummer=" + idRechnungsnummer + ", rechnungsDatum=" + rechnungsDatum
                + ", rechnungsBetrag=" + rechnungsBetrag + ", kunde=" + kunde + ", getKunde=" + getKunde + "]";
    }

}
