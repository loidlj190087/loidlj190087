/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageOne;

/**1111111
 *
 * @author loidl
 */
public class EratosthenesPrimeSieve implements PrimeSieve{
    private int obergrenze;
    
        
    public EratosthenesPrimeSieve(int pObergrenze){
        this.obergrenze = pObergrenze;
    }
    
    public boolean [] berechnePrimZahlenBoolean(){
             

        boolean [] primzahl = new boolean[this.obergrenze];
        
        

        for (int i = 1; i < this.obergrenze; i++) {
            //primzahl[i] = i%2==1;     //<-- die gerade Zahlen werden gestrichen
            
            if (i%2==1) {
                primzahl[i] = true;
            }
            else{                       //unötig
                primzahl[i] = false;    //unötig    alle die false sind sind dementsprechend gerade Zahlen
            }                           //unötig
        } 
        
        for (int i = 3; i <= (Math.sqrt(this.obergrenze)); i +=2) {    //die ungeraden Zahlen werden jtz gestrichen
            if(primzahl[i]){ //(primzahl[i] == true)
                for (int j = i; j <= this.obergrenze/i; j++) {
                    int zahl = i*j;

                    if (zahl < this.obergrenze) {
                        primzahl[zahl] = false;
                    }
                }
            }
        }
        
        
        
        return primzahl;        //boolean array mit Primzahlen wird zurückgegeben
    }
    
    public int [] berechnePrimzahlenInt(boolean[] pPrimzahl){
        int count = 0;
        
        for (int i = 0; i < pPrimzahl.length; i++) {
            if (pPrimzahl[i] == true) {
                count++;
            }
        }
        
        int [] primzahlen = new int[count];
        int number = 0;
        
        
        for (int i = 1; i < this.obergrenze; i++) {
            if (pPrimzahl[i] == true) {
                primzahlen[number] = i;
                number ++;
            }
        }
        primzahlen[0] = 2;
        return primzahlen;
    }
    
    
    @Override
    public boolean isPrime(int p) {
        this.obergrenze = p+1;
        
        int[] primzahlInt =  berechnePrimzahlenInt(berechnePrimZahlenBoolean());

        
        for (int i = 0; i < primzahlInt.length; i++) {
            System.out.println(primzahlInt[i]);
        }
        
       
        for (int i = 0; i < primzahlInt.length; i++) {
            if (primzahlInt[i] == p) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printPrimes() {
        int [] primzahlenInteger = berechnePrimzahlenInt(berechnePrimZahlenBoolean());
        
        for (int i = 0; i < primzahlenInteger.length; i++) {
            System.out.println(primzahlenInteger[i]);
        }
        
        
        
    }
    
    public int [] printAufG2(int sum){
        
        int[] natürlicheZG = berechnePrimzahlenInt(berechnePrimZahlenBoolean());        //PrimzahlArray
        int[] twoPrimeArr = new int[2];                                                 //2StelligerArray         

        for (int i = 0; i < (natürlicheZG.length); i++) {
            for (int j = 0; j < (natürlicheZG.length); j++) {      
                    if (natürlicheZG[i] + natürlicheZG[j] == sum) {
                        twoPrimeArr[0] = natürlicheZG[i];        //die zwei gefundenen Zahlen werden ebenfalls in einem int array gespeichert und anschließend returnt
                        twoPrimeArr[1] = natürlicheZG[j];
                        return twoPrimeArr;
                    }
                }
            }
        return null;
        
    }
    
    
}
//commitOne, -commitTwo, commitThree, commitFour, commitFive