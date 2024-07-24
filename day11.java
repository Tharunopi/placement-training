import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;
public class day11 {
    public static void main(String[] args) {
        // destructor
        // StringBuffer a = new StringBuffer("hi");
        // StringBuilder b = new StringBuilder("hello");
        // // b.append("sinjhi");
        // a.append("hell and how are you aqeel hello");
        // System.out.println(b.reverse());
        // StringBuffer a = new StringBuffer("aqeel is hi");
        // a.setLength(0);
        // a.append("aqeel is bye");
        // a.delete(0, a.length());
        // System.out.println(a);
        StringBuffer a = new StringBuffer("Passw0rd!@ is a mix of the 10 characters including letters, numbers, and symbols.");
        Set<Integer> c = new HashSet<>();
        ArrayList<Integer> b = new ArrayList<>();
        boolean swapped;
        for (int i = 0; i < a.length(); i++) {
            b.add(a.codePointAt(i));
            c.add(a.codePointAt(i));
        }

        do {
            swapped = false;
            for (int i = 0; i < b.size() - 1; i++) {
                int x = b.get(i);
                int y = b.get(i + 1);
                if (x > y) {
                    b.set(i, y);
                    b.set(i + 1, x);
                    swapped = true;
                }
            }
        } while (swapped);
        for(int i = 0;i<b.size()-1;i++){
            System.out.print((char)(int)(b.get(i)));
        }
}}
    // public static void upper_to_lower(String path){
    //     StringBuffer b = new StringBuffer();
    //     try{Scanner reader=new Scanner(path);

            
    //         while (reader.hasNextLine()) {
    //             String line=reader.nextLine();

    //             for(int j=0;j<line.length();j++){
    //             char c=reader.nextLine().charAt(j);
    //             if()
    //             }
                
    //         }
    //     }
    //     catch(Exception e){
    //         e.printStackTrace();
    //     }
    // }
