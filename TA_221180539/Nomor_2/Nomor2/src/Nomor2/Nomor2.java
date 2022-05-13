/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Nomor2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Nomor2 {

      static Scanner scan;
      
      public static void main(String[] args) {
            scan  = new Scanner(System.in);
            menuUtama();
      }
      
      public static void menuUtama() {
            String input;
            do {
                  System.out.print("Kedai Naruto\n" +
                                                "Nama : ");
                  input = scan.nextLine();
                  if (input.equals("admin")) {
                        menuAdmin();
                  } else if (!input.equals("exit")) {
                        menuUser(input);
                  }
            } while (!input.equals("exit"));
      }
      
      public static void menuAdmin() {
            String input;
            do {
                  System.out.print("Admin Kedai Naruto\n" +
                                                "1. Tambah Menu\n" +
                                                "2. Lihat Menu\n" +
                                                "4. Lihat Transaksi\n" +
                                                "0. Logout\n" +
                                                ">> ");
                  input = scan.nextLine();
            } while (!input.equals("0"));
      }
      
      public static void menuUser(String nama) {
            String input;
            do {
                  System.out.print("User " + nama + "\n" +
                                                "1. Order\n" +
                                                "0. Logout\n" +
                                                ">> ");
                  input = scan.nextLine();
            } while (!input.equals("0"));
      }
}
