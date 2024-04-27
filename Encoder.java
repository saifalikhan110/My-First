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
public class Encoder {
    
    
    
       public static String shiftEncoder(String shift){
        
        switch(shift){
        
            case "Morning":return "M";
            case "Evening":return "E";
        }
        
        return shift;
 
    }
    
    public static String groupEncoder(String group){
    
        switch(group){
        
            case "Pre-Engineering":return"E";
            case "Pre-Medical":return"M";
            case "Commerce":return"C";
        }
        return group;
    }
    
    public static String genderEncoder(String gender){
        
        switch(gender){
            case "Male": return "M";
            case "Female": return "F";
                
        }
        
        return gender;
    }
    
}
