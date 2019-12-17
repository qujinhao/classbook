package filedo;


import java.io.*;
import java.io.OutputStream;

/**
 * @author ASUS
 */
public class FileWriterInput {
    public static void main(String[] args){
         try{
             byte[] s = {1,4,8,6,3};
             OutputStream outputStream = new FileOutputStream("sb.txt");
             for(int x = 0;x<s.length; x++ ){
                 outputStream.write(x);
             }
             outputStream.close();
             InputStream inputStream = new FileInputStream("sb.txt");
             int q = inputStream.available();
             for(int i = 0;i<q;i++){
                 System.out.println("数字"+(byte)inputStream.read() );
             }
             inputStream.close();
         }catch(Exception e){
             e.printStackTrace();
         }
    }
}
