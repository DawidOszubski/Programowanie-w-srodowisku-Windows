/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprawozdanie2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dawid
 */
public class Zadanie1
{
     public static void main(String[] args)
    {
       Random random = new Random();
       Scanner in = new Scanner(System.in);
       System.out.println("Podaj długość tablicy");
       int length = Integer.parseInt(in.next());
       if( length == 0){
            System.out.println("Błąd, podałeś pustą tablicę");
            System.exit(0);
       }
       else{
        double[] tab = new double[length];
        int size = tab.length;
        double[] numbers = {2,3,3.5,4,4.5,5};
        System.out.print("Uzupełniona tablica: [");
        for(int i=0; i<size; i++) {                     //uzupełnianie tablicy liczbami z podanego zakresu
            tab[i]= numbers[random.nextInt(numbers.length)];
            System.out.print(tab[i] + ",");
            }
       
        System.out.println("]");
        Zadanie1 a = new Zadanie1();
        double average = a.average(tab,size);
        System.out.println("srednia: " + average);
        Arrays.sort(tab); 
        System.out.println("Min: " + tab[0]);
        System.out.println("Max: " + tab[size-1]);
        lessThanAverage(tab,average);
         moreThanAverage(tab, average);
         standardDeviation(tab, average);
    }
    }
     
    public static double average(double[] tab, int size){ //liczenie średniej
        double wynik = 0;
         for(int i=0; i<tab.length; i++) {
             wynik = wynik + tab[i];
         }
         wynik = wynik/size;
         return wynik;
     }
    public static void lessThanAverage(double[] tab, double average){  //liczby mniejsze od średniej
        int i = 0;
        double[] nowa = new double[tab.length];
        System.out.print("Wartości niższe niż średnia: [");
        for(i = 0; i< tab.length; i++){        
            nowa[i]=tab[i];
            if(nowa[i] < average)
            System.out.print(nowa[i] + ",");
    }
        System.out.println("]");
    }
    public static void moreThanAverage(double[] tab, double average){ //liczby wieksze od średniej
        int i = 0;
        double[] nowa = new double[tab.length];
        System.out.print("Wartości wyższe niż średnia: [");
        for(i = 0; i< tab.length; i++){
            nowa[i]=tab[i];
            if(nowa[i] > average)
            System.out.print(nowa[i] + ",");
    }
        System.out.println("]");
    }
    
     public static void standardDeviation(double[] tab, double average){ //odchylenie standardowe
       double sd = 0;
         for(double num: tab) {
            sd += Math.pow(num - average, 2);
     }
         System.out.println("Odchylenie standardowe: " + Math.sqrt(sd/(tab.length)));
}
}

