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
public class StudentFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentFrame
     */
    public StudentFrame() {
        initComponents();
        java.awt.Toolkit kit=this.getToolkit();
        java.awt.Dimension d=kit.getScreenSize();
        this.setBounds(0,0,d.width,d.height);
        
        getStudent();
    
    }
    
    private void getStudent(){
        
        
         
       try{
           
            Vector <FacultyBean> v1=DatabaseManager.getFaculty();
            
            for(FacultyBean bean:v1){
            
                this.facCombo.addItem(bean);
            }
            
            
             BatchBean bean=(BatchBean) this.batchCombo.getSelectedItem();
             
             if(bean==null)return;
            
            
            Vector v=DatabaseManager.getStudents(bean.getBatchId());
            
            this.stdListText.setListData(v);
            
            
            
             stdList.setText("STUDENTS:"+v.size());
  
       
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        shiftCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        groupCombo = new javax.swing.JComboBox();
        facCombo = new javax.swing.JComboBox();
        deptCombo = new javax.swing.JComboBox();
        progCombo = new javax.swing.JComboBox();
        batchCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        stdListText = new javax.swing.JList();
        stdList = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        stdIdText = new javax.swing.JTextField();
        stdNameText = new javax.swing.JTextField();
        fNameText = new javax.swing.JTextField();
        surnameText = new javax.swing.JTextField();
        rollNoText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        remarksText = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        genderCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("STUDENT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(650, 0, 200, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("FACULTY");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 90, 160, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("DEPARTMENT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 160, 190, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("PROGRAM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 210, 130, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("BATCH");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 260, 110, 29);

        shiftCombo.setEditable(true);
        shiftCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        shiftCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Evening" }));
        getContentPane().add(shiftCombo);
        shiftCombo.setBounds(990, 260, 140, 35);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("SHIFT");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(900, 260, 90, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("GROUP");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1140, 260, 90, 29);

        groupCombo.setEditable(true);
        groupCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        groupCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pre-Engineering", "Pre-Medical", "Commerce" }));
        groupCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupComboActionPerformed(evt);
            }
        });
        getContentPane().add(groupCombo);
        groupCombo.setBounds(1250, 260, 210, 35);

        facCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        facCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facComboActionPerformed(evt);
            }
        });
        getContentPane().add(facCombo);
        facCombo.setBounds(720, 90, 320, 40);

        deptCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deptCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptComboActionPerformed(evt);
            }
        });
        getContentPane().add(deptCombo);
        deptCombo.setBounds(720, 160, 320, 40);

        progCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        progCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progComboActionPerformed(evt);
            }
        });
        getContentPane().add(progCombo);
        progCombo.setBounds(720, 210, 320, 40);

        batchCombo.setEditable(true);
        batchCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        batchCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchComboActionPerformed(evt);
            }
        });
        getContentPane().add(batchCombo);
        batchCombo.setBounds(720, 260, 110, 30);

        stdListText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        stdListText.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                stdListTextValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(stdListText);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1480, 140, 300, 430);

        stdList.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stdList.setText("STUDENTS");
        getContentPane().add(stdList);
        stdList.setBounds(1530, 80, 230, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("STUDENT ID");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 300, 160, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("STUDENT");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 350, 180, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("FATHER NAME");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(510, 400, 173, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("SURNAME");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(510, 460, 130, 29);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("ROLL NO");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(510, 510, 120, 29);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("GENDER");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(510, 580, 110, 29);

        stdIdText.setEditable(false);
        stdIdText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(stdIdText);
        stdIdText.setBounds(720, 300, 230, 40);

        stdNameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(stdNameText);
        stdNameText.setBounds(720, 350, 230, 40);

        fNameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(fNameText);
        fNameText.setBounds(720, 400, 230, 40);

        surnameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(surnameText);
        surnameText.setBounds(720, 460, 240, 40);

        rollNoText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(rollNoText);
        rollNoText.setBounds(720, 510, 240, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("REMARKS");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(520, 650, 140, 29);

        remarksText.setColumns(20);
        remarksText.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        remarksText.setRows(5);
        jScrollPane2.setViewportView(remarksText);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(700, 670, 350, 120);

        addButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addButton.setText("Add");
        addButton.setActionCommand("");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(490, 840, 90, 37);

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(600, 840, 130, 37);

        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton);
        DeleteButton.setBounds(740, 840, 140, 37);

        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton);
        ClearButton.setBounds(900, 840, 190, 37);

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton);
        BackButton.setBounds(1110, 840, 200, 37);

        genderCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        genderCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(genderCombo);
        genderCombo.setBounds(720, 580, 220, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void groupComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupComboActionPerformed

    private void facComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facComboActionPerformed
        // TODO add your handling code here:
        
        
        try{
            deptCombo.removeAllItems();
            FacultyBean bean=(FacultyBean) this.facCombo.getSelectedItem();
            
            if(bean==null)return;
            
            Vector <DepartmentBean> v1=DatabaseManager.getDepartment(bean.getFacId());
            
            for(DepartmentBean b:v1){
            
            this.deptCombo.addItem(b);
            }
            
            getStudent();
        
        
        }
        
        catch(Exception e){
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
        }
        
        
        
      
        
        
    }//GEN-LAST:event_facComboActionPerformed

    private void progComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progComboActionPerformed
        // TODO add your handling code here:
        
        
           try{
           this.batchCombo.removeAllItems();
            
             ProgramBean bean=(ProgramBean) this.progCombo.getSelectedItem();
             
             if(bean==null)return;
            
            Vector <BatchBean> v1=DatabaseManager.getBatch(bean.getProgId());
            
            for(BatchBean b:v1){
            
                this.batchCombo.addItem(b);
            }
            
            getStudent();
        
        }
        
        catch(Exception e){
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
       
        }
        
        
     
    }//GEN-LAST:event_progComboActionPerformed

    private void deptComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptComboActionPerformed
        // TODO add your handling code here:
        
        
           try{
           this.progCombo.removeAllItems();
            
            DepartmentBean bean=(DepartmentBean) this.deptCombo.getSelectedItem();
            
            if(bean==null)return;
            
            Vector <ProgramBean> v1=DatabaseManager.getProgram(bean.getDeptId());
            
            for(ProgramBean b:v1){
            
                this.progCombo.addItem(b);
            }
            
            getStudent();
        
        }
        
        catch(Exception e){
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
        }
    }//GEN-LAST:event_deptComboActionPerformed

    private void batchComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchComboActionPerformed
        // TODO add your handling code here:
        
        
        try{
            
            getStudent();
           
        
        
        }
        
        catch(Exception e){
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
        }
    }//GEN-LAST:event_batchComboActionPerformed

    private void stdListTextValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_stdListTextValueChanged
        // TODO add your handling code here:
         StudentBean bean=(StudentBean) this.stdListText.getSelectedValue();
        
        BatchBean bean1=(BatchBean)  batchCombo.getSelectedItem();
        
        if(bean==null) return;
        if(bean1==null)return;
      
        try{
  
        stdIdText.setText(""+bean.getStdId());
        
        stdNameText.setText(bean.getStdName());
        fNameText.setText(bean.getFatherName());
        surnameText.setText(bean.getSurname());
        rollNoText.setText(bean.getRollNo());
        remarksText.setText(bean.getRemarks());
        
        String shift=Decoder.shiftDecoder(bean1.getShift());
        String group=Decoder.groupDecoder(bean1.getGroupDesc());
        String gender=Decoder.genderDecoder(bean.getGender());
        
        this.shiftCombo.setSelectedItem(shift);
        this.groupCombo.setSelectedItem(group);
        this.genderCombo.setSelectedItem(gender);
      
  
        
        getStudent();
        
                
                }
        
        catch(Exception e){
        
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
       
        }
        
    }//GEN-LAST:event_stdListTextValueChanged

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
        String stdName=stdNameText.getText();
        String fname=fNameText.getText();
        String surname=surnameText.getText();
        String rollNo=rollNoText.getText();
        String remarks =remarksText.getText();
        
        String g=(String) this.genderCombo.getSelectedItem();
        
        String gender=Encoder.genderEncoder(g);
        
        
        
        
        
        
        
        try{
            
            BatchBean bean=(BatchBean) this.batchCombo.getSelectedItem();
            
            ProgramBean bean1=(ProgramBean) this.progCombo.getSelectedItem();
            
            DatabaseManager.addStudent(bean.getBatchId(), stdName, fname, surname, rollNo,gender, remarks);
            
            javax.swing.JOptionPane.showMessageDialog(this,"Record Added");
            
            getStudent();
            
            
        stdIdText.setText("");
        stdNameText.setText("");
        fNameText.setText("");
        surnameText.setText("");
        rollNoText.setText("");
      
        remarksText.setText("");
    
        }
        
        catch(Exception e){
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        
        int id=Integer.parseInt(stdIdText.getText());
        String stdName=stdNameText.getText();
        String fname=fNameText.getText();
        String surname=surnameText.getText();
        String rollNo=rollNoText.getText();
       
        String remarks =remarksText.getText();
//        String shift=(String) this.shiftCombo.getSelectedItem();
//        String group=(String) this.groupCombo.getSelecedItem();
        
        String g=(String) this.genderCombo.getSelectedItem();
        
        String gender=Encoder.genderEncoder(g);
        
        
        
        
        
        
        try{
            
            BatchBean bean=(BatchBean) this.batchCombo.getSelectedItem();
            
            ProgramBean bean1=(ProgramBean) this.progCombo.getSelectedItem();
            
          DatabaseManager.updateStudent(id, stdName, fname, surname, rollNo, gender, remarks);
          
            javax.swing.JOptionPane.showMessageDialog(this,"Record Update");
         
            
            
            getStudent();
            
             stdIdText.setText("");
        stdNameText.setText("");
        fNameText.setText("");
        surnameText.setText("");
        rollNoText.setText("");
       
        remarksText.setText("");
            
        
        }
        
        catch(Exception e){
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
        }
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        
        stdIdText.setText("");
        stdNameText.setText("");
        fNameText.setText("");
        surnameText.setText("");
        rollNoText.setText("");
       
        remarksText.setText("");
        
               
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        
        //StudentBean bean=(StudentBean) this.stdListText.getSelectedValue();
        
        int id=Integer.parseInt(this.stdIdText.getText());
        
        
   
        
        try{
            
            DatabaseManager.deleteStudent(id);
            javax.swing.JOptionPane.showMessageDialog(this,"Record Deleted");
            
           getStudent();
            
          stdIdText.setText("");
        stdNameText.setText("");
        fNameText.setText("");
        surnameText.setText("");
        rollNoText.setText("");
       
        remarksText.setText("");
        
        
        }
        
        catch(Exception e){
        e.printStackTrace();
        
        javax.swing.JOptionPane.showMessageDialog(this,"Error"+e.getMessage());
        
         
        }
        
        
    }//GEN-LAST:event_DeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox batchCombo;
    private javax.swing.JComboBox deptCombo;
    private javax.swing.JTextField fNameText;
    private javax.swing.JComboBox facCombo;
    private javax.swing.JComboBox genderCombo;
    private javax.swing.JComboBox groupCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox progCombo;
    private javax.swing.JTextArea remarksText;
    private javax.swing.JTextField rollNoText;
    private javax.swing.JComboBox shiftCombo;
    private javax.swing.JTextField stdIdText;
    private javax.swing.JLabel stdList;
    private javax.swing.JList stdListText;
    private javax.swing.JTextField stdNameText;
    private javax.swing.JTextField surnameText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
