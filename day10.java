import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        // exceptional handling
        //try
        //catch
        //throw
        //throws 
        //final

        // int a = 2;
        // int b = 0;
        // if(b==0){
        //     System.out.println("error");
        // }else{
        //     System.out.println(a/b);
        // }

    //     try (BufferedReader reader = new BufferedReader(new FileReader("f1.txt"))) {
    //     String line;
    //     while ((line = reader.readLine()) != null) {
    //     System.out.println(line);
    // }
    // } catch (IOException e) {
    //     e.printStackTrace();
    // }

    // try(BufferedReader read = new BufferedReader(new FileReader("day1.java"))){
    //     String line;
    //     FileWriter wr = new FileWriter("day1.txt");
    //     while ((line=read.readLine()) != null) {
    //        wr.write(line);
    //        wr.write(System.lineSeparator());
    //     }
    // }catch(IOException e){
    //     e.printStackTrace();
    // }
    // try(BufferedReader k = new BufferedReader(new FileReader("day1.txt"))){
    //     String line;
    //     while ((line = k.readLine()) != null) {
    //         System.out.println(line);
    //     }
    // }catch(IOException e){
    //     e.printStackTrace();
    // }
    upper_to_lower("f1.txt");
    read_file("f1.txt");
    }
public static  void upper_to_lower(String path){
    try(BufferedReader a = new BufferedReader(new FileReader(path))){
        String line;
        while((line = a.readLine()) != null){
            for (int i = 0; i < line.length(); i++) {
                // System.out.println(line.charAt(i));
                int c = line.charAt(i);
                if(c>='A' && c<='Z'){
                try(FileWriter j = new FileWriter(path)){
                line = line.replace((char)c, ((char)(c+32)));
                j.write(line);
                j.write(System.lineSeparator());
            }catch(IOException e){
                e.printStackTrace();
            }
                }
                int k = line.charAt(i);
                if(k>='a' && k<='z'){
                    try(FileWriter j = new FileWriter(path)){
                    line = line.replace((char)c, ((char)(c-32)));
                    j.write(line);
                    j.write(System.lineSeparator());
                    }
                    }
            }
        }
    }catch(IOException e){
        e.printStackTrace();
    }
}
public static void read_file(String path){
    try{
    BufferedReader a = new BufferedReader(new FileReader(path));
    String line;
    while ((line = a.readLine()) != null) {
        System.out.println(line);
    }
}catch(IOException e){
    e.printStackTrace();
}
}
public static void writefile(String path, int li){
    try(FileWriter a = new FileWriter(path)){
        while (li!=0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter content ");
            String c = sc.nextLine();
            a.write(c + "\n");
            li--;
        }
    }catch(IOException e){
        e.printStackTrace();
    }
}
}
