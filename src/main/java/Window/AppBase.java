package Window;

import autoitx4java.AutoItX;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.jacob.com.LibraryLoader;

public class AppBase {
    public AutoItX control= new AutoItX();
    // Choose the 'JACOB' dll based on the JVM bit version.
    private final static String JACOB_DLL_TO_USE = System.getProperty("sun.arch.data.model").contains("32") ? "jacob-1.19-x86.dll"
            : "jacob-1.19-x64.dll";
    static{
        // Load the jacob dll.
        try {
            File file = new File(System.getProperty("user.dir") + "\\lib", JACOB_DLL_TO_USE);
            System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
