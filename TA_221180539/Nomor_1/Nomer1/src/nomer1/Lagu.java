/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer1;

/**
 *
 * @author Lenovo
 */
public class Lagu {
      protected String judul;
      protected int putar = 0;

      public Lagu(String judul) {
            this.judul = judul;
      }

      public String getJudul() {
            return judul;
      }

      public void setJudul(String judul) {
            this.judul = judul;
      }

      public int getPutar() {
            return putar;
      }

      public void setPutar(int putar) {
            this.putar = putar;
      }
      
      public void puterNambah () {
            this.putar += 1;
      }
}
