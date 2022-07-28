/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acitividades_curso.cuenta_metodos;

/**
 *
 * @author Leon DeBurgh
 */
public class Metodos_Cta {

    public static void Ingresar(double cantidad) {
        if (cantidad >= 0) {
            cantidad += cantidad;
        }

    }

    public static void Girar(double cantidad, double giro) {
        if (cantidad > 0) {
            cantidad -= giro;
        }

    }

}
