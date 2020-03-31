/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprawozdanie2;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dawid
 */
public class Zadanie2{  
public static void main(String args[]){  
    Random random = new Random();
       Scanner in = new Scanner(System.in);
       System.out.println("Podaj wielkości obu macierzy kwadratowych");
       int length = Integer.parseInt(in.next());
       System.out.println("Macierz pierwsza: ");
    int[][] matrix1 = newMatrix(length,random);     //tworzenie 1. macierzy
    System.out.println(matrix1);
    System.out.println("Macierz druga: ");
    int[][] matrix2 = newMatrix(length,random);     //tworzenie 2. macierzy
    System.out.println(matrix2);
    addMatrix(matrix1,matrix2,length);
    subMatrix(matrix1,matrix2,length);
    multiplyMatrix(matrix1, matrix2, length);
}
public static int[][] newMatrix(int length, Random random){     //tworzenie macierzy
    int[][] tab = new int[length][length];
       for(int i=0; i<length; i++) {
           for(int j = 0; j<length; j++){
            tab[i][j]=random.nextInt(20)-10;        //losujemy z zakresu -10 do 10
            System.out.print(tab[i][j] + " ");
            }           
           System.out.println();
            }
            return tab;
}

public static void addMatrix(int[][] matrix1, int[][] matrix2, int length){ //dodawanie macierzy

    int tab[][]=new int[length][length];        //nowa macierz do przechowania wyniku
    
System.out.println("Dodawanie macierzy:");  
for(int i=0;i<length;i++){    
for(int j=0;j<length;j++){    
tab[i][j]=matrix1[i][j]+matrix2[i][j];    
System.out.print(tab[i][j]+" ");    
}    
System.out.println();   
}  

}

public static void subMatrix(int[][] matrix1, int[][] matrix2, int length){ //odejmowanie macierzy
    
    int tab[][]=new int[length][length];    
    
System.out.println("Odejmowanie macierzy:");  
for(int i=0;i<length;i++){    
for(int j=0;j<length;j++){    
tab[i][j]=matrix1[i][j]-matrix2[i][j];     
System.out.print(tab[i][j]+" ");    
}    
System.out.println();   
}  
}
public static void multiplyMatrix(int[][] matrix1, int[][] matrix2, int length){ //mnożenie macierzy
    
    int tab[][]=new int[length][length];    
    
System.out.println("Mnożenie macierzy: ");  
for(int i=0;i<length;i++){    
for(int j=0;j<length;j++){
for(int k=0;k<length;k++){
tab[i][j]+=(matrix1[i][k]*matrix2[k][j]);   }  
System.out.print(tab[i][j]+" ");    
} 
System.out.println();  
}  

}
}