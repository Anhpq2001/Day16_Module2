package DocGhiFile;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            /*File file = new File("src/DocGhiFile/hello.txt");
            FileWriter writer = new FileWriter(file);


            writer.write("hello quang anh");
            System.out.println("thanh cong");
            writer.close();*/
            File file = new File("src/DocGhiFile/hello.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            if((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
