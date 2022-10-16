
package com.mycompany.examen;

import java.util.Scanner;

interface AdvancedArithmetic{
 int divisor_sum(int n);
}

//código escrito, immpleneta interfaz y funcion para sumar divisores
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n)
    {
        int sum = 0;
        for(int i = 1 ; i <=n ; i++){
            if(n%i==0){
                //sumar divisores
                sum+=i;
            }
        }
        return sum;
    }
}


public class Solution {
     public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("la suma total es: "+my_calculator.divisor_sum(n) + "\n");
        sc.close();
        }
        /*
        * ImplementedInterfaceNames method takes an object and prints t
       he name of the interfaces it implemented
        */
        static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
        String interfaceName = theInterfaces[i].getName();
        System.out.println(interfaceName);
        }
 }
}