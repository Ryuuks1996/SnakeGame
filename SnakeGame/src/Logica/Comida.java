/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Saaku
 */
public class Comida {
    private Rectangle rectangulo;
    private Punto ubicación;

    public Comida(Rectangle rectangulo, Punto ubicación) {
        this.rectangulo = rectangulo;
        this.ubicación = ubicación;
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
    
    
    
}
