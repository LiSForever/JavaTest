import java.nio.file.*;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String filePath = "D:\\l11267\\java\\program\\JavaTest\\XXETest\\src\\main\\resources\\0.xml";  // 替换为你的文件路径
        printFileContent(filePath);
    }

    /**
     * 读取并打印文件内容
     * @param filePath 文件路径
     */
    public static void printFileContent(String filePath) {
        try {
            // 使用 Files.readAllLines() 读取所有行并打印
            Files.lines(Paths.get(filePath)).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();  // 处理文件读取异常
        }
    }
}
