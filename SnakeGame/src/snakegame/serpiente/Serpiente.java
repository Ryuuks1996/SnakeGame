/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.serpiente;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 *
 * @author ckill
 */
public class Serpiente {
    private double posicionX;
    private double posicionY;
    private int porteSerpiente=3;
    private ArrayList<Rectangle> partesSerpiente = new ArrayList<>();
    public static int anchoSerpiente=20;

    public Serpiente(double posicionX, double posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public int getPorteSerpiente() {
        return porteSerpiente;
    }

    public void setPorteSerpiente(int porteSerpiente) {
        this.porteSerpiente = porteSerpiente;
    }

    public ArrayList<Rectangle> getPartesSerpiente() {
        return partesSerpiente;
    }

    public void setPartesSerpiente(ArrayList<Rectangle> partesSerpiente) {
        this.partesSerpiente = partesSerpiente;
    }
    
    
}
