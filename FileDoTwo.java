package filedo;

import java.io.*;

/**
 * @author ASUS
 */
public class FileDoTwo {
    public static void main(String[] args) throws IOException {
        File f = new File("sd.txt");
        FileOutputStream j = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(j,"UTF-8");
        writer.append("caonima");
        writer.append("\n\r");
        writer.append("sb");
        writer.close();
        j.close();
        FileInputStream h = new FileInputStream(f);
        InputStreamReader q = new InputStreamReader(h,"UTF-8");
        StringBuffer sb = new StringBuffer();
        while (q.ready()) {
            sb.append((char) q.read());
            // 转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        q.close();
        // 关闭读取流

        h.close();
    }
}
