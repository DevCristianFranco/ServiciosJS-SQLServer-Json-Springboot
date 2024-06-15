package com.pruebacv.workbackend.DatabaseEntity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Revision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numRevision;

    private boolean cambioAceite;
    private boolean cambioLlantas;
    private boolean cambioColor;

    // Getters y setters

    public int getNumRevision() {
        return numRevision;
    }

    public void setNumRevision(int numRevision) {
        this.numRevision = numRevision;
    }

    public boolean isCambioAceite() {
        return cambioAceite;
    }

    public void setCambioAceite(boolean cambioAceite) {
        this.cambioAceite = cambioAceite;
    }

    public boolean isCambioLlantas() {
        return cambioLlantas;
    }

    public void setCambioLlantas(boolean cambioLlantas) {
        this.cambioLlantas = cambioLlantas;
    }

    public boolean isCambioColor() {
        return cambioColor;
    }

    public void setCambioColor(boolean cambioColor) {
        this.cambioColor = cambioColor;
    }
}