/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author willy
 */
public class cliente  {
     private String correo_electronico;
    private String pass;
    private double descuentos;

    public cliente(String correo_electronico, String pass, double descuentos) {
        this.correo_electronico = correo_electronico;
        this.pass = pass;
        this.descuentos = descuentos;
    }

    public cliente() {
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public String getPass() {
        return pass;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }
    
    @Override public String toString()
{
String mensaje = "Correo:"+correo_electronico+"\nPass: "+pass+"\nDescuento: "+descuentos; return mensaje;
}
}
