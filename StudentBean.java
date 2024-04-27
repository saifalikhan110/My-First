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
public class StudentBean {


    private int stdId;
    private int batchId;
    private String stdName;
    private String fatherName;
    private String surname;
    private String rollNo;
    private String gender;
    private String remarks;

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }
    public int getStdId() {
        return stdId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getBatchId() {
        return batchId;
    }



    public String getStdName() {
        return stdName;
    }



    public String getFatherName() {
        return fatherName;
    }



    public String getSurname() {
        return surname;
    }



    public String getRollNo() {
        return rollNo;
    }



    public String getGender() {
        return gender;
    }



    public String getRemarks() {
        return remarks;
    }
    public String toString(){

        return stdName;
    }






}


