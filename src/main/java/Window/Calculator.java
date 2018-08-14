package Window;

import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;

import java.io.File;

public class Calculator  {
    public static String jvmBitVersion() {
        return System.getProperty("sun.arch.data.model");
    }
    public static void  call() throws InterruptedException {
        String jacobDllVersionToUse;
        if (jvmBitVersion().contains("64")){
            jacobDllVersionToUse = "jacob-1.19-x86.dll";
        }
        else {
            jacobDllVersionToUse = "jacob-1.19-x64.dll";
        }

        File file = new File("lib", jacobDllVersionToUse);
        System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

        AutoItX x = new AutoItX();
        x.run("C:\\Windows\\System32\\calc.exe");
        x.winActivate("Calculator");
        x.winWaitActive("Calculator");
       
    }
   /* public Calculator()  {
        //control.run("C:\\Program Files (x86)\\Sicyon calculator\\SicyonCalc.exe");
        control.run("C:\\Windows\\System32\\calc.exe");
      control.winActivate("Calculator");
       control.winWaitActive("Calculator");
    }
    public void enter3() {
        control.sleep(10000);
        control.mouseClick("",440,518,1,0);
     //  control.controlClick("Sicyon calculator v5.6 (SPr001)", "3", "526782","") ;
    }
    public void enterOperator() throws InterruptedException {
        Thread.sleep(2000);
        control.mouseClick("",663,614,1,0);
        //control.controlClick("Calculator", "+", "396002") ;
    }
    public void enter9() throws InterruptedException {
        Thread.sleep(3000);
        control.mouseClick("",599,521,1,0);
       // control.controlClick("Calculator", "9", "461300") ;
    }
    public void enterEqual() throws InterruptedException {
        Thread.sleep(4000);
        control.mouseClick("",675,693,1,0);
        //control.controlClick("Calculator", "=", "461322") ;
    }
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        control.mouseClick("",675,184,1,0);
       String str=control.controlGetText("Calculator","","ApplicationFrameInputSinkWindow1");
       System.out.println(str);
        //control.controlClick("Calculator", "", "133") ;

    }*/
}
