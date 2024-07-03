import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        if(a<b){
        for(int i=a;i<=b;i++){
            boolean isprime=true;
            for(int j=2;j<=i/2;j++){
                
                if (i%j==0) {
                     isprime=false;
                     break;
                }
            }
        if (isprime) {
            System.out.println(i);
        }
            
        }
       


        }else{
            
            for(int i=a;i<=b;i++){
                boolean isprime=true;
                for(int j=2;j<=i/2;j++){
                    
                    if (i%j==0) {
                         isprime=false;
                         break;
                    }
                }
            if (isprime) {
                System.out.println(i);
            }
            
        }
    }}
}
