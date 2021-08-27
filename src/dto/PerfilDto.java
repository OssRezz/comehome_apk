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
public class PerfilDto {

    private int id_perfil;
    private String perfil;

    public PerfilDto() {
    }

    public  PerfilDto(int id_perfil, String perfil) {
        this.id_perfil = id_perfil;
        this.perfil = perfil;
    }

    
    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
