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
public class ProgramBean {
 
    private int progId;
    private int deptId;
    private String progName;
    private int durationInSemester;
    private String remarks;

    public void setProgId(int progId) {
        this.progId = progId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public void setProgName(String progName) {
        this.progName = progName;
    }

    public void setDurationInSemester(int durationInSemester) {
        this.durationInSemester = durationInSemester;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getProgId() {
        return progId;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getProgName() {
        return progName;
    }
    public int getDurationInSemester(){
       return durationInSemester;
    }
    public String getRemarks(){
        return remarks;
    }
    public String toString(){
        return progName;
    }


}

    

