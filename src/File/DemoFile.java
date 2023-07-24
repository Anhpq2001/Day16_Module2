package File;

import java.io.File;
import java.util.Date;
public class DemoFile {
    public static void main(String[] args) {
        File file =  new File("src/File/DemoTest.txt");
        System.out.println("file exist? " + file.exists());
        System.out.println("length " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory?  " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());// check
        System.out.println("Is it hidden? " + file.isHidden());// check
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new Date(file.lastModified()));
    }
}
