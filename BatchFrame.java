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


public class BatchFrame extends javax.swing.JFrame {

    /**
     * Creates new form BatchFrame
     */
    public BatchFrame() {
        initComponents();
        java.awt.Toolkit kit=this.getToolkit();
        java.awt.Dimension d=kit.getScreenSize();
        this.setBounds(0,0,d.width,d.height);
        getBatch();
        
       
    }
    
    private void getBatch(){
        
        try{
        Vector <FacultyBean> v1=DatabaseManager.getFaculty();
        
          for(FacultyBean b:v1){
          
              this.facCombo.addItem(b);
          }
          
          
           ProgramBean b=(ProgramBean) this.progCombo.getSelectedItem();
           
           if(b==null)return;
            
            Vector v2=DatabaseManager.getBatch(b.getProgId());
            
            this.batchListText.setListData(v2);
            
            
            
          
        
        
        }
        
        catch(Exception e){
        
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
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
        fac = new javax.swing.JLabel();
        dept = new javax.swing.JLabel();
        prog = new javax.swing.JLabel();
        facCombo = new javax.swing.JComboBox();
        deptCombo = new javax.swing.JComboBox();
        progCombo = new javax.swing.JComboBox();
        batchID = new javax.swing.JLabel();
        batchYear = new javax.swing.JLabel();
        shift = new javax.swing.JLabel();
        shiftCombo = new javax.swing.JComboBox();
        group = new javax.swing.JLabel();
        groupCombo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        batchIdText = new javax.swing.JTextField();
        batchYearText = new javax.swing.JTextField();
        remarks = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        batchListText = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        heading.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        heading.setText("BATCH");
        getContentPane().add(heading);
        heading.setBounds(830, 40, 170, 44);

        fac.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fac.setText("FACULTY");
        getContentPane().add(fac);
        fac.setBounds(610, 150, 200, 29);

        dept.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dept.setText("DEPARTMENTS");
        getContentPane().add(dept);
        dept.setBounds(610, 220, 200, 29);

        prog.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        prog.setText("PROGRAMS ");
        getContentPane().add(prog);
        prog.setBounds(610, 290, 170, 29);

        facCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        facCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facComboActionPerformed(evt);
            }
        });
        getContentPane().add(facCombo);
        facCombo.setBounds(820, 150, 300, 35);

        deptCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deptCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptComboActionPerformed(evt);
            }
        });
        getContentPane().add(deptCombo);
        deptCombo.setBounds(820, 220, 300, 35);

        progCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        progCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progComboActionPerformed(evt);
            }
        });
        getContentPane().add(progCombo);
        progCombo.setBounds(820, 290, 300, 30);

        batchID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        batchID.setText("BATCH ID");
        getContentPane().add(batchID);
        batchID.setBounds(610, 360, 130, 29);

        batchYear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        batchYear.setText("BATCH YEAR");
        getContentPane().add(batchYear);
        batchYear.setBounds(610, 430, 160, 29);

        shift.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        shift.setText("SHIFT");
        getContentPane().add(shift);
        shift.setBounds(610, 500, 90, 29);

        shiftCombo.setEditable(true);
        shiftCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        shiftCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Evening" }));
        shiftCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftComboActionPerformed(evt);
            }
        });
        getContentPane().add(shiftCombo);
        shiftCombo.setBounds(710, 500, 140, 40);

        group.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        group.setText("GROUP");
        getContentPane().add(group);
        group.setBounds(870, 500, 120, 30);

        groupCombo.setEditable(true);
        groupCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        groupCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pre-Engineering", "Pre-Medical", "Commerce" }));
        groupCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupComboActionPerformed(evt);
            }
        });
        getContentPane().add(groupCombo);
        groupCombo.setBounds(970, 500, 230, 35);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("BATCHES");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1260, 120, 140, 20);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(1180, 750, 130, 40);

        addButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(600, 750, 100, 40);

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(710, 750, 140, 40);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton);
        deleteButton.setBounds(870, 750, 140, 40);

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton);
        clearButton.setBounds(1030, 750, 130, 40);

        batchIdText.setEditable(false);
        batchIdText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(batchIdText);
        batchIdText.setBounds(820, 360, 230, 30);

        batchYearText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(batchYearText);
        batchYearText.setBounds(820, 430, 120, 35);

        remarks.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        remarks.setText("REMARKS");
        getContentPane().add(remarks);
        remarks.setBounds(610, 550, 150, 29);

        remarksText.setColumns(20);
        remarksText.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        remarksText.setRows(5);
        jScrollPane1.setViewportView(remarksText);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(720, 590, 320, 130);

        batchListText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        batchListText.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                batchListTextValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(batchListText);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1210, 180, 240, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
           String year=batchYearText.getText();
           
           
           String remarks=remarksText.getText();
           
           String shift1 = (String) this.shiftCombo.getSelectedItem();
             String group1= (String) this.groupCombo.getSelectedItem();
           
           String shift=Encoder.shiftEncoder(shift1);
           String  group=Encoder.groupEncoder(group1);
           
          
        try{
            
            ProgramBean b=(ProgramBean) this.progCombo.getSelectedItem();
            
            DatabaseManager.addBatch(b.getProgId(),year,shift,group,remarks);
            
            javax.swing.JOptionPane.showMessageDialog(this,"Recorded Added");
            
            
            batchIdText.setText("");
             batchYearText.setText("");
             remarksText.setText("");
        
        getBatch();
       
            
        
        }
        catch(Exception e){
        
            e.printStackTrace();
            
            javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
           
        }
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void facComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboActionPerformed
        // TODO add your handling code here:
        
        try{
            
            this.deptCombo.removeAllItems();
             FacultyBean bean=(FacultyBean) this.facCombo.getSelectedItem();
             
             if(bean==null)return;
            
            Vector <DepartmentBean> v=DatabaseManager.getDepartment(bean.getFacId());
            
           
            
            for(DepartmentBean b:v){
            
                 this.deptCombo.addItem(b);
            }
            getBatch();
        }
        
        
        
        catch(Exception e){
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_facComboActionPerformed

    private void deptComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptComboActionPerformed
        // TODO add your handling code here:
        this.progCombo.removeAllItems();
        try{
            
            DepartmentBean bean=(DepartmentBean) this.deptCombo.getSelectedItem();
            if(bean==null)return;
            
            Vector <ProgramBean> v=DatabaseManager.getProgram(bean.getDeptId());
            
            for(ProgramBean pb:v){
            
                this.progCombo.addItem(pb);
            }
            
            
            
           
          
         getBatch();
        }
        catch(Exception e){
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
        }
    }//GEN-LAST:event_deptComboActionPerformed

    private void progComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progComboActionPerformed
        // TODO add your handling code here:
        
        try{
            
         getBatch();
          
        }
        
        catch(Exception e){
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
        
        }
    }//GEN-LAST:event_progComboActionPerformed

    private void batchListTextValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_batchListTextValueChanged
        // TODO add your handling code here:
        try{

        BatchBean bean=(BatchBean) batchListText.getSelectedValue();
      
        
        if(bean==null)return;
        
        batchIdText.setText(""+bean.getBatchId());
        batchYearText.setText(bean.getBatchYear());
        remarksText.setText(bean.getRemarks());
        
        
        String shift=Decoder.shiftDecoder(bean.getShift());
        String group=Decoder.shiftDecoder(bean.getGroupDesc());
        
        this.shiftCombo.setSelectedItem(shift);
        this.groupCombo.setSelectedItem(group);
            
        
        getBatch();
        
        
        }
        
        catch(Exception e){
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
            
   }
    }//GEN-LAST:event_batchListTextValueChanged

    private void shiftComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftComboActionPerformed
        // TODO add your handling code here:
        
        try{
//            ProgramBean b=(ProgramBean) this.progCombo.getSelectedItem();
//            
//              BatchBean b1=(BatchBean) this.shiftCombo.getSelectedItem();
//              
//                Vector v2=DatabaseManager.getBatch(b.getProgId());
//              
//              if(b1.equals("Morning")){
//              
//             
//                this.batchListText.setListData(v2);
//            
//              }
//              
//              else{
//                  
//                this.batchListText.setListData(v2);
//              
              //}
            
          
            
          
       
            
        
        }
        
        catch(Exception e){
        e.printStackTrace();
        
        }
    }//GEN-LAST:event_shiftComboActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        
        int batchId=Integer.parseInt(batchIdText.getText());
        String year=batchYearText.getText();
        
        String shift=(String) this.shiftCombo.getSelectedItem();
        
        String group=(String) this.groupCombo.getSelectedItem();
        
        String remarks=remarksText.getText();
      
        
        try{
            
            ProgramBean bean=(ProgramBean) this.progCombo.getSelectedItem();
            
            
            DatabaseManager.updateBatch(batchId, year, shift, group,remarks );
            
            javax.swing.JOptionPane.showMessageDialog(this,"Record Updated");
            
            
            getBatch();
        
        }
        
        catch(Exception e){
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
        int id=Integer.parseInt(this.batchIdText.getText());
   
        try{
            
            DatabaseManager.deleteBatch(id);
            
            
            javax.swing.JOptionPane.showMessageDialog(this,"Record Deleted");
            
            getBatch();
            
              
        batchIdText.setText("");
        batchYearText.setText("");
        remarksText.setText("");
       
     
        }
        
        catch(Exception e){
        
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        
        
        batchIdText.setText("");
        batchYearText.setText("");
        remarksText.setText("");
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void groupComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel batchID;
    private javax.swing.JTextField batchIdText;
    private javax.swing.JList batchListText;
    private javax.swing.JLabel batchYear;
    private javax.swing.JTextField batchYearText;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dept;
    private javax.swing.JComboBox deptCombo;
    private javax.swing.JLabel fac;
    private javax.swing.JComboBox facCombo;
    private javax.swing.JLabel group;
    private javax.swing.JComboBox groupCombo;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel prog;
    private javax.swing.JComboBox progCombo;
    private javax.swing.JLabel remarks;
    private javax.swing.JTextArea remarksText;
    private javax.swing.JLabel shift;
    private javax.swing.JComboBox shiftCombo;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
