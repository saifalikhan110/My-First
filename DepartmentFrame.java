/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usindh;

import java.util.*;

/**
 *
 * @author SAIF ALI
 */
public class DepartmentFrame extends javax.swing.JFrame {

    /**
     * Creates new form DepartmentFrame
     */
    public DepartmentFrame() {
        initComponents();
  
        java.awt.Toolkit kit=this.getToolkit();
        java.awt.Dimension d=kit.getScreenSize();
        this.setBounds(0,0,d.width,d.height);
        
        this.facCombo.setSelectedItem(null);
        
         getDepartment();
        
        
  }
    
     private void getDepartment(){
            
     
         
        try{   
        
           
                       
           Vector<FacultyBean> facultyList = DatabaseManager.getFaculty(); 

            // this.facCombo.addItem(null);
            for (FacultyBean faculty : facultyList) {
             this.facCombo.addItem(faculty);
             
      
            }
            
            
            
             FacultyBean bean=(FacultyBean)this.facCombo.getSelectedItem();
            
            Vector v=DatabaseManager.getDepartment(bean.getFacId());
            
            
            this.deptListText.setListData(v);
            
            
            
           dptListLabel.setText("DEPARTMENTS:"+v.size());
           
           
        }catch(Exception e){
           e.printStackTrace();
           javax.swing.JOptionPane.showMessageDialog(this, "Error: "+e.getMessage());
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

        heading = new javax.swing.JLabel();
        facID = new javax.swing.JLabel();
        dptName = new javax.swing.JLabel();
        facCombo = new javax.swing.JComboBox();
        deptNameText = new javax.swing.JTextField();
        remarks = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        remarksText = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        dptListLabel = new javax.swing.JLabel();
        deptID = new javax.swing.JLabel();
        deptIdText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        deptListText = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        heading.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        heading.setText("Department");
        getContentPane().add(heading);
        heading.setBounds(660, 0, 430, 120);

        facID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        facID.setText("FACULTY ");
        getContentPane().add(facID);
        facID.setBounds(540, 190, 140, 30);

        dptName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dptName.setText("DEPARTMENT");
        getContentPane().add(dptName);
        dptName.setBounds(540, 320, 200, 20);

        facCombo.setEditable(true);
        facCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        facCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facComboMouseClicked(evt);
            }
        });
        facCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facComboItemStateChanged(evt);
            }
        });
        facCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facComboActionPerformed(evt);
            }
        });
        getContentPane().add(facCombo);
        facCombo.setBounds(710, 190, 240, 30);

        deptNameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deptNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptNameTextActionPerformed(evt);
            }
        });
        getContentPane().add(deptNameText);
        deptNameText.setBounds(750, 310, 320, 40);

        remarks.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        remarks.setText("REMARKS");
        getContentPane().add(remarks);
        remarks.setBounds(540, 430, 160, 20);

        remarksText.setColumns(20);
        remarksText.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        remarksText.setRows(5);
        jScrollPane2.setViewportView(remarksText);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(660, 450, 330, 171);

        addButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(520, 690, 110, 37);

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(640, 690, 160, 37);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(830, 690, 150, 37);

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(990, 690, 150, 37);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(1170, 690, 230, 37);

        dptListLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dptListLabel.setText("DEPARTMENTS");
        getContentPane().add(dptListLabel);
        dptListLabel.setBounds(1160, 160, 220, 30);

        deptID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deptID.setText("Department ID");
        getContentPane().add(deptID);
        deptID.setBounds(540, 250, 200, 40);

        deptIdText.setEditable(false);
        deptIdText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(deptIdText);
        deptIdText.setBounds(750, 260, 190, 35);

        deptListText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deptListText.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                deptListTextValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(deptListText);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1100, 200, 360, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboActionPerformed
        // TODO add your handling code here:
        try{
            
        
            getDepartment();
         
            
                
        }
        catch(Exception e){
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
                }
    }//GEN-LAST:event_facComboActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            
            String dName=deptNameText.getText();
            String remarks=remarksText.getText();
            
            FacultyBean bean=(FacultyBean) this.facCombo.getSelectedItem();
            
            
            
            DatabaseManager.addDepartment(bean.getFacId(), dName, remarks);
            
            
            javax.swing.JOptionPane.showMessageDialog(this," Recored Added");
            
              getDepartment();
            
           
        
        if(dName==null){
             javax.swing.JOptionPane.showMessageDialog(this," Error Please Enter Department Name");
             return;
            }
  
                
          
            
            deptIdText.setText("");
            deptNameText.setText("");
            remarksText.setText("");
        
        
            
        }
        catch(Exception e){
            e.printStackTrace();
            
              javax.swing.JOptionPane.showMessageDialog(this,"ERROR"+e.getMessage());
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deptNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptNameTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_deptNameTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String dName=deptNameText.getText();
        String remarks=remarksText.getText();
        int id=Integer.parseInt(deptIdText.getText());
        try{
        
        DatabaseManager.updateDepartment(id, dName, remarks);
        
        
        
         javax.swing.JOptionPane.showMessageDialog(this,"Record Updated");
         
         getDepartment();
        }
        
        catch(Exception e){
            
            e.printStackTrace();
            
            javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
        
        DepartmentBean bean=(DepartmentBean) deptListText.getSelectedValue();
    
        if(bean==null) return;
        try{
            
           
            int rows=DatabaseManager.deleteDepartment(bean.getDeptId());
              
            
            
            
            
            javax.swing.JOptionPane.showMessageDialog(this,+rows+"Record Removed");
            
            getDepartment();
            
            deptIdText.setText("");
            deptNameText.setText("");
            remarksText.setText("");
            
            
        }
        
        catch(Exception e){
            
            e.printStackTrace();
            
             javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        
        
        deptIdText.setText("");
            deptNameText.setText("");
            remarksText.setText("");
            
        
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void facComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facComboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_facComboItemStateChanged

    private void facComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facComboMouseClicked
        // TODO add your handling code here:
        
        
        
       
        
    }//GEN-LAST:event_facComboMouseClicked

    private void deptListTextValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_deptListTextValueChanged
        // TODO add your handling code here:
        
        DepartmentBean bean=(DepartmentBean) this.deptListText.getSelectedValue();
        
        if(bean==null) return;
        
        deptIdText.setText(""+bean.getDeptId());
        deptNameText.setText(bean.getDeptName());
        this.remarksText.setText(bean.getRemarks());
        
       
        
        
    }//GEN-LAST:event_deptListTextValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel deptID;
    private javax.swing.JTextField deptIdText;
    private javax.swing.JList deptListText;
    private javax.swing.JTextField deptNameText;
    private javax.swing.JLabel dptListLabel;
    private javax.swing.JLabel dptName;
    private javax.swing.JComboBox facCombo;
    private javax.swing.JLabel facID;
    private javax.swing.JLabel heading;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel remarks;
    private javax.swing.JTextArea remarksText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
