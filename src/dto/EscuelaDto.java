/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author james
 */
public class EscuelaDto {

    private int id_escuela;
    private String escuela;

    public EscuelaDto() {
    }

    public EscuelaDto(int id_escuela, String escuela) {
        this.id_escuela = id_escuela;
        this.escuela = escuela;
    }

    public int getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

}
