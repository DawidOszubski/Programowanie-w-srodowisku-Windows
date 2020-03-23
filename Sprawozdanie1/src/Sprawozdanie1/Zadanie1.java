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
public class Zadanie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisać");
       int length = Integer.parseInt(in.next());
        for(int i = 0; i<length; i++)
            {
                try{
            System.out.println("Podaj liczbę całkowitą");
            int a = Integer.parseInt(in.next());
            set.add(a);         //dodajemy wartości do zbioru, co pozwala nam automatycznie usuwać duplikaty
                }catch(Exception e){
                    System.out.println("Nie podano liczby całkowitej, spróbuj ponownie");
                }
            }
        if(set.size() == 1)  //sprawdzamy rozmiar zbioru
            System.out.println("Wszystkie podane wartości są identyczne");
        else if(set.size() <= 4)
            System.out.println("Podano " + set.size() + " różne wartości");
        else
            System.out.println("Podano " + set.size() + " różnych wartości");
    }
    
    
}
