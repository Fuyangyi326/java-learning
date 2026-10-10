import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Hello, file!");
            writer.newLine();
            writer.write("这是第二行");
            writer.close();
            System.out.println("写入成功");
        } catch (IOException e) {
            System.out.println("写入失败：" + e.getMessage());
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("读到的内容：" + line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("读取失败：" + e.getMessage());
        }
    }
}