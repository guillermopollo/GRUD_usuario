/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author willy
 */
public class usuario extends cliente  {

    public usuario(boolean premium, String correo_electronico, String pass, double descuentos) {
        super(correo_electronico, pass, descuentos);
        this.premium = premium;
    }

    public boolean getPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    private boolean premium;

    public usuario() {
    }
    @Override public String toString()
    {
    String mensaje= super.toString()+"\nPremium:"+ premium; return mensaje;
    
    }
    
    
}
