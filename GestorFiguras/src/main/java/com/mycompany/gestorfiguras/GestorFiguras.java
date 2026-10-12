/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorfiguras;

/**
 *
 * @author 57323
 */


import Controlador.ControladorRectangulo;
import Vista.VistaRectangulo;

public class GestorFiguras {

    public static void main(String[] args) {

        // Crear el controlador
        ControladorRectangulo controlador =
                new ControladorRectangulo();

        // Crear la vista
        VistaRectangulo vista = new VistaRectangulo();

        // Conectar vista y controlador
        vista.setControlador(controlador);

        // Mostrar la ventana
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
