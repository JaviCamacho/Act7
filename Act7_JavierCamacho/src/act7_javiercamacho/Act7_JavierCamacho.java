/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7_javiercamacho;

import java.util.Scanner;

/**
 *
 * @author JaviCamacho
 */
public class Act7_JavierCamacho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int primo;
    System.out.println("Hasta que número primo deseas recorrer? ");
    primo = sc.nextInt();
    if(primo>0){
        int i = 2;
        while(i <= primo){
            int cont = 2;
            boolean esPrimo = true;
            while(esPrimo && cont < i){
                if(i%cont == 0){
                    esPrimo = false;
                }else{
                    cont++;
                }
            }
            if(esPrimo){
               System.out.println(i); 
            }
            i++;
        } 
    }
    int ini = 0; 
    int num = 1;
    int zero;
    int limite;
    System.out.println("Hasta que numero deseas hacer la serie de fibonacci?: ");
    limite = sc.nextInt();
    System.out.println(ini);
    System.out.println(num);
    
    while(num + ini <= limite){
        zero = ini;
        ini = num;
        num = zero + ini;
        System.out.println(num);
    }
    }
    
}
