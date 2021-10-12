/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageOne;

/**
 *
 * @author loidl
 */
public class main {

    public static void main(String[] args) {
        int obergrenze = 100000;
        
        EratosthenesPrimeSieve ePS = new EratosthenesPrimeSieve(obergrenze);
        
        
        /*for (int i = 0; i < obergrenze; i++) {
            System.out.println(primzahlen[i]);
        }*/
        
        System.out.println("Primzahlen bis: " + obergrenze + " ausgegeben:");
        
        ePS.printPrimes();
        
        System.out.println(" ");
        System.out.println("--------------------------------------");
        System.out.println(" ");
        
        int eingabePrimzahl = 101;
        
        if (ePS.isPrime(eingabePrimzahl)) { //==true
            System.out.println(eingabePrimzahl + " ist eine Primzahl");
        }
        else{
            System.out.println(eingabePrimzahl + " ist keine Primzahl");
        }
        System.out.println(" ");
        System.out.println("----------");
        System.out.println(" ");
        

        for (int p = 4; p < eingabePrimzahl; p+=2) {
            int [] arr = ePS.printAufG2(p);

            System.out.println(arr[0] + " + " +arr[1]  + " = " + p);
       }
    }
    
}
