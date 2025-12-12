/**
 * Your application code goes here
 */

package userclasses;

import com.codename1.io.*;
import generated.StateMachineBase;
import com.codename1.ui.*; 
import java.util.Calendar;
import com.codename1.ui.events.*;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.list.ListCellRenderer;
import com.codename1.ui.list.ListModel;
import java.util.*;
import com.codename1.ui.spinner.DateSpinner;
import com.codename1.ui.util.Resources;
import com.codename1.ui.util.UITimer;

/**
 *
 * @author R V Acharya.
 */

public class StateMachine extends StateMachineBase {
    
    // defination of variables.
     static double activity;
     double activity_now, half_life, HVT, RHM, sf_dist, film_factor, sp_thk,
             exposure_time, exp_min, exp_min1, exp_sec, exp_switch, exp_hour,
             exp_hour1, var2;
     static Date date_loading,date_for_Spinner;
     Calendar cal_load;
     long diff_time, time_load, time_now;
     static String source, sp_material, activity_display, source_id;
     
     int date_load, month_load, year_load;
     String sourcename;
     static int source_index;
     DefaultListModel combo = new DefaultListModel();
     public Hashtable Isotope_Properties;
     public Hashtable save_source;
     Vector aList, aTable, expTimerList, smsNumbers;
     
    
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
        
        Hashtable Isotope_Properties = new Hashtable();
        
