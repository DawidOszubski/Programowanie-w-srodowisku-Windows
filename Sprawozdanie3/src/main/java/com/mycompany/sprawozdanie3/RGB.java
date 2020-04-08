/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sprawozdanie3;

import java.util.Scanner;

/**
 *
 * @author Dawid
 */
 class Sprawozdanie3 {
    public static void main(String[] args)
    {
    RGB p = new RGB();
    RGBController colour1 = new RGBController(p.getRed(),p.getGreen(),p.getBlue());
    RGBController colour2 = new RGBController(p.getRed(),p.getGreen(),p.getBlue());
    colour1.enterValues();
    colour2.enterValues();
    colour1.mix(colour1,colour2);
    //colour1.display();
    }
}

public class RGB{
    private int R_value = 0;
    private int G_value = 0;
    private int B_value = 0;
  public RGB()
  {}
  public RGB(int R_value, int G_velue, int B_value) //konstruktor
  {
      this.R_value = R_value;
      this.G_value = G_value;
      this.B_value = B_value;
  }
   
    int getRed()     //getter
    {
        return R_value;
    }
    int getGreen()
    {
        return G_value;
    }
    int getBlue()
    {
        return B_value;
    }
    void setRed(int R_value)        //setter
    {
        this.R_value = R_value;
    }
    void setGreen(int G_value)
    {
        this.G_value = G_value;
    }
    void setBlue(int B_value)
    {
        this.B_value = B_value;
    }

    @Override
    public String toString() {
        return "[" + R_value + "," + G_value + "," + B_value + "]"; //To change body of generated methods, choose Tools | Templates.
    }

    
}


class RGBController extends RGB
{

    public RGBController(int R_value, int G_value, int B_value) {
        super();
    }
    void enterValues()              //podawanie wartośći przez użytkownika
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj wartość koloru czerwonego");
    int R_value = Integer.parseInt(in.next());
    System.out.println("Podaj wartość koloru zielonego");
    int G_value = Integer.parseInt(in.next());
    System.out.println("Podaj wartość koloru niebieskiego");
    int B_value = Integer.parseInt(in.next());
    if(R_value > 255)
        setRed(255);
    else if(R_value < 0)
        setRed(0);
    else
        setRed(R_value);
    
    if(G_value > 255)
        setGreen(255);
    else if(G_value < 0)
        setGreen(0);
    else
        setGreen(G_value);
    
     if(B_value >255)
        setBlue(255);
     else if(B_value < 0)
        setBlue(0);
    else
        setBlue(B_value);
    }
    void display()      //wyświetlanie
    {
        System.out.println("Podany kolor: [" + getRed() + "," + getGreen() + "," + getBlue() + "]");
    }
    public static void mix(RGB colour1, RGB colour2) {          //mieszanie kolorów
		int red = (colour1.getRed() + colour2.getRed()) / 2;
		int green = (colour1.getGreen() + colour2.getGreen()) / 2;
		int blue = (colour1.getBlue() + colour2.getBlue()) / 2;
	       System.out.println("Nowy kolor po zmieszaniu " + colour1 + " i " +colour2 + ": [" + red + "," + green + "," + blue + "]");
	}
}
