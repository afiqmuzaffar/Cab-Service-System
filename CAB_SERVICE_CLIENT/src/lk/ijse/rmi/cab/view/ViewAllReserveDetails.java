/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import lk.ijse.rmi.cab.controller.ReservationController;
import lk.ijse.rmi.cab.dto.ReservationDTO;

/**
 *
 * @author user
 */
public class ViewAllReserveDetails extends javax.swing.JPanel {

    /**
     * Creates new form ViewReserveDetails
     */
    public ViewAllReserveDetails() {
        initComponents();
        loadAllReservaionDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtReservationId = new javax.swing.JTextField();
        txtVehicleId = new javax.swing.JTextField();
        txtVehiclePrice = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        labelmodifyguestdetail = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReservation = new javax.swing.JTable();
        labelmodifyguestdetail1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(150, 40, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Cust_Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("Vehicle_Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Vehicle Price ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Start_Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("End_Date");

        txtReservationId.setEditable(false);
        txtReservationId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtReservationId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReservationIdActionPerformed(evt);
            }
        });

        txtVehicleId.setEditable(false);
        txtVehicleId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtVehiclePrice.setEditable(false);
        txtVehiclePrice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtStartDate.setEditable(false);
        txtStartDate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtEndDate.setEditable(false);
        txtEndDate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        labelmodifyguestdetail.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelmodifyguestdetail.setForeground(new java.awt.Color(255, 51, 102));
        labelmodifyguestdetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/rmi/cab/resource/reservationDetails.png"))); // NOI18N
        labelmodifyguestdetail.setText("   Reservation Details List");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("Reservation_Id");

        txtCustomerId.setEditable(false);
        txtCustomerId.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIdActionPerformed(evt);
            }
        });

        tableReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation_Id", "Cust_Id", "Vehicle_Id", "Start_Date", "End_Date", "Price"
            }
        ));
        tableReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableReservationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableReservation);

        labelmodifyguestdetail1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelmodifyguestdetail1.setForeground(new java.awt.Color(51, 0, 255));
        labelmodifyguestdetail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/rmi/cab/resource/reservationDetails.png"))); // NOI18N
        labelmodifyguestdetail1.setText("   Reservation Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelmodifyguestdetail, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelmodifyguestdetail1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtReservationId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66)
                                        .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehiclePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(labelmodifyguestdetail1)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReservationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVehiclePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(labelmodifyguestdetail)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtReservationIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReservationIdActionPerformed

        

    }//GEN-LAST:event_txtReservationIdActionPerformed

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void tableReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableReservationMouseClicked
        DefaultTableModel dtm=(DefaultTableModel) tableReservation.getModel();
        String reservationId=(String) tableReservation.getValueAt(tableReservation.getSelectedRow(),0);
        int custId=(int) tableReservation.getValueAt(tableReservation.getSelectedRow(),1);
        int vehicId=(int) tableReservation.getValueAt(tableReservation.getSelectedRow(),2);
        String startDate=(String) tableReservation.getValueAt(tableReservation.getSelectedRow(),3);
        String endDate=(String) tableReservation.getValueAt(tableReservation.getSelectedRow(),4);
        double paice=(double) tableReservation.getValueAt(tableReservation.getSelectedRow(),5);
        
        txtReservationId.setText(reservationId);
        txtCustomerId.setText(custId+"");
        txtVehicleId.setText(vehicId+"");
        txtStartDate.setText(startDate);
        txtEndDate.setText(endDate);
        txtVehiclePrice.setText(paice+"");
        txtReservationId.requestFocus();
    }//GEN-LAST:event_tableReservationMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelmodifyguestdetail;
    private javax.swing.JLabel labelmodifyguestdetail1;
    private javax.swing.JTable tableReservation;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtReservationId;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtVehicleId;
    private javax.swing.JTextField txtVehiclePrice;
    // End of variables declaration//GEN-END:variables

    private void loadAllReservaionDetails() {
        try {
            DefaultTableModel dtm=(DefaultTableModel) tableReservation.getModel();
            dtm.setRowCount(0);
            
            List<ReservationDTO>reservationDTOs=ReservationController.findAllReservations();
            if(reservationDTOs!=null){
                for (ReservationDTO reservationDTO : reservationDTOs) {
                    Object [] rowDate={
                        reservationDTO.getReseveId(),
                        reservationDTO.getCustomerDTO().getCustId(),
                        reservationDTO.getVehicleDTO().getVehicleId(),
                        reservationDTO.getStartDate(),
                        reservationDTO.getEndDate(),
                        reservationDTO.getPrice()
                    };
                    dtm.addRow(rowDate);
                    tableReservation.requestFocus();
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ViewAllReserveDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}