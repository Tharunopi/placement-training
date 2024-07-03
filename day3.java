public class day3 {
    public static void main(String[] args) {
    //     int x = 30;
    //     int y = 20;

    //     if(x>y){
    //         int temp = x;
    //         x = y;
    //         y = temp;

    //     }
        
    //     for (int i = x; i < y; i++) {
    //         boolean prime = true;
    //         for (int j = 2; j <= Math.sqrt(i); j++) {
    //             if(i%j==0){
    //                 prime = false;
    //                 break;
    //             }
    //         }
        
    //     if(prime){
    //         System.out.println(i);
    //     }
    // }

        // array

        // int[] num = {1,2,3,4,5,6,7,8,9,10};
        // for (int i:num) {
        //     if(i <= 1){
        //         System.out.println("");
        //     }
        //     else{
        //         boolean pr = true;
        //         for (int j = 2; j <= Math.sqrt(i); j++) {
        //             if(i%j == 0){
        //                 pr = false;
        //             }
        //         }
        //     if(pr){
        //         System.out.println(i);
        //         }
        //     }
        // }

        // int []a = {1,2,3,4,5};
        // int []b = {6,7,8,9,10};
        // for (int i = 0; i < b.length; i++) {
            
        //     System.out.println(b[b.length - 1 -i]);
        //     System.out.println(a[i]);
        // }

        // int a[] = {1,2,3,4,5};
        // int b[] = new int[a.length];
        // for(int i = 0;i<a.length; i++){
        //     b[i] = a[i];
        //     System.out.println(b[i]);
        // }
        
        // int a[] = {1,2,3,4};
        // int b[] = {1,3,3,4};
        // boolean v = true;
        // for(int i = 0; i < a.length;i++){
        //     if(a[i] != b[i]){
        //         v = false;
        //     }
        // }
        // System.out.println(v);

        // int a[] = {1,2,3,4};
        // int b[] = {4,3,2,1};
        // boolean v = true;
        // for (int i= 0;i<a.length;i++) {
        //     boolean f = false;
        //     for (int j = 0; j<a.length; j++) {
        //         System.out.println(i + " " + j);
        //         if(a[i] == b[j]){
        //             f = true;
        //             break;
        //         }
        //     }
        //          if(f==false){
        //             v = false;
        //             break;
        //         }
        
    // }
    // System.out.println(v);
    // }

        // int a[] = {-1,-2,-3,-4};
        // int max = 0;
        // max = a[1];
        // for(int i:a){
        //     if(max<i){
        //         max = i;
        //     }
        // }
        // System.out.println(max);

        // int a[] = {-2,-3,-1,-4};
        // int max = -11111;
        // int sec = -1111;
        // for(int i:a){
        //     if(max<i){
        //         sec = max;
        //         max = i;
        //     }else if(sec<i && i != max){
        //         sec = i;
        //     }
        // }
        // System.out.println(max);
        // System.out.println(sec);  

        int a[] = {2,1,2,3,4,1,5,6,3,3};
        int count = 0;
        for (int i = 0;i<a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                if(j != i){
                    if(a[j] == a[i]){
                        System.out.println(a[i]);
                        break;
                    }
                }
            }
            
        }
    }
    
    }

