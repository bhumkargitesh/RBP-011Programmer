import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File myfile = new File("C:\\Users\\admin\\Desktop\\bridgelab\\grep");
        System.out.println("File Name:"+myfile.getName());
        System.out.println("path of file:"+myfile.getPath());
        System.out.println("parent of file:"+myfile.getParent());
        System.out.println("Size of file:"+myfile.length());
        System.out.println("isExcutable file:"+myfile.canExecute());
        System.out.println("last modified file :"+myfile.lastModified());
        File f = new File("F:\\program\\one");
        if (f.mkdirs()){
            System.out.println("created one within the program");
        }else {
            System.out.println("Sorry....check the path");
        }
    }
}
