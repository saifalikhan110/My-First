/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usindh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author SAIF ALI
 */
public class DatabaseManager {
    

   private static Connection con;

    private  static  void init()throws Exception{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:Usindh");
    }

    static{
            try{
                init();
            }catch(Exception e){
                e.printStackTrace();
            }
    }

    public static  int addFaculty(String Fac_Name,String Remarks) throws  Exception{
            String query = "insert into Faculty (Fac_Name,Remarks ) Values ('" + Fac_Name + "','" + Remarks + "')";
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }



    public static int addDepartment(int facID ,String DeptName,String Remark)throws Exception{
        String query="insert into Department (Fac_id,Dept_Name,Remarks) Values ('"+facID+"','"+DeptName+"','"+Remark+"')";
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

    public   static  int addPrograms(int dept_id,String Prog_Name,int Duration_in_semester,String remarks) throws Exception{
       String query = "INSERT INTO Program(Dept_ID, Prog_Name, Duration_In_Semester, Remarks) VALUES (" + dept_id + ", '" + Prog_Name + "', '" + Duration_in_semester + "', '" + remarks + "')";
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }


    public static int addBatch(int prog_id,String batch_year,String shift,String groupDes,String remarks)throws Exception{
        String query = "INSERT INTO Batch (prog_id, batch_year, shift, group_desc, remarks) VALUES ('" + prog_id + "', '" + batch_year + "', '" + shift + "', '" + groupDes + "', '" + remarks + "')";
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

        public static int addStudent(int batch_id,String std_name,String Father_name,String surname,String rollNo,String gender,String remarks)throws Exception{
            String query = "INSERT INTO Students (batch_id, Std_Name, Father_Name, SurName, Roll_No, Gender, Remarks) VALUES ('" + batch_id + "', '" + std_name + "', '" + Father_name + "', '" + surname + "', '" + rollNo + "', '" + gender + "', '" + remarks + "')";
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
        }

    public static int deleteFaculty(int fac_id) throws Exception {
            String query="Delete from Faculty where fac_id ="+fac_id;
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

    public static int deleteDepartment(int depID)throws Exception{
        String query="Delete from Department where dept_ID="+depID;
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

    public static int deleteProgram(int prog_id)throws Exception{
        String query="delete from Program where prog_id="+prog_id;
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

    public static int deleteBatch(int batch_id)throws Exception{
        String query="delete from Batch where batch_id="+batch_id;
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

    public static int deleteStudent(int std_id)throws  Exception{
        String query="Delete * from Students where std_id="+std_id;
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

    public static int updateFaculty(int fac_id,String Fac_Name,String Remarks)throws Exception{
        String query = "UPDATE Faculty SET fac_Name='" + Fac_Name + "', Remarks='" + Remarks + "' WHERE fac_id=" + fac_id;
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

    public static int updateDepartment(int dept_id,String dept_name,String remarks)throws Exception{
        String query ="Update Department set dept_name='"+dept_name+"',Remarks ='"+remarks+"' where dept_id="+dept_id;
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

    public static int updateProgram(int prog_id,String prog_name,int duration_in_semester,String remarks)throws Exception{
        String query="update program set prog_name='"+prog_name+"',duration_in_Semester="+duration_in_semester+",Remarks='"+remarks+"' where prog_id="+prog_id;
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }


    public static int updateBatch(int batch_id,String batch_year,String shift,String groupDesc,String remarks)throws Exception{
        String query = "UPDATE Batch SET batch_year="+batch_year+",shift='"+shift+"',group_desc='" + groupDesc + "', remarks='" + remarks + "' WHERE batch_id=" + batch_id;
        System.out.println(query);
        Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }


    public static int updateStudent(int stdid,String stdname,String std_father_name,String surNme,String rollno,String gndr,String remark) throws Exception{
            String query = "UPDATE Students SET std_name='" + stdname + "', father_name='" + std_father_name + "', surname='" + surNme + "', roll_no='" + rollno + "', gender='" + gndr + "', remarks='" + remark + "' WHERE std_id=" + stdid;
            System.out.println(query);

            Statement st = null;
            try {
                  st = con.createStatement();
                  int row = st.executeUpdate(query);
                  return row;
              } finally {
                  if (st != null)   st.close();
              }
    }

    public static Vector getFaculty()throws Exception{
        String query="select fac_id,fac_name,remarks from faculty";

        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);

            Vector v=new Vector();
            while (result.next()){

                int facId=result.getInt("fac_id");
                String fac_name=result.getString("fac_name");
                String remarks=result.getString("remarks");

                FacultyBean bean=new FacultyBean();
        
                bean.setFacId(facId);
                bean.setFacName(fac_name);
                bean.setRemarks(remarks);
                
                v.addElement(bean);
            }
            return v;
        }finally {
            if(result!=null)result.close();
            if(st!=null)st.close();
        }
    }

    public static Vector getDepartment(int facId)throws Exception{
        String query="Select dept_id,fac_id,dept_name,remarks from Department where fac_id="+facId;
        System.out.println(query);
        
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);

            Vector v=new Vector();
            while (result.next()){

                int deptId=result.getInt("dept_id");
                int factId=result.getInt("fac_id");
                String deptName=result.getString("dept_name");
                String remarks=result.getString("remarks");

                DepartmentBean bean=new DepartmentBean();
        
                bean.setDeptId(deptId);
                bean.setFacId(factId);
                bean.setDeptName(deptName);
                bean.setRemarks(remarks);

                v.addElement(bean);
            }
            return v;
        }finally {
            if(result!=null)result.close();
            if(st!=null)st.close();
        }
    }

    public static Vector getProgram(int deptId)throws Exception{
        String query="Select prog_id,dept_id,prog_name,duration_in_semester,remarks from Program where dept_id="+deptId;
        System.out.println(query);
        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);

            Vector v=new Vector();
            while (result.next()){

                int progId=result.getInt("prog_id");
                    deptId=result.getInt("dept_id");
            
                String progName=result.getString("prog_name");
                int duration_in_semester=result.getInt("duration_in_semester");
                String remarks=result.getString("remarks");
                
                ProgramBean bean=new ProgramBean();
                bean.setProgId(progId);
                bean.setDeptId(deptId);
                bean.setProgName(progName);
                bean.setDurationInSemester(duration_in_semester);
                bean.setRemarks(remarks);
                
                v.addElement(bean);
            }
            return v;
        }finally {
            if(result!=null)result.close();
            if(st!=null)st.close();
        }
    }

    public static  Vector getBatch(int progId)throws Exception{
        String query="select batch_id,prog_id,batch_year,shift,group_desc,remarks from Batch where prog_id="+progId;
        System.out.println(query);

        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);

            Vector v=new Vector();
            while (result.next()){

                int batchID=result.getInt("batch_id");
                int progID=result.getInt("prog_id");
                String batch_year=result.getString("batch_year");
                String shif=result.getString("shift");
                String group_desc=result.getString("group_desc");
                String remarks=result.getString("remarks");

                BatchBean bean=new BatchBean();
        
                bean.setBatchId(batchID);
                bean.setProgId(progID);
                bean.setBatchYear(batch_year);
                bean.setShift(shif);
                bean.setGroupDesc(group_desc);
                bean.setRemarks(remarks);


                v.addElement(bean);
            }
            return v;
        }finally {
            if(result!=null)result.close();
            if(st!=null)st.close();
        }
    }


    public static Vector getStudents(int batchId)throws Exception{
        String query="select std_id,batch_id,std_name,father_name,surname,roll_no,gender,remarks from Students where batch_id="+batchId;
        System.out.println(query);

        Statement st=null;
        ResultSet result=null;
        try{
            st=con.createStatement();
            result=st.executeQuery(query);

            Vector v=new Vector();
            while (result.next()){

                int std_id=result.getInt("std_id");
                int batch_id=result.getInt("batch_id");
                String std_name=result.getString("std_name");
                String father_name=result.getString("father_name");
                String surname=result.getString("surname");
                String rollNo=result.getString("roll_no");
                String gender=result.getString("gender");
                String remarks=result.getString("remarks");

                StudentBean bean=new StudentBean();

                bean.setStdId(std_id);
                bean.setBatchId(batch_id);
                bean.setStdName(std_name);
                bean.setFatherName(father_name);
                bean.setSurname(surname);
                bean.setRollNo(rollNo);
                bean.setGender(gender);
                bean.setRemarks(remarks);

                v.addElement(bean);
            }
            return v;
        }finally {
            if(result!=null)result.close();
            if(st!=null)st.close();
        }
    }
}
    

