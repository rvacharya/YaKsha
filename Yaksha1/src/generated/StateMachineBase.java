/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("DateSpinner", com.codename1.ui.spinner.DateSpinner.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm("Menu", null);
        } else {
            Form f = (Form)createContainer(resPath, "Menu");
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("DateSpinner", com.codename1.ui.spinner.DateSpinner.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Menu");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton8(Component root) {
        return (com.codename1.ui.Button)findByName("Button8", root);
    }

    public com.codename1.ui.Button findButton8() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton7(Component root) {
        return (com.codename1.ui.Button)findByName("Button7", root);
    }

    public com.codename1.ui.Button findButton7() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton6(Component root) {
        return (com.codename1.ui.Button)findByName("Button6", root);
    }

    public com.codename1.ui.Button findButton6() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField4(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField4", root);
    }

    public com.codename1.ui.TextField findTextField4() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton5(Component root) {
        return (com.codename1.ui.Button)findByName("Button5", root);
    }

    public com.codename1.ui.Button findButton5() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField3(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField3", root);
    }

    public com.codename1.ui.TextField findTextField3() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton4(Component root) {
        return (com.codename1.ui.Button)findByName("Button4", root);
    }

    public com.codename1.ui.Button findButton4() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer7(Component root) {
        return (com.codename1.ui.Container)findByName("Container7", root);
    }

    public com.codename1.ui.Container findContainer7() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField2(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField2", root);
    }

    public com.codename1.ui.TextField findTextField2() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton3(Component root) {
        return (com.codename1.ui.Button)findByName("Button3", root);
    }

    public com.codename1.ui.Button findButton3() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer6(Component root) {
        return (com.codename1.ui.Container)findByName("Container6", root);
    }

    public com.codename1.ui.Container findContainer6() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton2(Component root) {
        return (com.codename1.ui.Button)findByName("Button2", root);
    }

    public com.codename1.ui.Button findButton2() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField1(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField1", root);
    }

    public com.codename1.ui.TextField findTextField1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer5(Component root) {
        return (com.codename1.ui.Container)findByName("Container5", root);
    }

    public com.codename1.ui.Container findContainer5() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSfd(Component root) {
        return (com.codename1.ui.TextField)findByName("Sfd", root);
    }

    public com.codename1.ui.TextField findSfd() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Sfd", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Sfd", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBoxSpmn(Component root) {
        return (com.codename1.ui.ComboBox)findByName("ComboBoxSpmn", root);
    }

    public com.codename1.ui.ComboBox findComboBoxSpmn() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("ComboBoxSpmn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("ComboBoxSpmn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel6(Component root) {
        return (com.codename1.ui.Label)findByName("Label6", root);
    }

    public com.codename1.ui.Label findLabel6() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findDisplayET(Component root) {
        return (com.codename1.ui.TextField)findByName("DisplayET", root);
    }

    public com.codename1.ui.TextField findDisplayET() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("DisplayET", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("DisplayET", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel8(Component root) {
        return (com.codename1.ui.Label)findByName("Label8", root);
    }

    public com.codename1.ui.Label findLabel8() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findInitActivity(Component root) {
        return (com.codename1.ui.TextField)findByName("InitActivity", root);
    }

    public com.codename1.ui.TextField findInitActivity() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("InitActivity", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("InitActivity", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBox1(Component root) {
        return (com.codename1.ui.ComboBox)findByName("ComboBox1", root);
    }

    public com.codename1.ui.ComboBox findComboBox1() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("ComboBox1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("ComboBox1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBox2(Component root) {
        return (com.codename1.ui.ComboBox)findByName("ComboBox2", root);
    }

    public com.codename1.ui.ComboBox findComboBox2() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("ComboBox2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("ComboBox2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFilmfactor(Component root) {
        return (com.codename1.ui.TextField)findByName("Filmfactor", root);
    }

    public com.codename1.ui.TextField findFilmfactor() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Filmfactor", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Filmfactor", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findComboBox(Component root) {
        return (com.codename1.ui.ComboBox)findByName("ComboBox", root);
    }

    public com.codename1.ui.ComboBox findComboBox() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("ComboBox", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("ComboBox", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findSSLButton(Component root) {
        return (com.codename1.ui.Container)findByName("SSLButton", root);
    }

    public com.codename1.ui.Container findSSLButton() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("SSLButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("SSLButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findSSList(Component root) {
        return (com.codename1.ui.List)findByName("SSList", root);
    }

    public com.codename1.ui.List findSSList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("SSList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("SSList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSpThk(Component root) {
        return (com.codename1.ui.TextField)findByName("SpThk", root);
    }

    public com.codename1.ui.TextField findSpThk() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("SpThk", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("SpThk", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.DateSpinner findDateSpinner1(Component root) {
        return (com.codename1.ui.spinner.DateSpinner)findByName("DateSpinner1", root);
    }

    public com.codename1.ui.spinner.DateSpinner findDateSpinner1() {
        com.codename1.ui.spinner.DateSpinner cmp = (com.codename1.ui.spinner.DateSpinner)findByName("DateSpinner1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.DateSpinner)findByName("DateSpinner1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findList(Component root) {
        return (com.codename1.ui.List)findByName("List", root);
    }

    public com.codename1.ui.List findList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("List", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("List", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findTextField(Component root) {
        return (com.codename1.ui.TextField)findByName("TextField", root);
    }

    public com.codename1.ui.TextField findTextField() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("TextField", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("TextField", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findActivityForET(Component root) {
        return (com.codename1.ui.TextField)findByName("ActivityForET", root);
    }

    public com.codename1.ui.TextField findActivityForET() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ActivityForET", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ActivityForET", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_TimersMenu = 20;
    public static final int COMMAND_SavedSourcesExit = 17;
    public static final int COMMAND_MenuActivity = 10;
    public static final int COMMAND_MenuTimers = 12;
    public static final int COMMAND_CordonOffMenu = 2;
    public static final int COMMAND_CurrentActivityExit = 6;
    public static final int COMMAND_CurrentActivityMenu = 5;
    public static final int COMMAND_TimersExit = 21;
    public static final int COMMAND_CordonOffExposureTime = 3;
    public static final int COMMAND_ExposureTimeActivity = 7;
    public static final int COMMAND_CordonOffExit = 4;
    public static final int COMMAND_SavedSourcesMenu = 16;
    public static final int COMMAND_MenuSavedSources = 14;
    public static final int COMMAND_SettingsExit = 19;
    public static final int COMMAND_MenuCordonOff = 13;
    public static final int COMMAND_SettingsMenu = 18;
    public static final int COMMAND_ExposureTimeExit = 9;
    public static final int COMMAND_CurrentActivityExposureTime = 1;
    public static final int COMMAND_MenuSMSSettings = 15;
    public static final int COMMAND_MenuExposureTime = 11;
    public static final int COMMAND_ExposureTimeMenu = 8;

    protected boolean onTimersMenu() {
        return false;
    }

    protected boolean onSavedSourcesExit() {
        return false;
    }

    protected boolean onMenuActivity() {
        return false;
    }

    protected boolean onMenuTimers() {
        return false;
    }

    protected boolean onCordonOffMenu() {
        return false;
    }

    protected boolean onCurrentActivityExit() {
        return false;
    }

    protected boolean onCurrentActivityMenu() {
        return false;
    }

    protected boolean onTimersExit() {
        return false;
    }

    protected boolean onCordonOffExposureTime() {
        return false;
    }

    protected boolean onExposureTimeActivity() {
        return false;
    }

    protected boolean onCordonOffExit() {
        return false;
    }

    protected boolean onSavedSourcesMenu() {
        return false;
    }

    protected boolean onMenuSavedSources() {
        return false;
    }

    protected boolean onSettingsExit() {
        return false;
    }

    protected boolean onMenuCordonOff() {
        return false;
    }

    protected boolean onSettingsMenu() {
        return false;
    }

    protected boolean onExposureTimeExit() {
        return false;
    }

    protected boolean onCurrentActivityExposureTime() {
        return false;
    }

    protected boolean onMenuSMSSettings() {
        return false;
    }

    protected boolean onMenuExposureTime() {
        return false;
    }

    protected boolean onExposureTimeMenu() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_TimersMenu:
                if(onTimersMenu()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SavedSourcesExit:
                if(onSavedSourcesExit()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MenuActivity:
                if(onMenuActivity()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MenuTimers:
                if(onMenuTimers()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_CordonOffMenu:
                if(onCordonOffMenu()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_CurrentActivityExit:
                if(onCurrentActivityExit()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_CurrentActivityMenu:
                if(onCurrentActivityMenu()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_TimersExit:
                if(onTimersExit()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_CordonOffExposureTime:
                if(onCordonOffExposureTime()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_ExposureTimeActivity:
                if(onExposureTimeActivity()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_CordonOffExit:
                if(onCordonOffExit()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SavedSourcesMenu:
                if(onSavedSourcesMenu()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MenuSavedSources:
                if(onMenuSavedSources()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SettingsExit:
                if(onSettingsExit()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MenuCordonOff:
                if(onMenuCordonOff()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SettingsMenu:
                if(onSettingsMenu()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_ExposureTimeExit:
                if(onExposureTimeExit()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_CurrentActivityExposureTime:
                if(onCurrentActivityExposureTime()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MenuSMSSettings:
                if(onMenuSMSSettings()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MenuExposureTime:
                if(onMenuExposureTime()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_ExposureTimeMenu:
                if(onExposureTimeMenu()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("Menu".equals(f.getName())) {
            exitMenu(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SSLButton".equals(f.getName())) {
            exitSSLButton(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CordonOff".equals(f.getName())) {
            exitCordonOff(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CurrentActivity".equals(f.getName())) {
            exitCurrentActivity(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ExposureTime".equals(f.getName())) {
            exitExposureTime(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SavedSources".equals(f.getName())) {
            exitSavedSources(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Timers".equals(f.getName())) {
            exitTimers(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Settings".equals(f.getName())) {
            exitSettings(f);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void exitMenu(Form f) {
    }


    protected void exitSSLButton(Form f) {
    }


    protected void exitCordonOff(Form f) {
    }


    protected void exitCurrentActivity(Form f) {
    }


    protected void exitExposureTime(Form f) {
    }


    protected void exitSavedSources(Form f) {
    }


    protected void exitTimers(Form f) {
    }


    protected void exitSettings(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Menu".equals(f.getName())) {
            beforeMenu(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SSLButton".equals(f.getName())) {
            beforeSSLButton(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CordonOff".equals(f.getName())) {
            beforeCordonOff(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CurrentActivity".equals(f.getName())) {
            beforeCurrentActivity(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ExposureTime".equals(f.getName())) {
            beforeExposureTime(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SavedSources".equals(f.getName())) {
            beforeSavedSources(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Timers".equals(f.getName())) {
            beforeTimers(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Settings".equals(f.getName())) {
            beforeSettings(f);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void beforeMenu(Form f) {
    }


    protected void beforeSSLButton(Form f) {
    }


    protected void beforeCordonOff(Form f) {
    }


    protected void beforeCurrentActivity(Form f) {
    }


    protected void beforeExposureTime(Form f) {
    }


    protected void beforeSavedSources(Form f) {
    }


    protected void beforeTimers(Form f) {
    }


    protected void beforeSettings(Form f) {
    }

    protected void beforeShowContainer(Container c) {
    aboutToShowThisContainer = c;
        if("Menu".equals(c.getName())) {
            beforeContainerMenu(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SSLButton".equals(c.getName())) {
            beforeContainerSSLButton(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("CordonOff".equals(c.getName())) {
            beforeContainerCordonOff(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("CurrentActivity".equals(c.getName())) {
            beforeContainerCurrentActivity(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ExposureTime".equals(c.getName())) {
            beforeContainerExposureTime(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SavedSources".equals(c.getName())) {
            beforeContainerSavedSources(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Timers".equals(c.getName())) {
            beforeContainerTimers(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Settings".equals(c.getName())) {
            beforeContainerSettings(c);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void beforeContainerMenu(Container c) {
    }


    protected void beforeContainerSSLButton(Container c) {
    }


    protected void beforeContainerCordonOff(Container c) {
    }


    protected void beforeContainerCurrentActivity(Container c) {
    }


    protected void beforeContainerExposureTime(Container c) {
    }


    protected void beforeContainerSavedSources(Container c) {
    }


    protected void beforeContainerTimers(Container c) {
    }


    protected void beforeContainerSettings(Container c) {
    }

    protected void postShow(Form f) {
        if("Menu".equals(f.getName())) {
            postMenu(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SSLButton".equals(f.getName())) {
            postSSLButton(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CordonOff".equals(f.getName())) {
            postCordonOff(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("CurrentActivity".equals(f.getName())) {
            postCurrentActivity(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ExposureTime".equals(f.getName())) {
            postExposureTime(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SavedSources".equals(f.getName())) {
            postSavedSources(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Timers".equals(f.getName())) {
            postTimers(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Settings".equals(f.getName())) {
            postSettings(f);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void postMenu(Form f) {
    }


    protected void postSSLButton(Form f) {
    }


    protected void postCordonOff(Form f) {
    }


    protected void postCurrentActivity(Form f) {
    }


    protected void postExposureTime(Form f) {
    }


    protected void postSavedSources(Form f) {
    }


    protected void postTimers(Form f) {
    }


    protected void postSettings(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Menu".equals(c.getName())) {
            postContainerMenu(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SSLButton".equals(c.getName())) {
            postContainerSSLButton(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("CordonOff".equals(c.getName())) {
            postContainerCordonOff(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("CurrentActivity".equals(c.getName())) {
            postContainerCurrentActivity(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ExposureTime".equals(c.getName())) {
            postContainerExposureTime(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SavedSources".equals(c.getName())) {
            postContainerSavedSources(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Timers".equals(c.getName())) {
            postContainerTimers(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Settings".equals(c.getName())) {
            postContainerSettings(c);
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void postContainerMenu(Container c) {
    }


    protected void postContainerSSLButton(Container c) {
    }


    protected void postContainerCordonOff(Container c) {
    }


    protected void postContainerCurrentActivity(Container c) {
    }


    protected void postContainerExposureTime(Container c) {
    }


    protected void postContainerSavedSources(Container c) {
    }


    protected void postContainerTimers(Container c) {
    }


    protected void postContainerSettings(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Menu".equals(rootName)) {
            onCreateMenu();
            aboutToShowThisContainer = null;
            return;
        }

        if("SSLButton".equals(rootName)) {
            onCreateSSLButton();
            aboutToShowThisContainer = null;
            return;
        }

        if("CordonOff".equals(rootName)) {
            onCreateCordonOff();
            aboutToShowThisContainer = null;
            return;
        }

        if("CurrentActivity".equals(rootName)) {
            onCreateCurrentActivity();
            aboutToShowThisContainer = null;
            return;
        }

        if("ExposureTime".equals(rootName)) {
            onCreateExposureTime();
            aboutToShowThisContainer = null;
            return;
        }

        if("SavedSources".equals(rootName)) {
            onCreateSavedSources();
            aboutToShowThisContainer = null;
            return;
        }

        if("Timers".equals(rootName)) {
            onCreateTimers();
            aboutToShowThisContainer = null;
            return;
        }

        if("Settings".equals(rootName)) {
            onCreateSettings();
            aboutToShowThisContainer = null;
            return;
        }

    }


    protected void onCreateMenu() {
    }


    protected void onCreateSSLButton() {
    }


    protected void onCreateCordonOff() {
    }


    protected void onCreateCurrentActivity() {
    }


    protected void onCreateExposureTime() {
    }


    protected void onCreateSavedSources() {
    }


    protected void onCreateTimers() {
    }


    protected void onCreateSettings() {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("ComboBoxSpmn".equals(listName)) {
            return initListModelComboBoxSpmn(cmp);
        }
        if("ComboBox1".equals(listName)) {
            return initListModelComboBox1(cmp);
        }
        if("ComboBox2".equals(listName)) {
            return initListModelComboBox2(cmp);
        }
        if("ComboBox".equals(listName)) {
            return initListModelComboBox(cmp);
        }
        if("SSList".equals(listName)) {
            return initListModelSSList(cmp);
        }
        if("List".equals(listName)) {
            return initListModelList(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelComboBoxSpmn(List cmp) {
        return false;
    }

    protected boolean initListModelComboBox1(List cmp) {
        return false;
    }

    protected boolean initListModelComboBox2(List cmp) {
        return false;
    }

    protected boolean initListModelComboBox(List cmp) {
        return false;
    }

    protected boolean initListModelSSList(List cmp) {
        return false;
    }

    protected boolean initListModelList(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        if(c.getParent().getLeadParent() != null) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Menu")) {
            if("Button1".equals(c.getName())) {
                onMenu_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onMenu_Button2Action(c, event);
                return;
            }
            if("Button6".equals(c.getName())) {
                onMenu_Button6Action(c, event);
                return;
            }
            if("Button7".equals(c.getName())) {
                onMenu_Button7Action(c, event);
                return;
            }
            if("Button8".equals(c.getName())) {
                onMenu_Button8Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onMenu_ButtonAction(c, event);
                return;
            }
            if("Button4".equals(c.getName())) {
                onMenu_Button4Action(c, event);
                return;
            }
            if("Button5".equals(c.getName())) {
                onMenu_Button5Action(c, event);
                return;
            }
            if("Button3".equals(c.getName())) {
                onMenu_Button3Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("SSLButton")) {
            if("Button".equals(c.getName())) {
                onSSLButton_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("CordonOff")) {
            if("ComboBox".equals(c.getName())) {
                onCordonOff_ComboBoxAction(c, event);
                return;
            }
            if("ComboBox1".equals(c.getName())) {
                onCordonOff_ComboBox1Action(c, event);
                return;
            }
            if("ComboBox2".equals(c.getName())) {
                onCordonOff_ComboBox2Action(c, event);
                return;
            }
            if("TextField".equals(c.getName())) {
                onCordonOff_TextFieldAction(c, event);
                return;
            }
            if("TextField2".equals(c.getName())) {
                onCordonOff_TextField2Action(c, event);
                return;
            }
            if("Button3".equals(c.getName())) {
                onCordonOff_Button3Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onCordonOff_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onCordonOff_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onCordonOff_Button2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("CurrentActivity")) {
            if("Button".equals(c.getName())) {
                onCurrentActivity_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onCurrentActivity_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onCurrentActivity_Button2Action(c, event);
                return;
            }
            if("Button4".equals(c.getName())) {
                onCurrentActivity_Button4Action(c, event);
                return;
            }
            if("Button3".equals(c.getName())) {
                onCurrentActivity_Button3Action(c, event);
                return;
            }
            if("TextField1".equals(c.getName())) {
                onCurrentActivity_TextField1Action(c, event);
                return;
            }
            if("ComboBox".equals(c.getName())) {
                onCurrentActivity_ComboBoxAction(c, event);
                return;
            }
            if("ComboBox1".equals(c.getName())) {
                onCurrentActivity_ComboBox1Action(c, event);
                return;
            }
            if("InitActivity".equals(c.getName())) {
                onCurrentActivity_InitActivityAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ExposureTime")) {
            if("ComboBox".equals(c.getName())) {
                onExposureTime_ComboBoxAction(c, event);
                return;
            }
            if("ComboBox1".equals(c.getName())) {
                onExposureTime_ComboBox1Action(c, event);
                return;
            }
            if("ComboBoxSpmn".equals(c.getName())) {
                onExposureTime_ComboBoxSpmnAction(c, event);
                return;
            }
            if("Filmfactor".equals(c.getName())) {
                onExposureTime_FilmfactorAction(c, event);
                return;
            }
            if("Sfd".equals(c.getName())) {
                onExposureTime_SfdAction(c, event);
                return;
            }
            if("SpThk".equals(c.getName())) {
                onExposureTime_SpThkAction(c, event);
                return;
            }
            if("ActivityForET".equals(c.getName())) {
                onExposureTime_ActivityForETAction(c, event);
                return;
            }
            if("Button3".equals(c.getName())) {
                onExposureTime_Button3Action(c, event);
                return;
            }
            if("DisplayET".equals(c.getName())) {
                onExposureTime_DisplayETAction(c, event);
                return;
            }
            if("Button5".equals(c.getName())) {
                onExposureTime_Button5Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onExposureTime_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onExposureTime_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onExposureTime_Button2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("SavedSources")) {
            if("Button".equals(c.getName())) {
                onSavedSources_ButtonAction(c, event);
                return;
            }
            if("SSList".equals(c.getName())) {
                onSavedSources_SSListAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onSavedSources_Button1Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Timers")) {
            if("List".equals(c.getName())) {
                onTimers_ListAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onTimers_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onTimers_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onTimers_Button2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Settings")) {
            if("TextField".equals(c.getName())) {
                onSettings_TextFieldAction(c, event);
                return;
            }
            if("TextField1".equals(c.getName())) {
                onSettings_TextField1Action(c, event);
                return;
            }
            if("TextField2".equals(c.getName())) {
                onSettings_TextField2Action(c, event);
                return;
            }
            if("TextField3".equals(c.getName())) {
                onSettings_TextField3Action(c, event);
                return;
            }
            if("TextField4".equals(c.getName())) {
                onSettings_TextField4Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onSettings_Button2Action(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onSettings_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onSettings_Button1Action(c, event);
                return;
            }
        }
    }

      protected void onMenu_Button1Action(Component c, ActionEvent event) {
      }

      protected void onMenu_Button2Action(Component c, ActionEvent event) {
      }

      protected void onMenu_Button6Action(Component c, ActionEvent event) {
      }

      protected void onMenu_Button7Action(Component c, ActionEvent event) {
      }

      protected void onMenu_Button8Action(Component c, ActionEvent event) {
      }

      protected void onMenu_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMenu_Button4Action(Component c, ActionEvent event) {
      }

      protected void onMenu_Button5Action(Component c, ActionEvent event) {
      }

      protected void onMenu_Button3Action(Component c, ActionEvent event) {
      }

      protected void onSSLButton_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onCordonOff_ComboBoxAction(Component c, ActionEvent event) {
      }

      protected void onCordonOff_ComboBox1Action(Component c, ActionEvent event) {
      }

      protected void onCordonOff_ComboBox2Action(Component c, ActionEvent event) {
      }

      protected void onCordonOff_TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onCordonOff_TextField2Action(Component c, ActionEvent event) {
      }

      protected void onCordonOff_Button3Action(Component c, ActionEvent event) {
      }

      protected void onCordonOff_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onCordonOff_Button1Action(Component c, ActionEvent event) {
      }

      protected void onCordonOff_Button2Action(Component c, ActionEvent event) {
      }

      protected void onCurrentActivity_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onCurrentActivity_Button1Action(Component c, ActionEvent event) {
      }

      protected void onCurrentActivity_Button2Action(Component c, ActionEvent event) {
      }

      protected void onCurrentActivity_Button4Action(Component c, ActionEvent event) {
      }

      protected void onCurrentActivity_Button3Action(Component c, ActionEvent event) {
      }

      protected void onCurrentActivity_TextField1Action(Component c, ActionEvent event) {
      }

      protected void onCurrentActivity_ComboBoxAction(Component c, ActionEvent event) {
      }

      protected void onCurrentActivity_ComboBox1Action(Component c, ActionEvent event) {
      }

      protected void onCurrentActivity_InitActivityAction(Component c, ActionEvent event) {
      }

      protected void onExposureTime_ComboBoxAction(Component c, ActionEvent event) {
      }

      protected void onExposureTime_ComboBox1Action(Component c, ActionEvent event) {
      }

      protected void onExposureTime_ComboBoxSpmnAction(Component c, ActionEvent event) {
      }

      protected void onExposureTime_FilmfactorAction(Component c, ActionEvent event) {
      }

      protected void onExposureTime_SfdAction(Component c, ActionEvent event) {
      }

      protected void onExposureTime_SpThkAction(Component c, ActionEvent event) {
      }

      protected void onExposureTime_ActivityForETAction(Component c, ActionEvent event) {
      }

      protected void onExposureTime_Button3Action(Component c, ActionEvent event) {
      }

      protected void onExposureTime_DisplayETAction(Component c, ActionEvent event) {
      }

      protected void onExposureTime_Button5Action(Component c, ActionEvent event) {
      }

      protected void onExposureTime_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onExposureTime_Button1Action(Component c, ActionEvent event) {
      }

      protected void onExposureTime_Button2Action(Component c, ActionEvent event) {
      }

      protected void onSavedSources_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onSavedSources_SSListAction(Component c, ActionEvent event) {
      }

      protected void onSavedSources_Button1Action(Component c, ActionEvent event) {
      }

      protected void onTimers_ListAction(Component c, ActionEvent event) {
      }

      protected void onTimers_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onTimers_Button1Action(Component c, ActionEvent event) {
      }

      protected void onTimers_Button2Action(Component c, ActionEvent event) {
      }

      protected void onSettings_TextFieldAction(Component c, ActionEvent event) {
      }

      protected void onSettings_TextField1Action(Component c, ActionEvent event) {
      }

      protected void onSettings_TextField2Action(Component c, ActionEvent event) {
      }

      protected void onSettings_TextField3Action(Component c, ActionEvent event) {
      }

      protected void onSettings_TextField4Action(Component c, ActionEvent event) {
      }

      protected void onSettings_Button2Action(Component c, ActionEvent event) {
      }

      protected void onSettings_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onSettings_Button1Action(Component c, ActionEvent event) {
      }

}
