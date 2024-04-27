/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usindh;

/**
 *
 * @author SAIF ALI
 */
public class DepartmentBean {
    
  

    private int deptId;
    private int facId;
    private String deptName;
    private String remarks;

    public void setDeptId(int deptId){

        this.deptId=deptId;
    }
    public void setFacId(int facId){
        this.facId=facId;
    }
    public void setDeptName(String deptName){
        this.deptName=deptName;
    }
    public void setRemarks(String remarks){

        this.remarks=remarks;
    }
    public int getDeptId(){
        return deptId;
    }
    public int getFacId(){
        return facId;
    }
    public String getDeptName(){

        return deptName;
    }
    public String getRemarks(){
        return remarks;
    }
    public  String toString(){

        return deptName;
    }





}

    

