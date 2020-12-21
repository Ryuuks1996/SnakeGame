/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Saaku
 */
public class Punto {
    private int Px;
    private int Py;

    public Punto(int Px, int Py) {
        this.Px = Px;
        this.Py = Py;
    }
    
     public Punto() {}

    public int getPx() {
        return Px;
    }

    public void setPx(int Px) {
        this.Px = Px;
    }

    public int getPy() {
        return Py;
    }

    public void setPy(int Py) {
        this.Py = Py;
    }


}
