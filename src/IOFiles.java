import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class IOFiles {
    public static void main(String[] args) throws IOException {
        FileOutputStream f1 = new FileOutputStream("C:\\Users\\admin\\IdeaProjects\\RBP -011PROgrammer\\src\\git.txt");
        String  s1 = "i am gitesh bhumkar ";
        System.out.println(s1);
        byte[] convertData = s1.getBytes();
        f1.write(convertData);
        f1.close();


        FileInputStream fi  = new FileInputStream("C:\\Users\\admin\\IdeaProjects\\RBP -011PROgrammer\\src\\git2.txt");
        int i= 0;
        while (i!=-1){
            System.out.println((char)i);
            i= fi.read();
        }
        fi.close();

    }
}
