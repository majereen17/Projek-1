/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fahim
 */
import java.util.Scanner;
public class SWITCH {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Taipkan Tahun: ");
    
        int year= input.nextInt();
        switch (year % 12){
            case 0 : System.out.println("Monyet"); break;
            case 1 : System.out.println("Ayam"); break;
            case 2 : System.out.println("Wolf"); break;
            case 3 : System.out.println("Piggy"); break;
            case 4 : System.out.println("tikus"); break;
            case 5 : System.out.println("lembu"); break;
            case 6 : System.out.println("harimau"); break;
            case 7 : System.out.println("arnab"); break;
            case 8 : System.out.println("naga"); break;
            case 9 : System.out.println("ular"); break;
            case 10: System.out.println("kuda"); break;
            case 11: System.out.println("kambing"); break;
              
    }
    }
    
}
