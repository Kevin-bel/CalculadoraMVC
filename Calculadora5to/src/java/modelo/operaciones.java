/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class operaciones {
    //zona de atributos
    public double primernumero, segundonumero;
    // zona de metodos
    public operaciones(double primernumero, double segundonumero) {
        this.primernumero = primernumero;
        this.segundonumero = segundonumero;
    }

    public double getPrimernumero() {
        return primernumero;
    }

    public void setPrimernumero(double primernumero) {
        this.primernumero = primernumero;
    }

    public double getSegundonumero() {
        return segundonumero;
    }

    public void setSegundonumero(double segundonumero) {
        this.segundonumero = segundonumero;
    }
    public double suma(double primernumero,double segundonumero)
    {
        return(primernumero+segundonumero);
    }
    public double resta(double primernumero,double segundonumero)
    {
        return(primernumero-segundonumero);
    }
    public double multiplica(double primernumero,double segundonumero)
    {
        return(primernumero*segundonumero);
    }
    public double divide(double primernumero,double segundonumero)
    {
        if(segundonumero==0){
            
         return(0);
        }else{
            
         return (primernumero/segundonumero); 
        }
    }
}
