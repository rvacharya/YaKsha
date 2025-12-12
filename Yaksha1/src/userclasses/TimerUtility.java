/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

/**
 *
 * @author Shree
 */
public class TimerUtility {
    
   
    public String onTick(double millisUntilFinished) {
             double hrs=0;
             long hrs_rounded = 0;
             double mnts=0;
             long mnts_rounded =0;
             double scnds=0; 
             long scnds_rounded=0;
             scnds=(millisUntilFinished/1000);
             
              if(scnds > 59){
                    scnds_rounded = Double.valueOf(Math.floor(scnds%60)).longValue();            
              }   
              else{
                  scnds_rounded = Double.valueOf(Math.floor(scnds)).longValue();
              }
             
              if (scnds>59) {
                 mnts=(scnds/60);
                 mnts_rounded = Double.valueOf(Math.floor(mnts)).longValue();
                 if (mnts_rounded <= 0) {
                     mnts=0;
                 }
             }
             if (mnts>59) {
                 hrs=(mnts/60);
                 hrs_rounded = Double.valueOf(Math.floor(hrs)).longValue();
                 if (hrs <=0) {
                     hrs=0;
                 }
             }
            String disHour = (hrs_rounded < 10 ? "0" : "") + hrs_rounded,
             disMinu = (mnts_rounded < 10 ? "0" : "") + mnts_rounded ,
             disSec = (scnds_rounded < 10 ? "0" : "") + scnds_rounded ;

           return disHour + ":" + disMinu + ":" + disSec;
         }
    

}