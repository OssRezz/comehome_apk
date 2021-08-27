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
public class UsuarioDto {

    private String cedula;
    private String nombre;
    private String password;
    private int perfil;
    private PerfilDto perfilDto;

    public UsuarioDto() {
    }

    public UsuarioDto(String cedula, String nombre, String password, int perfil) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.password = password;
        this.perfil = perfil;
    }

    public UsuarioDto(String cedula, String nombre, String password, PerfilDto perfilDto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.password = password;
        this.perfilDto = perfilDto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PerfilDto getPerfilDto() {
        return perfilDto;
    }

    public void setPerfilDto(PerfilDto perfilDto) {
        this.perfilDto = perfilDto;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

}
