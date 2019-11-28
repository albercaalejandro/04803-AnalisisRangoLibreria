/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class UtilesPrimitivos {

    public static final int RANGE_IN = 0;
    public static final int RANGE_BELOW = 1;
    public static final int RANGE_ABOVE = 2;

    public static final int analizarRango(double num, double min, double max) {
        int ran;
        if (num < min) {
            ran = RANGE_BELOW;
        } else if (num > max) {
            ran = RANGE_ABOVE;
        } else {
            ran = RANGE_IN;
        }
        return ran;
    }

    public static final String analisis(int n) {
        String analisis = "0";
        switch (n) {
            case RANGE_IN:
                analisis = "Dentro";
                break;
            case RANGE_BELOW:
                analisis = "Fuera (Abajo)";
                break;
            case RANGE_ABOVE:
                analisis = "Fuera (Arriba)";
                break;
        }
        return analisis;
    }
}
