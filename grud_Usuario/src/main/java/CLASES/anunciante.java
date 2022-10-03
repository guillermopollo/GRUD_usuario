/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author willy
 */
public class anunciante extends cliente {
        private int numeroAnuncios ;

    public anunciante(int numeroAnuncios, String correo_electronico, String pass, double descuentos) {
        super(correo_electronico, pass, descuentos);
        this.numeroAnuncios = numeroAnuncios;
    }

    public int getNumeroAnuncios() {
        return numeroAnuncios;
    }

    public void setNumeroAnuncios(int numeroAnuncios) {
        this.numeroAnuncios = numeroAnuncios;
    }
}
