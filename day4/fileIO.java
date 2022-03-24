import java.io.*;

public class fileIO {
    public static void main(String[] args) {
        // try {
        // stringIO();
        // } catch (IOException e) {
        // }
        fileIOtest();
    }

    public static void charIO() throws IOException {
        // 读取输入的单个字符
        // 使用 System.in 创建 BufferedReader
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }

    public static void stringIO() throws IOException {
        // 读取字符串IO
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }

    public static void fileIOtest() {
        // 创建文件
        File f = new File("test.txt");
        // 创建文件输出流
        FileWriter fw;
        try {
            fw = new FileWriter(f);
            // 写入文件
            fw.write("Hello, world!");
            fw.close();
        } catch (IOException e) {
        }
        // 创建文件输入流
        FileReader fr;
        try {
            fr = new FileReader(f);
            // 读取文件
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
        }
    }
}