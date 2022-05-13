/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m7_221180539;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
      protected String nrp, nama, jurusan, semester, status;

      public Mahasiswa(String nrp, String nama, String jurusan, String semester, String status) {
            this.nrp = nrp;
            this.nama = nama;
            this.jurusan = jurusan;
            this.semester = semester;
            this.status = status;
      }

      public String getNrp() {
            return nrp;
      }

      public void setNrp(String nrp) {
            this.nrp = nrp;
      }

      public String getNama() {
            return nama;
      }

      public void setNama(String nama) {
            this.nama = nama;
      }

      public String getJurusan() {
            return jurusan;
      }

      public void setJurusan(String jurusan) {
            this.jurusan = jurusan;
      }

      public String getSemester() {
            return semester;
      }

      public void setSemester(String semester) {
            this.semester = semester;
      }

      public String getStatus() {
            return status;
      }

      public void setStatus(String status) {
            this.status = status;
      }
      
}
