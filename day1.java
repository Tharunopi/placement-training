import java.util.Scanner;
class day1 {
    public static void main(String args[]){

        // getting input user

        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("enter number:");
        // int b = sc1.nextInt();
        // sc1.nextLine();
        // String a = sc1.nextLine();
        // sc1.close();
        // System.out.println(a);
        // System.out.println(b);

        // ternery operator

        // int a = 10;
        // String b = (a>0)? "+":"-";
        // System.out.println(b);

        // Branching statement in java are used to control the flow of execution in a program based on certain conditions
        
        // if-else statement

    //     int a = 20;
    //     int b = 30;
    //     int c = 40;

    //     if(a>b){
    //         if(a>c){
    //             System.out.println("a is greater "+a);
    //         }
    //     }else if(b>c){{
    //             System.out.println("b is greater "+b);
    //         }
    //     }else{
    //         System.out.println("c is greater "+c);
        
    
        
    // }

        // int a = 20;
        // int b = 0;
        // int c = 40;

        // if(a>b){
        //     if(a<c){
        //         System.out.println("a is middle "+a);
        //     }
        // }else if(b<c){
        //     if(b>a)
        //     {
        //         System.out.println("b is middle "+b);
        //     }
        // }else{
        //     System.out.println("c is middle "+c);
        
        // Scanner sc = new Scanner(System.in);
        // char asc = sc.next().charAt(0);
        // int a = asc;
        // if(a>=64 && a<=90){
        //     System.out.println("upper case");
        // }else if(a>=97 && a<=122){
        //     System.out.println("lower case");
        // }else if(a>=48 && a<=57){
        //     System.out.println("numeric");
        // }else{
        //     System.out.println("special caracter");
        // }

        char a = 'a';
        int b = a;
        if(b>=64 && b<=90){
            System.out.println((char)(a+32));
        }
        else if(b>=97 && b<=122){
            System.out.println((char)(a-32));
        }
        else{
            System.out.println("Enter valid character");
        }
    }}