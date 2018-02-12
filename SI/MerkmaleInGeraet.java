package com.spirittesting.spiritinventory.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Objects;

import com.spirittesting.spiritinventory.domain.enumeration.Verfuegbarkeit;

/**
 * A Geraet.
 */
@Document(collection = "inv_geraet")
public class Geraet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    
    // mongodb Map<String,String>
    @Field("markmale")
    private HashMap<String,String> merkmale = new HashMap<String, String>();

    @NotNull
    @Field("type")
    private String type;

    @NotNull
    @Field("standort")
    private String standort;

    @NotNull
    @Field("verfuegbarkeit")
    private Verfuegbarkeit verfuegbarkeit;

    @JsonIgnore
    private Set<Eigenschaft> eigenschaftens = new HashSet<>();

    @NotNull
    private User user;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    // getter setter for merkmale
    

    public HashMap<String,String> getMerkmale() {
        return merkmale;
    }

    public Geraet merkmale(HashMap<String,String> merkmale) {
        this.merkmale = merkmale;
        return this;
    }

    public Geraet addMerkmale(String key, String value) {
        this.merkmale.put(key, value);
        return this;
    }

    public Geraet removeMerkmal(String key) {
        this.merkmale.remove(key);
        return this;
    }

    public void setMerkmale(HashMap<String,String> merkmale) {
        this.merkmale = merkmale;
    }
    
    //

    public String getType() {
        return type;
    }

    public Geraet type(String type) {
        this.type = type;
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStandort() {
        return standort;
    }

    public Geraet standort(String standort) {
        this.standort = standort;
        return this;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public Verfuegbarkeit getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    public Geraet verfuegbarkeit(Verfuegbarkeit verfuegbarkeit) {
        this.verfuegbarkeit = verfuegbarkeit;
        return this;
    }

    public void setVerfuegbarkeit(Verfuegbarkeit verfuegbarkeit) {
        this.verfuegbarkeit = verfuegbarkeit;
    }

    public Set<Eigenschaft> getEigenschaftens() {
        return eigenschaftens;
    }

    public Geraet eigenschaftens(Set<Eigenschaft> eigenschafts) {
        this.eigenschaftens = eigenschafts;
        return this;
    }

    public Geraet addEigenschaften(Eigenschaft eigenschaft) {
        this.eigenschaftens.add(eigenschaft);
        eigenschaft.setGeraet(this);
        return this;
    }

    public Geraet removeEigenschaften(Eigenschaft eigenschaft) {
        this.eigenschaftens.remove(eigenschaft);
        eigenschaft.setGeraet(null);
        return this;
    }

    public void setEigenschaftens(Set<Eigenschaft> eigenschafts) {
        this.eigenschaftens = eigenschafts;
    }

    public User getUser() {
        return user;
    }

    public Geraet user(User user) {
        this.user = user;
        return this;
    }

    public void setUser(User user) {
        this.user = user;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Geraet geraet = (Geraet) o;
        if (geraet.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), geraet.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Geraet{" +
            "id=" + getId() +
            ", type='" + getType() + "'" +
            ", standort='" + getStandort() + "'" +
            ", verfuegbarkeit='" + getVerfuegbarkeit() + "'" +
            "}";
    }
}
