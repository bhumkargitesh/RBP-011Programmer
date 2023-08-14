import java.io.File;
import java.util.Scanner;

public class FileListDemo {
    public static void main(String[] args) {
        String dirName;
        Scanner sc = new Scanner(System.in);
        dirName = sc.nextLine();

        File dirfile = new File(dirName);
        if (!dirfile.isDirectory()) {
            System.out.println(dirName + "is not a directory");
            return;
        }
        for (String g : dirfile.list()) {
            System.out.println(g);
        }
    }
}
