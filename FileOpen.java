package filereader.text;

import java.io.*;

/**
 * @author ASUS
 */
public class FileOpen {
    public static void main(String[] args){
        File dir = new File(".");
        String[] ls = dir.list();
        for(String name:ls){
            File fp = new File(dir,name);
            if(fp.isFile()&&name.endsWith("txt") ){
                try{
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( new FileInputStream(fp) )) ;
                    String line;
                    System.out.println(name);
                    for(int i=0;i<80;i++) {
                        System.out.println("-");
                    }
                    System.out.println(" ");
                    while((line=bufferedReader.readLine())!=null){
                        System.out.println(line);
                    }
                    System.out.println();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
