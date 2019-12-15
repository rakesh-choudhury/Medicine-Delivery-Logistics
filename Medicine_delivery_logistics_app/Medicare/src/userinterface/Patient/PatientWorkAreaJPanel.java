/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Patient;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CarrierWorkRequest;
import Business.WorkQueue.DoctorTreatmentWorkRequest;
import Business.WorkQueue.InterestFreeLoanWorkRequest;
import Business.WorkQueue.SellingWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohan
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PatientOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,
            PatientOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());

        
        populateServiceRequestTable();
        populateSellingRequestTable();   
        populateInterestFreeLoanRequestTable();     
        populateTreatmentRequestTable();
       

    }

    

    

    public void populateSellingRequestTable() {
        DefaultTableModel model = (DefaultTableModel) sellingWorkRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                if (x.equals("class Business.WorkQueue.SellingWorkRequest")) {
                    SellingWorkRequest sellingWorkRequest = (SellingWorkRequest) request;
                    Object[] row = new Object[9];
                    row[0] = sellingWorkRequest;
                    row[1] = sellingWorkRequest.getReceiver();
                    row[2] = sellingWorkRequest.getStatus();
                    row[3] = sellingWorkRequest.getSource();
                    row[4] = sellingWorkRequest.getDestination();
                    row[5] = sellingWorkRequest.getProductName();
                    row[6] = sellingWorkRequest.getQuantity();
                    row[7] = sellingWorkRequest.getTransportationCost();
                    row[8] = sellingWorkRequest.getSellingPrice();

                    model.addRow(row);
                }
            }
        }
    }

    public void populateServiceRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblCarrierRequest1.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierServiceRole
                if (x.equals("class Business.WorkQueue.CarrierWorkRequest")) {
                    CarrierWorkRequest carrierWorkRequest = (CarrierWorkRequest) request;
                    Object[] row = new Object[5];
                    row[0] = carrierWorkRequest.getReceiver();
                    row[1] = carrierWorkRequest.getStatus();
                    row[2] = carrierWorkRequest.getTypeOfProvider();
                    row[3] = carrierWorkRequest.getTypeOfPlan();
                    row[4] = carrierWorkRequest.getCost();
                    model.addRow(row);
                }
            }

        }
    }

    public void populateInterestFreeLoanRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblInterestFreeLoan.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierServiceRole
                if (x.equals("class Business.WorkQueue.InterestFreeLoanWorkRequest")) {
                    InterestFreeLoanWorkRequest interestFreeLoanWorkRequest = (InterestFreeLoanWorkRequest) request;
                    Object[] row = new Object[5];
                    row[0] = interestFreeLoanWorkRequest.getReceiver();
                    row[1] = interestFreeLoanWorkRequest.getStatus();
                    row[2] = interestFreeLoanWorkRequest.getName();
                    row[3] = interestFreeLoanWorkRequest.getAmount();
                    row[4] = interestFreeLoanWorkRequest.getMonthlyIncome();
                    model.addRow(row);
                }
            }

        }
    }

    

    public void populateTreatmentRequestTable() {
        DefaultTableModel model = (DefaultTableModel) treatmentJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                if (x.equals("class Business.WorkQueue.DoctorTreatmentWorkRequest")) {

                    // WorkRequest supplierWorkRequest = (SupplierWorkRequest) request;
                    DoctorTreatmentWorkRequest docRequest = (DoctorTreatmentWorkRequest) request;

                    Object[] row = new Object[9];
                    // row[0] = request.getDate();

                    // LocalDate localDate = LocalDate.now();
                    row[0] = docRequest.getMessage(); //diseaseName
                    row[1] = docRequest.getDate();
                    // row[2] = docRequest.getReceiver();
                    row[2] = docRequest.getStatus();
                    String result = ((DoctorTreatmentWorkRequest) request).getTestResult();
                    row[3] = result == null ? "Waiting" : result;
                    // row[4] = request.getResults();
                    row[4] = docRequest.getFreeMed();
                    row[5] = docRequest.getQuantity();
                    row[6] = docRequest.getAppointmentDate();
                    row[7] = docRequest.getComments();

                    model.addRow(row);

                }
            }
        }
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sellingWorkRequestJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        btnRequestService = new javax.swing.JButton();
        requestSellingButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCarrierRequest1 = new javax.swing.JTable();
        btnInterestFreeLoan = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblInterestFreeLoan = new javax.swing.JTable();
        requestTestJButton1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        treatmentJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sellingWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receiver", "Sender", "Status", "Store", "Adress ", "Product Name", "Quantity", "Transportation Cost", "Sold Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sellingWorkRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 1160, 97));

        enterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(204, 204, 0));
        enterpriseLabel.setText("PATIENT DASHBOARD ");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 300, 30));

        btnRequestService.setBackground(new java.awt.Color(255, 204, 0));
        btnRequestService.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnRequestService.setText("Request Service ");
        btnRequestService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestServiceActionPerformed(evt);
            }
        });
        add(btnRequestService, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, 30));

        requestSellingButton.setBackground(new java.awt.Color(255, 204, 0));
        requestSellingButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        requestSellingButton.setText("Request Medicine");
        requestSellingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestSellingButtonActionPerformed(evt);
            }
        });
        add(requestSellingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 230, -1));

        tblCarrierRequest1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receiver", "Status", "Provider", "Service type", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCarrierRequest1);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 590, 100));

        btnInterestFreeLoan.setBackground(new java.awt.Color(255, 204, 0));
        btnInterestFreeLoan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnInterestFreeLoan.setText("Request Financial Aid");
        btnInterestFreeLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterestFreeLoanActionPerformed(evt);
            }
        });
        add(btnInterestFreeLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 230, -1));

        tblInterestFreeLoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receiver", "Status", "Sender", "Loan Amount", "Monthly Income"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblInterestFreeLoan);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 550, 90));

        requestTestJButton1.setBackground(new java.awt.Color(255, 204, 0));
        requestTestJButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        requestTestJButton1.setText("Request Treatment");
        requestTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton1ActionPerformed(evt);
            }
        });
        add(requestTestJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, -1));

        treatmentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Disease/Symptoms", "Date", "Status", "Result", "Medicines Given ", "Quantity", "Next Appointmment Date", "Other Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(treatmentJTable);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1160, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Patient/patient.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestServiceActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestServiceProviderJPanel", new RequestServiceProviderJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestServiceActionPerformed

    private void requestSellingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestSellingButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestSellingJPanel", new RequestMedicineJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestSellingButtonActionPerformed

    private void btnInterestFreeLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterestFreeLoanActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestInterestFreeLoanJPanel", new RequestInterestFreeLoanJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnInterestFreeLoanActionPerformed

    private void requestTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("FarmertoDoctorWorkAreaJPanel", new PatienttoDoctorWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestTestJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInterestFreeLoan;
    private javax.swing.JButton btnRequestService;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton requestSellingButton;
    private javax.swing.JButton requestTestJButton1;
    private javax.swing.JTable sellingWorkRequestJTable;
    private javax.swing.JTable tblCarrierRequest1;
    private javax.swing.JTable tblInterestFreeLoan;
    private javax.swing.JTable treatmentJTable;
    // End of variables declaration//GEN-END:variables
}
