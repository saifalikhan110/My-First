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
public class Decoder {
    
    
    public static String shiftDecoder(String shift){
        
        switch(shift){
        
            case "E":return "Evening";
            case "M":return "Morning";
        }
        
        return shift;
 
    }
    
    public static String groupDecoder(String group){
    
        switch(group){
        
            case "E":return"Pre-Engineering";
            case "M":return"Pre-Medical";
            case "C":return"Commerce";
        }
        return group;
    }
    
    public static String genderDecoder(String gender){
        
        switch(gender){
            case "M": return "Male";
            case "F": return "Female";
                
        }
        
        return gender;
    }
    
    
    
}
