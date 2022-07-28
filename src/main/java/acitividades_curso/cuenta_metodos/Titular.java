/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acitividades_curso.cuenta_metodos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Leon DeBurgh
 */
public class Titular {

    private String Names;
    private double cantidad;
    private double giro;
    public Scanner Entrada = new Scanner(System.in).useLocale(Locale.ENGLISH);
    public Titular(String Names, double cantidad, double giro) {
        
        this.Names = Names;
        this.cantidad = cantidad;
        this.giro = giro;
        System.out.println("Bienvenido al Banco Imaginario");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Ingrese su Nombre :");
        Names = Entrada.nextLine();
        System.out.println("Ingrese Saldo de Apertura de Cuenta :");
        cantidad=Entrada.nextDouble();
        System.out.println("Ingrese Giro de Cuenta :");
        giro=Entrada.nextDouble();        
        
        Metodos_Cta.Ingresar(cantidad);
        Metodos_Cta.Girar(cantidad, giro);
        
        System.out.println("        Estado de Resultado de la Cuenta");
        System.out.println("----------------------------------------------------");
        
        if(cantidad-giro>=0){
            System.out.println("Titular de la Cuenta :   "+Names);
            System.out.println("Dinero de Apertura   : $ "+(cantidad));
            System.out.println("Giros de Dinero      : $ "+(giro));
            System.out.println("----------------------------------------------------");
            System.out.println("Saldo en Cuenta      : $ "+(cantidad-giro));
        }else{
            System.out.println("Estimado "+Names+" No tienes saldo suficiente para la transacción.");
            System.out.println("Solicita tu línea de crédito a una tasa 10,8%.");
        }
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String Names) {
        this.Names = Names;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }
  
          
    
        
        
}
    
    

