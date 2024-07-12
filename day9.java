import java.util.*;
public class day9 {
    public static void main(String[] args) {
    //     Map<Integer, String> a = new HashMap<>();
    //     Scanner sc = new Scanner(System.in);
    //     // a.forEach((i, j)->System.out.println(i + " " + j));
    //     System.out.println("enter the keys and values");
    //     for (int i = 0; i <5; i++) {
    //         int key = sc.nextInt();
    //         sc.nextLine();
    //         String value = sc.nextLine();
    //         a.put(key, value);
    //     }
    //     a.forEach((i, j)-> System.out.println(i + " " + j));
    // }
    Map<Integer, String> a = new HashMap<>();
    a.put(99, "admin");
    Map<Integer, String> b = new HashMap<>();
    Map<Date, String> c = new HashMap<>();
    Date date = new Date();
    Scanner sc = new Scanner(System.in);
    boolean auth = true;
    while(auth){
        System.out.println("enter the action to perform 1 - add "+"\n"+"2 - exit");
        int i = sc.nextInt();
        switch (i) {
            case 1:
            System.out.println("enter the number of entries");
            int val = sc.nextInt();
            for (int j = 0; j <val; j++) {
                System.out.println("create new id");
                int keys = sc.nextInt();
                System.out.println("progress -------33%");
                sc.nextLine();
                System.out.println("enter the user name");
                String values = sc.nextLine();
                System.out.println("progress --------------66%");
                System.out.println("enter your email");
                String email = sc.nextLine();
                System.out.println("progress ---------------------99%");
                if (a.containsKey(keys)) {
                    System.out.println("the already present action terminated!!");
                    val -= 1;
                }else{
                    a.put(keys, values);
                    b.put(keys, email);
                }
                Date date1 = new Date();
            c.put(date1, "new entry added by " + values);
            }
            System.out.println("enter your id");
            int id = sc.nextInt();
            String admin = a.get(id);
            System.out.println("you have added " + val + " entries");
            System.out.println("1 - search" + "\n" + "2 - delete" + "\n" + "3 - replace" + "\n" + "4 - print db");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                System.out.println("enter id to search");
                int find = sc.nextInt();
                if(a.containsKey(find)){
                    System.out.println(find + " " + a.get(find));
                }else{
                    System.out.println("unable to find the entry");
                }
                Date date2 = new Date();
                c.put(date2, "search operation performed by " + admin);
                    break;
                case 2:
                System.out.println("enter id to delete");
                int del = sc.nextInt();
                a.remove(del);
                b.remove(del);
                System.out.println("deletion of " + del + " id is success");
                System.out.println("updated db - " + a);
                Date date3 = new Date();
                c.put(date3, "delete operation performed by " + admin);
                break;
                case 3:
                System.out.println("enter the id to replace");
                int rep = sc.nextInt();
                if (a.containsKey(rep)) {
                    System.out.println("enter the name to replace");
                    String name_rep = sc.next();
                    a.replace(rep, name_rep);
                    System.out.println("note email cannot be changed");
                    System.out.println("updated db - " + a);
                }
                Date date4 = new Date();
                c.put(date4, "replace operation performed by " + admin);
                break;
                case 4:
                System.out.println("total entries " + a.size());
                System.out.println(a);
                Date date5 = new Date();
                c.put(date5, "view operation performed by " + admin);
                break;
                default:
                System.out.println("Warning:operation cannot be recoginized!!");
                    break;
            }
            
            break;
            case 2:
            auth = false;
            break;
            default:
            System.out.println("enter vaild number");
                break;
        }
    
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c + " total " + c.size() + "\n" + " operations performed_________");
}
}