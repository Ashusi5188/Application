package Window;

public class Calculator  {
    
      public static String jvmBitVersion() {
        return System.getProperty("sun.arch.data.model");
    }
        public call() throws InterruptedException {
            String jacobDllVersionToUse;
            if (jvmBitVersion().contains("32")){
                jacobDllVersionToUse = "jacob-1.19-x86.dll";
            }
            else {
                jacobDllVersionToUse = "jacob-1.19-x64.dll";
            }

            File file = new File("lib", jacobDllVersionToUse);
            System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

            AutoItX x = new AutoItX();
            x.run("calc.exe");
            x.winActivate("Calculator");
            x.winWaitActive("Calculator");
            x.run("C:\\Windows\\System32\\calc.exe");
        }
   
}
