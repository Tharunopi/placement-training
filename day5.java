import java.util.*;
public class day5 {
    public static void main(String[] args) {
        // Application building
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Welcome to ATM");
        // System.out.println("For admin login enter 1" + "\n" + "For user login enter 2");
        // int auth = 2;
        // String user_name[] = {"naveen", "aqeel", "selva"}; 
        // String user_password[] = {"naveen01", "aqeel03", "selva02"};
        // int user_balance[] = {45000, 300, 29000};
        
        // switch (auth) {
        //     case 1:
        //     System.out.println("Welcome to admin panel");
        //     break;

        //     case 2:
        //     System.out.println("Welcome to user panel" + "\n" + "Enter user name:");
        //     String name = "naveen";
        //     int count = 0;
        //     System.out.println("Enter user password");
        //     String password = "naveen01";
        //     for(int i=0;i<3;i++){
        //         if(user_name[i].equals(name) && user_password[i].equals(password)){
        //             System.out.println("welcome " + user_name[i]);
        //             System.out.println("1 - deposit" + "\n" + "2 - check balance" + "\n" + "3 - withdraw" + "\n" + "4 - exit");
        //             int oper = 2;
        //             switch (oper) {
        //                 case 1:
        //                     System.out.println("Enter amount to deposit in your account");
        //                     int deposit = 1000;
        //                     System.out.println("your deposit amount is " + 1000);
        //                     user_balance[i] += deposit;
        //                     break;
                        
        //                 case 2:
        //                     System.out.println(user_balance[i]);
        //                     break;

        //                 case 3:
        //                     System.out.println("enter number of 500 notes to withdraw");
        //                     int fn = 3;
        //                     System.out.println("your withdraw amount is " + (fn * 500));
        //                     user_balance[i] -= (fn*3);
        //                     break;

        //                 case 4:
        //                     System.out.println("Exit operation performed");
        //                     i = 0;
        //                     break;
        //                 default:
        //                     System.out.println("Operation not regonized");
        //                     break;
        //             }
        //             break;
        //         }
        //         else{
        //             System.out.println(user_name[i] + " " + name + "\n" + user_password[i] + " " + password);
        //             count++;
        //         }
        //         if(count==3){
        //             System.out.println("your account has been blocked");
        //             break;
        //         }
        //     }
        //     break;
        //     default:
        //     System.out.println("enter valid number");
        //     break;

        // second method

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Welcome to ATM");
        // System.out.println("For admin login enter 1" + "\n" + "For user login enter 2");
        // int auth = sc.nextInt();  
        // sc.nextLine();  

        // String[] user_name = {"naveen", "aqeel", "selva"};
        // String[] user_password = {"naveen01", "aqeel03", "selva02"};
        // int[] user_balance = {45000, 300, 29000};

        // switch (auth) {
        //     case 1:
        //         System.out.println("Welcome to admin panel");
        //         break;

        //     case 2:
        //         System.out.println("Welcome to user panel" + "\n" + "Enter user name:");
        //         String name = sc.nextLine();
        //         System.out.println("Enter user password");
        //         String password = sc.nextLine();
        //         boolean authenticated = false;

        //         for (int i = 0; i < user_name.length; i++) {
        //             if (user_name[i].equals(name) && user_password[i].equals(password)) {
        //                 System.out.println("Welcome " + user_name[i]);
        //                 authenticated = true;
        //                 boolean exit = false;

        //                 while (!exit) {
        //                     System.out.println("1 - Deposit" + "\n" + "2 - Check balance" + "\n" + "3 - Withdraw" + "\n" + "4 - Exit");
        //                     int oper = sc.nextInt();
        //                     switch (oper) {
        //                         case 1:
        //                             System.out.println("Enter amount to deposit in your account");
        //                             int deposit = sc.nextInt();
        //                             user_balance[i] += deposit;
        //                             System.out.println("Your deposit amount is " + deposit);
        //                             break;

        //                         case 2:
        //                             System.out.println("Your current balance is " + user_balance[i]);
        //                             break;

        //                         case 3:
        //                             System.out.println("Enter number of 500 notes to withdraw");
        //                             int fn = sc.nextInt();
        //                             int withdrawAmount = fn * 500;
        //                             if (withdrawAmount <= user_balance[i]) {
        //                                 user_balance[i] -= withdrawAmount;
        //                                 System.out.println("Your withdraw amount is " + withdrawAmount);
        //                             } else {
        //                                 System.out.println("Insufficient balance");
        //                             }
        //                             break;

        //                         case 4:
        //                             System.out.println("Exit operation performed");
        //                             exit = true;
        //                             break;

        //                         default:
        //                             System.out.println("Operation not recognized");
        //                             break;
        //                     }
        //                 }
        //                 break;
        //             }
        //         }
        //         if (!authenticated) {
        //             System.out.println("Invalid credentials. Your account has been blocked.");
        //         }
        //         break;

        //     default:
        //         System.out.println("Enter a valid number");
        //         break;
        // }
        // sc.close();

//         Scanner sc = new Scanner(System.in);
// System.out.println("Welcome to ATM");
// System.out.println("For admin login enter 1" + "\n" + "For user login enter 2");
// int auth = 1;
// String user_name[] = {"naveen", "aqeel", "selva"}; 
// String user_password[] = {"naveen01", "aqeel03", "selva02"};
// int user_balance[] = {45000, 300, 29000};
// String ad_name = "tharun";
// String ad_password = "tharun07";

// switch (auth) {
//     case 1:
//         System.out.println("Welcome to admin panel");
//         boolean as = false;
//         int m_att = 3; 
//         while (m_att > 0) {
//             System.out.println("enter admin name :");
//             String a_name = sc.nextLine();
//             System.out.println("enter admin password");
//             String a_password = sc.nextLine();
//             for (int i = 0; i < 100; i++) {
//                 if (ad_name.equals(a_name) && ad_password.equals(a_password)) {
//                     as = true;
//                     System.out.println("Enter a opertaion to perform" + "\n" + "1 - show stats     2 - delete user" + "\n" + "enter the number to perform operation");
//                     int uvu = sc.nextInt();
//                     switch (uvu) {
//                         case 1:
//                             for (int j = 0; j < user_balance.length; j++) {
//                                 System.out.println("user name " + user_name[j] + " user password " + user_password[j] + " user balance " + user_balance[j]);
//                             }
//                             break;
//                         case 2:
//                         System.out.println("enter the number of user to delete account");
//                             int del = sc.nextInt();
//                             for (int x = 0; x < user_balance.length; x++) {
//                                 user_name[del-1] = "deleted user";
//                                 user_password[del-1] = "deleted user";
//                                 user_balance[del-1] = 0;
//                             }
//                             break;
//                         case 3:
//                         System.out.println("exited");
//                         i = 1000;
//                         break;
//                         default:
//                         System.out.println("enter valid operation");
//                             break;
//                     }
    
//                 }
//             }

//         if (!as) {
//             m_att--;
//             if (m_att > 0) {
//                 System.out.println("you have " + m_att + " attempts left");
//             }else{
//                 System.out.println("you are not admin");
//             }
//         }
//         }
//         break;

//     case 2:
//         int attempts = 3; 
//         boolean loginSuccess = false;
            
//         while (attempts > 0 && !loginSuccess) {
//             System.out.println("Enter user name:");
//             String name = sc.nextLine();
//             System.out.println("Enter user password");
//             String password = sc.nextLine();
            
//             for(int i = 0; i < user_name.length; i++) {
//                 if(user_name[i].equals(name) && user_password[i].equals(password)) {
//                     loginSuccess = true;
//                     System.out.println("welcome " + user_name[i]);
//                     System.out.println("1 - deposit" + "\n" + "2 - check balance" + "\n" + "3 - withdraw" + "\n" + "4 - exit");
//                     int oper = 2;
//                     switch (oper) {
//                         case 1:
//                             System.out.println("Enter amount to deposit in your account");
//                             int deposit = 1000;
//                             System.out.println("your deposit amount is " + deposit);
//                             user_balance[i] += deposit;
//                             break;
                        
//                         case 2:
//                             System.out.println(user_balance[i]);
//                             break;

//                         case 3:
//                             System.out.println("enter number of 500 notes to withdraw");
//                             int fn = 3;
//                             System.out.println("your withdraw amount is " + (fn * 500));
//                             user_balance[i] -= (fn * 500);
//                             break;

//                         case 4:
//                             System.out.println("Exit operation performed");
//                             break;
//                         default:
//                             System.out.println("Operation not recognized");
//                             break;
//                     }
//                     break;
//                 }
//             }
            
//             if (!loginSuccess) {
//                 attempts--;
//                 if (attempts > 0) {
//                     System.out.println("Invalid username or password. You have " + attempts + " attempts left.");
//                 } else {
//                     System.out.println("Too many failed attempts. Your account is blocked.");
//                     System.out.println("Bye");
//                 }
//             }
//         }
//         break;
//     default:
//         System.out.println("enter valid number");
//         break;
// }

        //Strings
        // String a = "mlam";
        // int count = 0;
        // int flag = 0;
        // for (int i = a.length()-1; i > -1; i--) {
        //     if(a.charAt(i)== a.charAt(count)){

        //         flag++;
        //     }
        //     count++;
        // }
        // if(flag == a.length()){
        //     System.out.println("palindrome");
        // }
        // else{
        //     System.out.println("not palindrome");
        // }

//         String a = "hi, iam mahi and im fine          and tooo late";

//         a =a.strip().toLowerCase();
//         int count = 0;
//         for(int i = 0;i<a.length();i++ ) {
//             if ((int)a.charAt(i) == 32 && (int)a.charAt(i+1) != 32 ) {
//                 count++;
//             }
//         }
//         System.out.println(count+1);

// System.out.println();

//         String a = "find";
//         int count = 0;
//         for (int i = 0; i < a.length(); i++) {
//             if(count < a.length()){
//                 System.out.println(a.charAt(count));
//             }
//         count++;
//         }
// }
// }
        
        
    
