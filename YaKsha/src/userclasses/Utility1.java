/*
 * This class is used for the processing of the data from StateMachine class.
 * This class contains Date Utility for now, it take date as string object and 
 * return the month, year and date as int values for proecessing in StateMachine 
 * Class
 */
package userclasses;

/**
 *
 * @author Shree
 */
public class Utility1 {
    String[] aStr;
    int i = 0;
    
    public int getDate(String date){
        
        aStr  = date.split("\\s+");
        int i = Integer.parseInt(aStr[2]);
        return i;
    }
    public int getMonth(String date){
        
        aStr = date.split("\\s+");
        String month = aStr[1];
        i = getMonthNum(month);
        return i;
    }
    public int getYear(String date){
       aStr = date.split("\\s+");
       i = Integer.parseInt(aStr[5]);
        return i;
    }
    private int getMonthNum(String month){
        
        if(month.equalsIgnoreCase("jan"))
            i=1;
        else if(month.equalsIgnoreCase("feb"))
            i=2;
         else if(month.equalsIgnoreCase("mar"))
            i=3;  
         else if(month.equalsIgnoreCase("apr"))
            i=4;
        else if(month.equalsIgnoreCase("may"))
            i=5;        
        else if(month.equalsIgnoreCase("jun"))
            i=6;
        else if(month.equalsIgnoreCase("jul"))
            i=7;
        else if(month.equalsIgnoreCase("aug"))
            i=8;
        else if(month.equalsIgnoreCase("sep"))
            i=9;
        else if(month.equalsIgnoreCase("oct"))
            i=10;
        else if(month.equalsIgnoreCase("nov"))
            i=11;
        else if(month.equalsIgnoreCase("dec"))
            i=12;
        return i;
    }
        
}
