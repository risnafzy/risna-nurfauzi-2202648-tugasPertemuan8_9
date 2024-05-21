/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukan nilai sisi 1 : ");
        double side1 = inputan.nextDouble();
        System.out.print("Masukan nilai sisi 2 : ");
        double side2 = inputan.nextDouble();
        System.out.print("Masukan nilai sisi 3 : ");
        double side3 = inputan.nextDouble();
        
        System.out.print("Masukan warna : ");
        String warna = inputan.next();
        System.out.print("Terisi atau tidak (true/false) : ");
        boolean terisi = inputan.nextBoolean();
        
        Segitiga segitiga = new Segitiga(side1,side2,side3, warna, terisi);
        

        System.out.println(segitiga);
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.getTerisi());
    }
    
}
