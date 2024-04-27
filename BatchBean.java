/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class BatchBean {
   
    private int batchId;
    private int progId;
    private String batchYear;
    private String shift;
    private String groupDesc;
    private String remarks;
    
    public void setBatchId(int batchId){
        this.batchId=batchId;
    }
    public void setProgId(int progId){
        this.progId=progId;
    }
    public void setBatchYear(String batchYear){
        this.batchYear=batchYear;
    }
    public void setShift(String shift){
        this.shift=shift;
    }
    public void setGroupDesc(String groupDesc){
        this.groupDesc=groupDesc;
    }
    public void setRemarks(String remarks){
        this.remarks=remarks;
    }

    public int getBatchId() {
        return batchId;
    }

    public int getProgId() {
        return progId;
    }

    public String getBatchYear() {
        return batchYear;
    }

    public String getShift() {
        return shift;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public String getRemarks() {
        return remarks;
    }
    public String toString(){

        return batchYear;
    }



}


