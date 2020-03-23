/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprawozdanie1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dawid
 */
public class Zadanie3 {
    public static void main(String[] args) {
    Set<Integer> setA = new HashSet<>();
    Set<Integer> setB = new HashSet<>(); //tworzenie nowych zbirów
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj długość pierwszego ze zbiorów");
    int setALength = Integer.parseInt(in.next());
    System.out.println("Podaj wartości");
    for(int i = 0; i < setALength ; i++){   //przypisawanie wartości do zbioru A
        int a = Integer.parseInt(in.next());
        setA.add(a);
    }
    System.out.println("Podaj długość drugiego ze zbiorów");
    int setBLength = Integer.parseInt(in.next());
    System.out.println("Podaj wartości");
    for(int i = 0; i < setBLength ; i++){ //przypisywanie wartości do zbioru B
        int b = Integer.parseInt(in.next());
        setB.add(b);
    }
    System.out.println("Zbiór A: " + setA);  
    System.out.println("Zbiór B: " + setB);
    Set<Integer> setSum = new HashSet<>(setA); 
    setSum.addAll(setB);                  //Różnica symetrzyczna zbiorów
    
     Set<Integer> setRetain = new HashSet<>(setA); 
     setRetain.retainAll(setB);              //Część wspólna
     
    Set<Integer> setDifference = new HashSet<>(setA); 
    setDifference.removeAll(setB);              //Różnica A i B
    
    Set<Integer> setSymetricDifference = new HashSet<>(setSum); 
    setSum.removeAll(setRetain);                //Suma zbiorów
    
    System.out.println("Suma zbiorów A i B: " + setSymetricDifference);
    System.out.println("Część wspólna zbiorów A i B: " + setRetain);
    System.out.println("Różnica zbiorów A i B: " + setDifference);
    System.out.println("Różnica symetryczna zbiorów A i B: " + setSum);
    
}
}