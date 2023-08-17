/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumaresta;

/**
 *
 * @author Alumno
 */
public class SumaResta {

    public static void main(String[] args) {
        System.out.println("suma y resta ");
        int a = 5;
        int b = 3;
        
        int suma = sumar(a,b);
        int resta = restar(a,b);
        
        System.out.println("la suma es : " + suma);
        System.out.println("la resta es: " + resta);
             
    }
    public static int sumar(int a , int b){
        return a+b;
    }
}
