/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package m7_221180539;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static m7_221180539.M7_221180539.list_mahasiswa;

/**
 *
 * @author Lenovo
 */
public class Main extends javax.swing.JFrame {
      
      static int sib = 1;
      static int dkv = 1;
      static int inf = 1;
      static int idx = -1;
      static String mode = "insert";
      
      public Main() {
            initComponents();
            nrp.setEnabled(false);
            update.setEnabled(false);
            remove.setEnabled(false);
            String pilih = jurusan.getSelectedItem().toString();
            String id = generateID(pilih);
            nrp.setText(id);
      }

      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            nrp = new javax.swing.JTextField();
            nama = new javax.swing.JTextField();
            jLabel8 = new javax.swing.JLabel();
            aktif = new javax.swing.JRadioButton();
            nonAktif = new javax.swing.JRadioButton();
            insert = new javax.swing.JButton();
            update = new javax.swing.JButton();
            remove = new javax.swing.JButton();
            semester = new javax.swing.JSpinner();
            jurusan = new javax.swing.JComboBox<>();
            jLabel6 = new javax.swing.JLabel();
            jScrollPane1 = new javax.swing.JScrollPane();
            mahasiswa = new javax.swing.JList<>();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        formMouseEntered(evt);
                  }
            });

            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel1.setText("Input Data");

            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel2.setText("Program Kemahasiswaan");

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel3.setText("Jurusan :");
            jLabel3.setToolTipText("");

            jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel4.setText("NRP :");
            jLabel4.setToolTipText("");

            jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel5.setText("Nama :");
            jLabel5.setToolTipText("");

            jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel7.setText("Semester :");
            jLabel7.setToolTipText("");

            nrp.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        nrpActionPerformed(evt);
                  }
            });

            jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel8.setText("Status :");
            jLabel8.setToolTipText("");

            aktif.setText("Aktif");
            aktif.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        aktifActionPerformed(evt);
                  }
            });

            nonAktif.setText("Non - Aktif");

            insert.setText("Insert");
            insert.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        insertMouseClicked(evt);
                  }
            });

            update.setText("Update");
            update.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        updateMouseClicked(evt);
                  }
            });
            update.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        updateActionPerformed(evt);
                  }
            });

            remove.setText("Remove");
            remove.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        removeMouseClicked(evt);
                  }
            });
            remove.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        removeActionPerformed(evt);
                  }
            });

            jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIB", "DKV", "INF" }));
            jurusan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jurusanMouseDragged(evt);
                  }
                  public void mouseMoved(java.awt.event.MouseEvent evt) {
                        jurusanMouseMoved(evt);
                  }
            });
            jurusan.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jurusanMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jurusanMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        jurusanMouseExited(evt);
                  }
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        jurusanMousePressed(evt);
                  }
                  public void mouseReleased(java.awt.event.MouseEvent evt) {
                        jurusanMouseReleased(evt);
                  }
            });
            jurusan.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jurusanActionPerformed(evt);
                  }
            });
            jurusan.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyPressed(java.awt.event.KeyEvent evt) {
                        jurusanKeyPressed(evt);
                  }
            });

            jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel6.setText("List Mahasiswa");

            mahasiswa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            mahasiswa.addAncestorListener(new javax.swing.event.AncestorListener() {
                  public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                        mahasiswaAncestorAdded(evt);
                  }
                  public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                  }
                  public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                  }
            });
            mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        mahasiswaMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(mahasiswa);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(147, 147, 147)
                                    .addComponent(jLabel1))
                              .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel8))
                                          .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(nrp)
                                          .addComponent(semester)
                                          .addComponent(jurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addComponent(aktif)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(nonAktif))
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                          .addComponent(nama))))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jLabel6)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                              .addGap(31, 31, 31)
                              .addComponent(jLabel2)
                              .addContainerGap(439, Short.MAX_VALUE)))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(jLabel1)
                              .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel4)
                                          .addComponent(nrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel5)
                                          .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel3)
                                          .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel7)
                                          .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel8)
                                          .addComponent(aktif)
                                          .addComponent(nonAktif))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(insert)
                                          .addComponent(update)
                                          .addComponent(remove)))
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                              .addGap(28, 28, 28)
                              .addComponent(jLabel2)
                              .addContainerGap(340, Short.MAX_VALUE)))
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_updateActionPerformed

      private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_removeActionPerformed

      private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
            String name = nama.getText();
            String nomer = nrp.getText();
            String jurus = jurusan.getSelectedItem().toString();
            String sem =  semester.getValue().toString();
            String status = "";
            if (aktif.isSelected()) {
                  status = "Aktif";
            } else if (nonAktif.isSelected()) {
                  status = "Non - Aktif";
            }
            if (!nama.getText().equals("") && !status.equals("")) {
                  int temp = Integer.parseInt(sem);
                  if (temp > 0 && temp < 9) {
                        list_mahasiswa.add(new Mahasiswa (nomer, name, jurus, "S" + sem, status));
                        resetField();
                        if (jurus.equals("SIB")) {
                              sib++;
                        } else if (jurus.equals("DKV")) {
                              dkv++;
                        } else if (jurus.equals("INF")) {
                              inf++;
                        }
                  } else {
                        JOptionPane.showMessageDialog(null,"Semester invalid !");
                  }
            } else {
                  JOptionPane.showMessageDialog(null,"Semua inputan harus terisi !");
            }
            print();
      }//GEN-LAST:event_insertMouseClicked

      private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
            
      }//GEN-LAST:event_updateMouseClicked

      private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
            
      }//GEN-LAST:event_removeMouseClicked

      private void mahasiswaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mahasiswaAncestorAdded
            // TODO add your handling code here:
      }//GEN-LAST:event_mahasiswaAncestorAdded

      private void jurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurusanMouseClicked
            
      }//GEN-LAST:event_jurusanMouseClicked

      private void jurusanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurusanMouseEntered
            String pilih = jurusan.getSelectedItem().toString();
            String id = generateID(pilih);
            nrp.setText(id);
      }//GEN-LAST:event_jurusanMouseEntered

      private void jurusanMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurusanMouseDragged
            
      }//GEN-LAST:event_jurusanMouseDragged

      private void jurusanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jurusanKeyPressed
            
      }//GEN-LAST:event_jurusanKeyPressed

      private void jurusanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurusanMouseMoved
            String pilih = jurusan.getSelectedItem().toString();
            String id = generateID(pilih);
            nrp.setText(id);
      }//GEN-LAST:event_jurusanMouseMoved

      private void jurusanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurusanMouseExited
            String pilih = jurusan.getSelectedItem().toString();
            String id = generateID(pilih);
            nrp.setText(id);
      }//GEN-LAST:event_jurusanMouseExited

      private void jurusanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurusanMousePressed
            String pilih = jurusan.getSelectedItem().toString();
            String id = generateID(pilih);
            nrp.setText(id);
      }//GEN-LAST:event_jurusanMousePressed

      private void jurusanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurusanMouseReleased
            String pilih = jurusan.getSelectedItem().toString();
            String id = generateID(pilih);
            nrp.setText(id);
      }//GEN-LAST:event_jurusanMouseReleased

      private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
            
      }//GEN-LAST:event_formMouseEntered

      private void mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahasiswaMouseClicked
            idx = mahasiswa.getSelectedIndex();
            Mahasiswa mh = list_mahasiswa.get(idx);
            nama.setText(mh.getNama());
            nrp.setText(mh.getNrp());
            jurusan.setSelectedItem(mh.getJurusan());
            semester.setValue(mh.getSemester());
            String temp = mh.getStatus();
            if (temp.equals("Aktif")) {
                  aktif.setSelected(true);
            } else if (temp.equals("Non - Aktif")) {
                  nonAktif.setSelected(true);
            }
      }//GEN-LAST:event_mahasiswaMouseClicked

      private void nrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrpActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_nrpActionPerformed

      private void jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurusanActionPerformed
            String pilih = jurusan.getSelectedItem().toString();
            String id = generateID(pilih);
            nrp.setText(id);
      }//GEN-LAST:event_jurusanActionPerformed

      private void aktifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktifActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_aktifActionPerformed

      /**
       * @param args the command line arguments
       */
      public static void main(String args[]) {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                  for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                              javax.swing.UIManager.setLookAndFeel(info.getClassName());
                              break;
                        }
                  }
            } catch (ClassNotFoundException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new Main().setVisible(true);
                  }
            });
      }
      
      public static String generateID(String pilih) {
            String id = "";
            if (pilih.equals("SIB")) {
                  id += "SIB" + String.format("%03d", sib);
            } else if (pilih.equals("DKV")) {
                  id += "DKV" + String.format("%03d", dkv);
            } else if (pilih.equals("INF")) {
                  id += "INF" + String.format("%03d", inf);
            }
            return id;
      }
      
      public void print() {
            DefaultListModel model = new DefaultListModel();
            for (Mahasiswa mah : list_mahasiswa) {
                  model.addElement(mah.getNrp() + " - " + mah.getNama() + " - " + mah.getSemester()+ " - " + mah.getStatus());
            }
            mahasiswa.setModel(model);
      }
      
      public void resetField() {
            nama.setText("");
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JRadioButton aktif;
      private javax.swing.JButton insert;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JComboBox<String> jurusan;
      private javax.swing.JList<String> mahasiswa;
      private javax.swing.JTextField nama;
      private javax.swing.JRadioButton nonAktif;
      private javax.swing.JTextField nrp;
      private javax.swing.JButton remove;
      private javax.swing.JSpinner semester;
      private javax.swing.JButton update;
      // End of variables declaration//GEN-END:variables
}
