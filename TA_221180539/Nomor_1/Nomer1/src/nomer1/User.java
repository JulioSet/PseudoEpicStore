/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomer1;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class User {
      protected String nama, password;
      protected int topup;
      protected ArrayList<Lagu> list_lagu = new ArrayList<Lagu>();

      public User(String nama, String password, int topup) {
            this.nama = nama;
            this.password = password;
            this.topup = topup;
      }

      public String getNama() {
            return nama;
      }

      public void setNama(String nama) {
            this.nama = nama;
      }

      public String getPassword() {
            return password;
      }

      public void setPassword(String password) {
            this.password = password;
      }

      public int getTopup() {
            return topup;
      }

      public void setTopup(int topup) {
            this.topup = topup;
      }

      public ArrayList<Lagu> getList_lagu() {
            return list_lagu;
      }

      public void setList_lagu(ArrayList<Lagu> list_lagu) {
            this.list_lagu = list_lagu;
      }
      
      public void tambah_saldo(int saldo) {
            this.topup += saldo;
      }
      
      public String kalimat(int idx) {
            String kal = "";
            Lagu lag = list_lagu.get(idx);
            kal = (idx+1) + ". " + lag.getJudul() + " - " + lag.getPutar();
            return kal;
      }
      
      public void tambah_lagu(String nama) {
            list_lagu.add(new Lagu (nama));
      }
      
      public void hapus_lagu(int idx) {
            list_lagu.remove(idx);
      }
      
      public void tambah_puter(int idx) {
            list_lagu.get(idx).puterNambah();
      }
}
