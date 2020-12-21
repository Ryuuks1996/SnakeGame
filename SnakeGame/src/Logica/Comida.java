/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import com.sun.javafx.geom.Rectangle;
import javafx.scene.paint.Color;

/**
 *
 * @author Saaku
 */
public class Comida {
    private Rectangle rectangulo;
    private Punto ubicación;
    private Color Blue;

    public Comida(Rectangle rectangulo, Punto ubicación, Color Blue) {
        this.rectangulo = rectangulo;
        this.ubicación = ubicación;
        this.Blue = Blue;
    }

    public Comida() {}

    public Rectangle getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(Rectangle rectangulo) {
        this.rectangulo = rectangulo;
    }

    public Punto getUbicación() {
        return ubicación;
    }

    public void setUbicación(Punto ubicación) {
        this.ubicación = ubicación;
    }

    public Color getBlue() {
        return Blue;
    }

    public void setBlue(Color Blue) {
        this.Blue = Blue;
    }
    
    
    
}
