/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;
public class MainCalculadora {
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        int opc=0;
        int num1, num2, resultado=0;
        Calculadora obj =new Calculadora();
        do
        {
            System.out.println("Calculadora muy basica");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicacion");
            System.out.println("4.- Division");
            System.out.println("5.- Elevar");
            opc = scan.nextInt();
        }while (opc <1 || opc >5 );
                
                    System.out.println("Teclea un numero");
                
        num1=scan.nextInt();
        System.out.println("Teclea otro numero");
        num2=scan.nextInt();
        switch (opc)
        {
            case 1:
                resultado = obj.sumar(num1, num2);
                break;
            case 2:
                resultado = obj.restar(num1, num2);
                break;
            case 3:
                resultado= obj.multiplicar(num1, num2);
                break;
            case 4:
                resultado=obj.dividir(num1, num2);
                break;
            default:
                resultado= obj.elevar(num1, num2);
        }
        System.out.println("El resultado es " + resultado);
    }
    
}
