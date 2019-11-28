/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Alejandro Alberca Gallardo <alejandro.alberca.alum@iescamp.es>
 */
public class App {

    public static final String TITULO = "ANÁLISIS DE RANGO";
    public static final String LINEAS = "=================";
    public static final String NUMERO = "Número ......: ";
    public static final String MAXIMO = "Mínimo ......: ";
    public static final String MINIMO = "Máximo ......: ";
    public static final String LINEA = "---";
    public static final String ANALISIS = "Análisis ....: ";

    public static final int NUM = 2;
    public static final int MIN = 1;
    public static final int MAX = 10;

    public final void launchApp() {
        System.out.println(TITULO);
        System.out.println(LINEAS);
        System.out.println(NUMERO+NUM);
        System.out.println(LINEA);
        System.out.println(MINIMO+MIN);
        System.out.println(MAXIMO+MAX);
        System.out.println(LINEA);
        System.out.println(ANALISIS+ UtilesPrimitivos.analisis
        (UtilesPrimitivos.analizarRango(NUM, MIN, MAX)));
    }
}
