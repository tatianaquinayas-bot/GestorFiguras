/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author 57323
 */
import Modelo.FiguraGeometrica;
import Modelo.Punto;
import Modelo.Rectangulo;

public class ControladorRectangulo {

    private Rectangulo rectangulo;

    public boolean crearRectangulo(double x1, double y1,
            double x2, double y2) {

        if (x1 == x2 || y1 == y2) {
            return false;
        }

        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);

        rectangulo = new Rectangulo(p1, p2);

        return true;
    }

    public boolean existeRectangulo() {
        return rectangulo != null;
    }

    public double calcularArea() {

        FiguraGeometrica figura = rectangulo;

        return figura.calcularArea();
    }

    public boolean puntoDentro(double x, double y) {

        double minX = Math.min(rectangulo.getPunto1().getX(),
                rectangulo.getPunto2().getX());

        double maxX = Math.max(rectangulo.getPunto1().getX(),
                rectangulo.getPunto2().getX());

        double minY = Math.min(rectangulo.getPunto1().getY(),
                rectangulo.getPunto2().getY());

        double maxY = Math.max(rectangulo.getPunto1().getY(),
                rectangulo.getPunto2().getY());

        boolean dentroX = (x >= minX && x <= maxX);
        boolean dentroY = (y >= minY && y <= maxY);

        if (!dentroX || !dentroY) {
            return false;
        }

        return true;
    }

    public void moverRectangulo(double dx, double dy) {

        FiguraGeometrica figura = rectangulo;

        figura.mover(dx, dy);
    }

    public boolean escalarRectangulo(double factor) {

        if (factor <= 0) {
            return false;
        }

        rectangulo.escalar(factor);

        return true;
    }

    public Punto obtenerPunto1() {
        return rectangulo.getPunto1();
    }

    public Punto obtenerPunto2() {
        return rectangulo.getPunto2();
    }

    public String mostrarDatos() {

        if (rectangulo == null) {
            return "Primero debes crear un rectangulo.";
        }

        return rectangulo.toString();
    }
}
