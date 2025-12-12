/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

/**
 *
 * @author Shree
 */
public class TimeValueForSource {

 private String source, sp_material, source_id ;
 private String timer_Time;
 
 
 public String getSource(){
     return this.source;
}
 
 public String getSp_material(){
     return this.sp_material;
 }
 
 public String getSource_id(){
     return this.source_id;
 }
 
 public void setSource(String source){
     this.source = source;
 }
 
 public void setSp_material(String sp_material){
     this.sp_material = sp_material;
 }
 
 public void setSource_id(String source_id){
     this.source_id = source_id;
 }
 
 public void setTimer_Time(String timer_Time){
     this.timer_Time = timer_Time;
 }
 
 public String getTimer_Time(){
     return this.timer_Time;
 }
 
}
