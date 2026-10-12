/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author 57323
 */

public class Rectangulo extends FiguraGeometrica {

    private Punto punto1;
    private Punto punto2;

    // Constructor
    public Rectangulo(Punto punto1, Punto punto2) {

        this.punto1 = new Punto(punto1.getX(), punto1.getY());
        this.punto2 = new Punto(punto2.getX(), punto2.getY());
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    // Calcular base
    public double calcularBase() {
        return Math.abs(punto2.getX() - punto1.getX());
    }

    // Calcular altura
    public double calcularAltura() {
        return Math.abs(punto2.getY() - punto1.getY());
    }

    // Sobreescritura: calcular area
    @Override
    public double calcularArea() {
        return calcularBase() * calcularAltura();
    }

    // Sobreescritura: mover el rectangulo
    @Override
    public void mover(double desplazamientoX,
                      double desplazamientoY) {

        punto1 = new Punto(
                punto1.getX() + desplazamientoX,
                punto1.getY() + desplazamientoY);

        punto2 = new Punto(
                punto2.getX() + desplazamientoX,
                punto2.getY() + desplazamientoY);
    }

    // Escalar el rectangulo
    public void escalar(double factor) {

        double nuevaX2 = punto1.getX()
                + (punto2.getX() - punto1.getX()) * factor;

        double nuevaY2 = punto1.getY()
                + (punto2.getY() - punto1.getY()) * factor;

        punto2 = new Punto(nuevaX2, nuevaY2);
    }

    // Mostrar informacion
    @Override
    public String toString() {

        return "Vertice 1: " + punto1
                + "\nVertice 2: " + punto2
                + "\nBase: " + calcularBase()
                + "\nAltura: " + calcularAltura()
                + "\nArea: " + calcularArea();
    }
}
