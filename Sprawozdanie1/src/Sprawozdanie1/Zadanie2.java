/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprawozdanie1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dawid
 */
public class Zadanie2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Pattern pattern = Pattern.compile("10+1"); //regex, który pozwala nam wyszukiwać dziury binarne
    System.out.println("Wprowadź ciąg znaków binarnych");
        String text = in.next();
        Matcher matcher = pattern.matcher(text);   //dopasowywujemy regex do tekstu
        int count = 0;
        int index = 0;
        while (matcher.find(index)) {
            count++;
            index = matcher.start() + 1;
        }
        if(count == 1)
            System.out.println("Znaleziono " + count + " dziurę binarną"); 
        else if(count <= 4)
            System.out.println("Znaleziono " + count + " dziury binarne"); 
        else
            System.out.println("Znaleziono " + count + " dziur binarnych"); 
        
}
}

