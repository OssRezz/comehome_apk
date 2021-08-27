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
public class SedeDto {

    private int id_sede;
    private String nombre;
    private String direccion;
    private String telefono;
    private String aula;

    public SedeDto() {
    }

    public SedeDto(int id_sede, String nombre, String direccion, String telefono, String aula) {
        this.id_sede = id_sede;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.aula = aula;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

}
