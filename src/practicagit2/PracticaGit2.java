/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit2;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class PracticaGit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radio;
        int area;
        
        System.out.println("Hola Mundo");
        Scanner sc=new Scanner (System.in);
        System.out.println("El radio del circulo es: ");
        radio=sc.nextInt();
        area=(int)(Math.PI*(Math.pow(radio, 2)));
        System.out.println("El resultado es: "+area);
        
    }
    
}
