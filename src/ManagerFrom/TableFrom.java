/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagerFrom;

import Model.Car;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author turtle
 */
public class TableFrom extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private List<Car> listCar;
    private int stt;

    /**
     * Creates new form TableFrom
     */
    public TableFrom() {
        initComponents();
        setLocationRelativeTo(null);
        listCar = new ArrayList<>();
        tableModel = (DefaultTableModel) tableCar.getModel();
        stt = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bntAdd = new javax.swing.JButton();
        bntEdit = new javax.swing.JButton();
        bntDelete = new javax.swing.JButton();
        bntSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCar = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        ComboboxBrand = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ComBoboxColor = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        ComboboxSeat = new javax.swing.JComboBox<>();
        txtYear = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 580));

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm Thông Tin");

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel2.setText("Số Khung");

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel3.setText("Tên Xe");

        jLabel4.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel4.setText("Hãng Xe");

        jLabel5.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel5.setText("Mầu Xe");

        jLabel6.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel6.setText("Chỗ Ngồi");

        jLabel7.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel7.setText("Năm Sản Xuất");

        bntAdd.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        bntAdd.setText("Thêm");
        bntAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddActionPerformed(evt);
            }
        });

        bntEdit.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        bntEdit.setText("Sửa");
        bntEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEditActionPerformed(evt);
            }
        });

        bntDelete.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        bntDelete.setText("Xoá");
        bntDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeleteActionPerformed(evt);
            }
        });

        bntSearch.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        bntSearch.setText("Tìm Kiếm");
        bntSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSearchActionPerformed(evt);
            }
        });

        tableCar.setFont(new java.awt.Font(".SF NS Text", 0, 12)); // NOI18N
        tableCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Số Máy", "Tên Xe", "Hãng Xe", "Mầu Xe", "Giá Xe", "Số Chỗ", "Năm SX"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCar);

        txtId.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N

        txtName.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N

        ComboboxBrand.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        ComboboxBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vinfast", "Mercedes – Benz", "Cadillac", "Ford", "BMW", "Rolls Royce", "Audi", "Lexus", "Geely", "Porsche", "Bugatti", "Land Rover", "Lamborghini", "Ferrari", "Toyota", "Honda", "Bentley", "Aston Martin", "Volkswagen", "Nissan", "Renault", "KIA", "Mazda", "Hyundai", "Chevrolet" }));

        jLabel8.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel8.setText("Giá Xe");

        ComBoboxColor.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        ComBoboxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blue", "Black", "White", "Silver", "Gray", "Red", "Yearllow", "Purple" }));

        txtPrice.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        ComboboxSeat.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        ComboboxSeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "7", "16", "30", "35", "45" }));

        txtYear.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(231, 231, 231)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(bntSearch)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(bntEdit)
                                        .addGap(29, 29, 29)
                                        .addComponent(bntDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComboboxBrand, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                .addComponent(ComBoboxColor, javax.swing.GroupLayout.Alignment.LEADING, 0, 135, Short.MAX_VALUE)
                                .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComboboxSeat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntAdd)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bntSearch)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboboxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComBoboxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboboxSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAdd)
                    .addComponent(bntEdit)
                    .addComponent(bntDelete))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddActionPerformed
        String id = txtId.getText();
        String name = txtName.getText();
        if (!id.isEmpty() && !name.isEmpty()) {
            String brand = ComboboxBrand.getSelectedItem().toString();
            float price = Float.parseFloat(txtPrice.getText());
            String color = ComBoboxColor.getSelectedItem().toString();
            int seat = Integer.parseInt(ComboboxSeat.getSelectedItem().toString());
            String year = txtYear.getText();
            Car car = new Car(id, name, brand, price, color, seat, year);
            if (listCar.contains(car)) {
                JOptionPane.showMessageDialog(rootPane, "Đã Tồn Tại");
            } else {
                listCar.add(car);
                showCar(car);
                JOptionPane.showMessageDialog(rootPane, "Thêm Thành Công");
            }
        }else{
           JOptionPane.showMessageDialog(rootPane, "Cac O Khong Duoc De Trong");
        }
    }//GEN-LAST:event_bntAddActionPerformed

    private void bntEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntEditActionPerformed

    private void bntDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntDeleteActionPerformed

    private void bntSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntSearchActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

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
            java.util.logging.Logger.getLogger(TableFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComBoboxColor;
    private javax.swing.JComboBox<String> ComboboxBrand;
    private javax.swing.JComboBox<String> ComboboxSeat;
    private javax.swing.JButton bntAdd;
    private javax.swing.JButton bntDelete;
    private javax.swing.JButton bntEdit;
    private javax.swing.JButton bntSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tableCar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void showCar(Car car) {
        Object[] row = new Object[]{
            stt++, car.getId(), car.getName(), car.getBrand(), car.getColor(),
            car.getPrice(), car.getSeat(), car.getYear()
        };
        tableModel.addRow(row);
        tableModel.fireTableDataChanged();
    }
}
