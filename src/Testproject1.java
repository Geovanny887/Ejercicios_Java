/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author Felip
 */
public class Testproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
//        for (int iterator = 1; iterator <= 50; iterator++) {
//            if(iterator%2 != 0){
//                System.out.println("Par: "+iterator);
//            }
//            else{
//                System.out.println("Impar: "+iterator);
//            }
//            switch (iterator%2) {
//                case 0:
//                    System.out.println("Par: "+iterator);
//                    break;
//                case 1:
//                    System.out.println("Impar: "+iterator);
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//        }
        
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
//        for(String car: cars){
//            System.out.println(car.length());
//        }
        String palabra = "Palabra";
        for (int letra = palabra.length()-1; letra >=0; letra--){
            System.out.println(palabra.charAt(letra));
        }
//        for (int letra = palabra.length()-1; letra >= 0; letra--){
//            System.out.println(palabra.charAt(letra));
//        }
        double doble = 670;
        System.out.println(doble);
        
    }
}