        if(Storage.getInstance().exists("COBALT")==false){
        Isotope_Properties = new Hashtable();
        Isotope_Properties.put("RHM",Double.toString(1.25));
        Isotope_Properties.put("HALF_LIFE",Double.toString(1920)); //HALF LIFE IN DAYS
        Isotope_Properties.put("STEEL",Double.toString(21));
        Isotope_Properties.put("CONCRETE",Double.toString(60));
        Isotope_Properties.put("LEAD",Double.toString(6));
        Isotope_Properties.put("ALUMINIUM",Double.toString(62));
        Storage.getInstance().writeObject("COBALT", Isotope_Properties);
        }
        if(Storage.getInstance().exists("CAESIUM")==false){
        Isotope_Properties = new Hashtable();
        Isotope_Properties.put("RHM",Double.toString(0.33));
        Isotope_Properties.put("HALF_LIFE",Double.toString(10950)); //HALF LIFE IN DAYS
        Isotope_Properties.put("STEEL",Double.toString(16));
        Isotope_Properties.put("CONCRETE",Double.toString(50));
        Isotope_Properties.put("LEAD",Double.toString(4));
        Isotope_Properties.put("ALUMINIUM",Double.toString(44));
        Storage.getInstance().writeObject("CAESIUM", Isotope_Properties);            
        }
        if(Storage.getInstance().exists("IRIDIUM")==false){
        Isotope_Properties = new Hashtable();
        Isotope_Properties.put("RHM",Double.toString(0.48));
        Isotope_Properties.put("HALF_LIFE",Double.toString(74)); //HALF LIFE IN DAYS
        Isotope_Properties.put("STEEL",Double.toString(16));
        Isotope_Properties.put("CONCRETE",Double.toString(50));
        Isotope_Properties.put("LEAD",Double.toString(4));
        Isotope_Properties.put("ALUMINIUM",Double.toString(44));
        Storage.getInstance().writeObject("IRIDIUM", Isotope_Properties);
        }
        if(Storage.getInstance().exists("SELENIUM")==false){
        Isotope_Properties = new Hashtable();
        Isotope_Properties.put("RHM",Double.toString(0.203));
        Isotope_Properties.put("HALF_LIFE",Double.toString(120)); //HALF LIFE IN DAYS
        Isotope_Properties.put("STEEL",Double.toString(12));
        Isotope_Properties.put("CONCRETE",Double.toString(44));
        Isotope_Properties.put("LEAD",Double.toString(2));
        Isotope_Properties.put("ALUMINIUM",Double.toString(47));
        Storage.getInstance().writeObject("SELENIUM", Isotope_Properties);
        }
        if(Storage.getInstance().exists("THULIUM")==false){

        Isotope_Properties = new Hashtable();
        Isotope_Properties.put("RHM",Double.toString(0.0025));
        Isotope_Properties.put("HALF_LIFE",Double.toString(128)); //HALF LIFE IN DAYS
        Isotope_Properties.put("STEEL",Double.toString(16));
        Isotope_Properties.put("CONCRETE",Double.toString(50));
        Isotope_Properties.put("LEAD",Double.toString(4));
        Isotope_Properties.put("ALUMINIUM",Double.toString(44));
        Storage.getInstance().writeObject("THULIUM", Isotope_Properties);
        }
        if(Storage.getInstance().exists("RADIUM")==false){
        Isotope_Properties = new Hashtable();
        Isotope_Properties.put("RHM",Double.toString(0.825));
        Isotope_Properties.put("HALF_LIFE",Double.toString(1622*365)); //HALF LIFE IN DAYS
        Isotope_Properties.put("STEEL",Double.toString(16));
        Isotope_Properties.put("CONCRETE",Double.toString(50));
        Isotope_Properties.put("LEAD",Double.toString(4));
        Isotope_Properties.put("ALUMINIUM",Double.toString(44));
        Storage.getInstance().writeObject("RADIUM", Isotope_Properties);
        }
        if(Storage.getInstance().exists("YTTERBIUM")==false) {
        Isotope_Properties = new Hashtable();
        Isotope_Properties.put("RHM",Double.toString(0.125));
        Isotope_Properties.put("HALF_LIFE",Double.toString(32)); //HALF LIFE IN DAYS
        Isotope_Properties.put("STEEL",Double.toString(16));
        Isotope_Properties.put("CONCRETE",Double.toString(50));
        Isotope_Properties.put("LEAD",Double.toString(4));
        Isotope_Properties.put("ALUMINIUM",Double.toString(44));
        Storage.getInstance().writeObject("Ytterbium", Isotope_Properties);            
        }
                   
    }


    @Override
    protected void onExposureTime_Button3Action(Component c, ActionEvent event) {
         // Exposure time calculations here.
        Hashtable Isotope_Properties = (Hashtable) Storage.getInstance().readObject(source);
        RHM = Double.parseDouble((String)Isotope_Properties.get("RHM"));
        HVT = Double.parseDouble((String)Isotope_Properties.get(sp_material));
        
        exposure_time = ( film_factor * com.codename1.util.MathUtil.pow(2, (sp_thk/HVT)) * (sf_dist)*(sf_dist) * 60 )/((activity_now) * 10000 * RHM);
        //exp_Time_Calc = exposure_time;
        TextField display_ET = findDisplayET(c.getParent());//null;

        if(exposure_time<1)
            {
            exp_sec = Math.floor(exposure_time * 60);
            display_ET.setText(exp_sec + "Sec.");
            }
        else if(exposure_time>1 && exposure_time<60)
            {
            exp_min = Math.floor(exposure_time);
            exp_sec = (int)((exposure_time - exp_min) * 60);
            display_ET.setText(exp_min + " Min. and " + exp_sec + " Sec." );
            }
        else if (exposure_time>60 && exposure_time <(24*60))
            {
            exp_hour1 = (exposure_time/60);   
            exp_hour = Math.floor(exp_hour1);
            exp_min1 =  (exp_hour1 - exp_hour) * 60;
            exp_min = Math.floor(exp_min1);
            exp_sec = (int)((exp_min1 - exp_min) * 60);
            display_ET.setText(exp_hour + " Hrs, " +exp_min + " Min. & " + exp_sec + " Sec." );
            }
        else if (exposure_time>(24*60))
            {
            display_ET.setText(">1 Day??");
            }
    }

    @Override
    protected void onCurrentActivity_ComboBoxAction(Component c, ActionEvent event) {

        ComboBox comboBox1 = findComboBox(c.getParent());
        source_id = (String) comboBox1.getSelectedItem();
        if(source_id.equals("Select")){
            //Do nothing
        }
        else{
         //System.out.println("The selected source is  : ******** "  + source + "  *******");
         Vector aTable = (Vector)Storage.getInstance().readObject(source_id);
         //System.out.println(" After selecting the input from Combo Box - " + aTable.size());
          TextField InitActivity = findInitActivity(c.getParent());     
          String activity = (aTable.get(2)).toString();
          InitActivity.setText(activity);

          ComboBox comboBox2 = findComboBox1(c.getParent());
         // System.out.println((aTable.get(0))); //Holds the source
          int index = ((Integer)(aTable.get(3))).intValue();
          //System.out.println("Integer Index Value ==  ****   " + index);
          comboBox2.setSelectedIndex((index));
                  
          Date date = (Date)(aTable.get(1));
          Label Label3 = findLabel3(c.getParent());//null;
          Label3.setText(date.toString());
          
          Utility1 utl = new Utility1();
          int aDate = utl.getDate(date.toString());        
          int aMonth =utl.getMonth(date.toString());
          int aYear =utl.getYear(date.toString());
          
          //System.out.println("Getting Date here - " + aDate+"  - "+aMonth+" - "+aYear + " - ** - "+date.toString());
          DateSpinner DateSpinner1= findDateSpinner1(c.getParent());
          DateSpinner1.setCurrentDay(aDate);//For date
          DateSpinner1.setCurrentMonth(aMonth); //For month
          DateSpinner1.setCurrentYear(aYear); // For year     
       }    
    }

    @Override
    protected void onCurrentActivity_InitActivityAction(Component c, ActionEvent event) {

        TextField init_activity = findInitActivity(c.getParent());
        //TextField init_activity = null;
        activity = Double.parseDouble(String.valueOf(init_activity.getText()));

    }

    @Override
    protected void onCurrentActivity_Button4Action(Component c, ActionEvent event) {

        DateSpinner DateSpinner1= findDateSpinner1(c.getParent());
        
        date_load = DateSpinner1.getCurrentDay();
        month_load = DateSpinner1.getCurrentMonth()-1;
        year_load = DateSpinner1.getCurrentYear();
        cal_load = Calendar.getInstance();
        cal_load.set(Calendar.DATE, date_load);
        cal_load.set (Calendar.MONTH, month_load);
        cal_load.set (Calendar.YEAR, year_load);
        date_loading = cal_load.getTime();
        time_load = date_loading.getTime();
        Label Label = findLabel5(c.getParent());//null;
        Label.setText(date_loading.toString());

    }

    @Override
    protected void onCurrentActivity_Button3Action(Component c, ActionEvent event) {

        //System.out.println("Source" + source);
        //System.out.println("init act" + activity);
        //System.out.println("half life" + half_life);
        //System.out.println("Source" + source);
        //System.out.println("Source" + source);
        
        Hashtable Isotope_Properties = (Hashtable) Storage.getInstance().readObject(source);
        System.out.println("Isotope_Properties " + Isotope_Properties);
        half_life = Double.parseDouble((String)Isotope_Properties.get("HALF_LIFE"))*(24*60*60*1000);
        Calendar today = Calendar.getInstance();
        Date time_today = today.getTime();
        time_now = time_today.getTime();
        diff_time = (time_now - time_load)-(12*60*60*1000);
        activity_now = activity/ (com.codename1.util.MathUtil.pow(2,(diff_time/half_life)));
        double var1 = (double) (activity_now - (int)activity_now);
        int var2 = (int) (var1*100);
        TextField TextField1 = findTextField1(c.getParent());     
        //TextField activity_for_ET = findInitActivity(c.getParent());
        //Container c1 = findContainer6(c1).();
        activity_display = ((int)activity_now + "." + var2);
        TextField1.setText(activity_display + "Ci.");
        //activity_for_ET.setText((int)activity_now + "." + var2 + "Ci.");
        

    }

    @Override
    protected void onCurrentActivity_ComboBox1Action(Component c, ActionEvent event) {

    ComboBox comboBox1 = findComboBox1(c.getParent());
    source = (String) comboBox1.getSelectedItem();
    source_index = comboBox1.getSelectedIndex();
    if (source == "Select here"){
       // ShowDialogBox("Select Source", "First select a source!");
        //do something here. a warning.
        }
    source = source.toUpperCase();
    System.out.println("source " + source);   
    }
    

    @Override
    protected void beforeExposureTime(Form f) {
        Container cont = findContainer(f);
        f.revalidate();
            for(int iter = 0 ; iter < cont.getComponentCount() ; iter++) {
                Component c = cont.getComponentAt(iter);
                c.setY(-c.getHeight());
                cont.setShouldCalcPreferredSize(true);
            }
            cont.animateLayout(1000);

    }

    @Override
    protected void onExposureTime_FilmfactorAction(Component c, ActionEvent event) {
        TextField Filmfactor = findFilmfactor(c.getParent());
        film_factor = Double.parseDouble(String.valueOf(Filmfactor.getText()));
    }
    

    @Override
    protected void onExposureTime_SpThkAction(Component c, ActionEvent event) {
        TextField SpThk = findSpThk(c.getParent());
        sp_thk = Double.parseDouble(String.valueOf(SpThk.getText()));

    
    }

    @Override
    protected void onExposureTime_SfdAction(Component c, ActionEvent event) {
        TextField Sfd = findSfd(c.getParent());
        sf_dist = Double.parseDouble(String.valueOf(Sfd.getText()));

    
    }

    @Override
    protected void postExposureTime(Form f) {
        TextField ActivityForET = findActivityForET(f);//.getParent()); //(c.getParent());
        if(ActivityForET != null && activity_display !=null){
        ActivityForET.setText(activity_display);         
        }
    }

    @Override
    protected void onCurrentActivity_ButtonAction(Component c, ActionEvent event) {

    
    }

    @Override
    protected boolean onCurrentActivityExposureTime() {
        boolean val = super.onCurrentActivityExposureTime();
                sourcename = ShowDialogBox("Save Source", "Do you want to save the Source?");

        return val;
    }
        public static String ShowDialogBox(String Title, String Message){
        final Dialog dlg = new Dialog(Title);
        Label lbl = new Label(Message);
        dlg.addComponent(lbl);
        
        TextField sourceName = new TextField();
        sourceName.setInputModeOrder(new String[]{"123"});
        sourceName.setUseSoftkeys(false);
        dlg.addComponent(sourceName);
        Command cmdOK = new Command("OK");
        Command cmdCancel = new Command("Cancel");
        Button btnOK = new Button(cmdOK);
        Button btnCancel = new Button(cmdCancel);
               
        dlg.addComponent(btnOK);
        dlg.addComponent(btnCancel);
        
        //dlg.addCommand(cmdOK);
        //dlg.addCommand(cmdCancel);
        Command cmd = dlg.showDialog();
        sourceName.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                dlg.dispose();
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });

        if (cmd == cmdOK || cmd == null)
        {
            //Hashtable save_source = new Hashtable();
            String source_id = sourceName.getText();
            //System.out.println("Source ID is - " + source_id);
                    
        if(Storage.getInstance().exists(source_id)==false){
        //Hashtable save_source = new Hashtable();
        Vector save_source = new Vector();
        //Storage.getInstance().deleteStorageFile("sourceIds");
        Vector srcIdList = (Vector)Storage.getInstance().readObject("sourceIds");
        if(srcIdList == null){
            srcIdList = new Vector();
            srcIdList.add(new String("Select"));
        }
        boolean isAdded = srcIdList.add(source_id);
        save_source.add(source);
        save_source.add(date_loading);
        save_source.add(Double.valueOf(activity));
        //System.out.println("SOURCE INDEX HERE ON SAVING  :  "+source_index);
        save_source.add(Integer.valueOf(source_index));
        
        Storage.getInstance().writeObject("sourceIds",srcIdList );
        Storage.getInstance().writeObject(source_id, save_source);
        
        //Vector aTable = (Vector)Storage.getInstance().readObject(source_id);
        //System.out.println("REad Source details - " + aTable.firstElement() + " && " + aTable.size());
     }
        else{
            Dialog dlg1 = new Dialog("Error");
            Label lbl1 = new Label();
            lbl1.setText("Source id exists. Change source id");
            dlg1.addComponent(lbl1);
            
            Command cmd1RN = new Command("Rename");
            Command cmd1Cancel = new Command("Cancel");
            
            Button btnOK1 = new Button(cmd1RN);
            Button btnCancel1 = new Button(cmd1Cancel);               
            
            dlg1.addComponent(btnOK1);
            dlg1.addComponent(btnCancel1);
           
            //dlg1.show();//show dialog with lable.

            Command cmd1 = dlg1.showDialog();
            
            if (cmd1 == cmd1RN)
            {
              ShowDialogBox("Save Source", "Do you want to save the Source?");
                
            }
            
        }
            return sourceName.getText();
        }else {
            return "";
        }
        
        }
    @Override
    protected boolean initListModelComboBox(com.codename1.ui.List cmp) {
        Vector aList = ((Vector)Storage.getInstance().readObject("sourceIds"));
          if(aList == null){
            aList = new Vector();
            aList.add(new String("Select"));
        }
        cmp.setModel(new DefaultListModel(aList));
        return true;
    }

    @Override
    protected boolean initListModelComboBox1(com.codename1.ui.List cmp) {
        Form frm = Display.getInstance().getCurrent();
        cmp.setModel(new DefaultListModel(new String[] {"Select here","Iridium","Cobalt","Caesium","Selenium","Thulium","Radium","Ytterbium"}));
        return true;
    }

    @Override
    protected void onExposureTime_ComboBoxSpmnAction(Component c, ActionEvent event) {

        ComboBox comboBox1 = findComboBoxSpmn(c.getParent());
        sp_material = (String) comboBox1.getSelectedItem();
        sp_material = sp_material.toUpperCase();

    }

    @Override
    protected void onExposureTime_ComboBox1Action(Component c, ActionEvent event) {
        ComboBox comboBox1 = findComboBox1(c.getParent());
        source = (String) comboBox1.getSelectedItem();
        source_index = comboBox1.getSelectedIndex();
        if (source == "Select here"){
            ShowDialogBox("Select Source", "First select a source!");
        }
        source = source.toUpperCase();
        System.out.println("source " + source);   

    
    }

    @Override
    protected void onExposureTime_ActivityForETAction(Component c, ActionEvent event) {
        TextField ActivityForET = findActivityForET(c.getParent());
        activity_now = Double.parseDouble(String.valueOf(ActivityForET.getText()));
   
    }

    @Override
    protected boolean initListModelSSList(com.codename1.ui.List cmp) {
        Vector aList = ((Vector)Storage.getInstance().readObject("sourceIds"));
          if(aList == null){
            aList = new Vector();
            aList.add(new String("Select"));
        }
        cmp.setModel(new DefaultListModel(aList));
        return true;
    }

    @Override
    protected void onSavedSources_SSListAction(Component c, ActionEvent event) {

        Form frm = Display.getInstance().getCurrent();
        com.codename1.ui.List SSL = new com.codename1.ui.List();
        //String aList1 = ((String)Storage.getInstance().readObject("sourceIds"));
        SSL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });     
        
        Dialog dlg2 = new Dialog("Edit");

        Command CmdDel = new Command("Delete");
        Button BtnDel = new Button(CmdDel);
        BtnDel.setText("Delete");
        dlg2.addComponent(BtnDel);
        
        Command CmdOpt = new Command("Check Optimum");
        Button BtnOpt = new Button(CmdOpt);
        BtnOpt.setText("Check Optimum");
        dlg2.addComponent(BtnOpt);
        /*
        Command CmdView = new Command("Edit");
        Button BtnView = new Button(CmdView);
        BtnView.setText("View");
        dlg2.addComponent(BtnView);
        */
    
        Command CmdExit = new Command("Exit");
        Button btn = new Button(CmdExit);
        btn.setText("Exit");
        dlg2.addComponent(btn);
        
        dlg2.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
        //dlg2.showDialog();
        Command Cmdout = dlg2.showDialog();
        if (Cmdout == CmdExit)
        {
        dlg2.dispose();
        }
        else if (Cmdout == CmdDel){
            
        /*
        //Vector aList1 = ((Vector)Storage.getInstance().readObject("sourceIds"));
        //Storage.getInstance().deleteStorageFile("aList1");
        com.codename1.ui.List SSList = findSSList(frm);
        String source_id = (String) SSList.getSelectedItem();
        System.out.println("Source ID is - " + source_id);
        Storage.getInstance().deleteStorageFile(source_id);
        
        //String[] a1 = Storage.getInstance().listEntries();
        System.out.println("Source list is - " + a1);
        */
        com.codename1.ui.List SSList = findSSList(frm);
        String del_id = (String) SSList.getSelectedItem();
        System.out.println("Source list is - " + del_id);
        System.out.println("Size:" +aList);
        aList.remove(del_id);
        System.out.println("Size:" +aList.size());
        //aList.removeElement(SSList.getSelectedItem());
        frm.getComponentForm().revalidate();
        }
        else if (Cmdout == CmdOpt){
            //Check activity of all sources in aList
            String Message;
            //Message = ("Camera id = " + aList.name + "Source = " + alist.source 
            //        + "Current Stength = " + aList.strenth );
            //Display.sendSMS(Number, Message);
        }
    }
 

    @Override
    protected void onExposureTime_Button5Action(Component c, ActionEvent event) {
        
        //Label CntDwnTimerDisplay = findCntDwnTimerDisplay(c.getParent());

        final TimeValueForSource tValueSrc = new TimeValueForSource();
        System.out.println("SOURCE DETAILS =  "+ source + source_id + sp_material);
        tValueSrc.setSource(source);        
        tValueSrc.setSource_id(source_id); 
        tValueSrc.setSp_material(sp_material);
        final Label CntDwnTimer = findLabel(c.getParent());

        Double t;
        if(exposure_time < 1){
                t= Double.valueOf(Math.floor(exposure_time*60)); 
        }
        else{
            t = Double.valueOf(Math.floor(exposure_time*60));;
        }
        final long exp_time_in_sec = t.longValue(); 
        final Timer cntDwnTimer = new Timer();

        cntDwnTimer.scheduleAtFixedRate(new TimerTask() {
        double count = exp_time_in_sec * 1000;
        double time_remaining = 0;
        double time_TenPercent= 0;
        TimerUtility timer_Util = new TimerUtility();
           
        public void run() {
                 TimerUtility timer = new TimerUtility(); 
                 try {
                           Thread.sleep(1000);
                     } catch (InterruptedException ex) {
                             ex.printStackTrace();
                      }
                      if(time_remaining == 0){
                        time_remaining = count-1000;
                      }
                      else{
                          time_remaining = time_remaining - 1000;
                      }
                      if(time_remaining <= 0){
                          System.out.println("         TIMER UP!!!!!  ");
                          cntDwnTimer.cancel();
                      }
                      time_TenPercent = Math.floor(exp_time_in_sec * 0.1);
                      double time_Chk = time_remaining / 1000;
                      if(time_Chk  == time_TenPercent){
                        System.out.println(" 10% of the time is remaining!!!!!!!   ");
                      }
                         
                      String keyName = Thread.currentThread().getName();
                      String keyNameVal = keyName.substring(6, 7) ;
                      int threadID = Integer.parseInt(keyNameVal);
                                                             
                      tValueSrc.setTimer_Time(timer_Util.onTick(time_remaining));
                      if(expTimerList.size() == 0 || expTimerList.size() < (threadID+1)){
                                         expTimerList.add(threadID,tValueSrc);  
                      }
                      else{
                              expTimerList.setElementAt(tValueSrc, threadID);
                      } 
                           
                      //System.out.println("TIMER REMAINING  ===   " + timer_Util.onTick(time_remaining));
                      CntDwnTimer.setText((String)timer_Util.onTick(time_remaining));
          }
          }, 10, 1000);
    }

   

    @Override
    protected void onCreateTimers() {
        Vector timerList = expTimerList;
        TimeValueForSource tSrc = new TimeValueForSource();
        System.out.println("timerList Size = " + timerList.size());
        for(int i = 0; i < timerList.size() ; i++){
            timerList.elements();
            tSrc = (TimeValueForSource)timerList.get(i);
            System.out.println("timerList Size = "  + tSrc.getTimer_Time());
        //INSTEAD OF THIS PRINTLN STMNT, TRY DISPLAYING THIS VALUE IN THE UI 
        //AS LIST  THEN V CAN TRY REFRESHNG THE LIST EVERY 1000ms
        }
                    
    }

    @Override
    protected void beforeSettings(Form f) {
        f.revalidate();
        Container c = findContainer(f);
        for(int iter = 0 ; iter < c.getComponentCount() ; iter++) {
            Component current = c.getComponentAt(iter);
            if(iter % 2 == 0) {
                current.setX(-current.getWidth());
            } else {
                current.setX(current.getWidth());
            }
        }
        c.setShouldCalcPreferredSize(true);
        c.animateLayout(1000);
    }
    
}
