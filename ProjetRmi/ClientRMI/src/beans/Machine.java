/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author kholo
 */

public class Machine implements Serializable {

  
    private int id;
    private String ref;
    private String marque;
    private double prix;
    private Salle salle;

    public Machine() {
    }

    public Machine(String ref, String marque, double prix) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
    }

    public Machine(String ref, String marque, double prix, Salle salle) {
        this.ref = ref;
        this.marque = marque;
        this.prix = prix;
        this.salle = salle;
    }
    

    public int getId() {
        return id;
    }

    public String getRef() {
        return ref;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Salle getSalle() {
        return salle;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", ref=" + ref + ", marque=" + marque + ", prix=" + prix + '}';
    }

}
