public class day4 {
    public static void main(String[] args) {
//         int a[] = {5,2,3};
//         boolean b = true;
//         String ones[] = {"one hunderd and", "two hunderd and", "three hunderd and", "four hunderd and", "five hunderd and", "six hunderd and", "seven hunderd and", "eight hunderd and", "nine hunderd and"};
//         String twos[] = {"ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
//         String three[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//         for (int i: a) {
//             for (int j = 0; j < ones.length; j++) {
//                 if(i==j){
//                     System.out.print(ones[j-1] + " ");
//                     b = false;
//                 }
//             }
//         if (b == false) {
//             break;
            
//         }
//     }
//         for (int x = 0; x<twos.length;x++) {
//             if(x==1){
//             for (int j = 0; j < twos.length; j++) {
//                 if(x==j){
//                     System.out.print(twos[j] + " ");
//                     b = false;
//                 }
//             }
//         if (b == false) {
//             break;
            
//         }
//     }
//     }
//     for (int x = 0; x<three.length;x++) {
//         if(x==2){
//         for (int j = 0; j < three.length; j++) {
//             if(x==j){
//                 System.out.print(three[j] + " ");
//                 b = false;
//             }
//         }
//     if (b == false) {
//         break;
        
//     }
// }
// }

//         int a[] = {5,0,1};
//         boolean b = true;
//         String ones[] = {"one hunderd ", "two hunderd ", "three hunderd ", "four hunderd ", "five hunderd ", "six hunderd", "seven hunderd ", "eight hunderd ", "nine hunderd "};
//         String twos[] = {"","ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
//         String three[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//         for (int i: a) {
//             for (int j = 0; j < ones.length; j++) {
//                 if(i==j){
//                     System.out.print(ones[j-1] + " ");
//                     b = false;
//                 }
//             }
//         if (b == false) {
//             break;
            
//         }
//     }
//         for (int x = 0; x<twos.length;x++) {
//             if(x==1){
//             for (int j = 0; j < twos.length; j++) {
//                 if(a[x]==j){
//                     System.out.print(twos[j] + " ");
//                     b = false;
//                 }
//             }
//         if (b == false) {
//             break;
            
//         }
//     }
//     }
//     for (int x = 0; x<three.length;x++) {
//         if(x==2){
//         for (int j = 0; j < three.length; j++) {
//             if(a[x]==j){
//                 System.out.print(three[j] + " ");
//                 b = false;
//             }
//         }
//     if (b == false) {
//         break;
        
//     }
// }
// }
        // int a[] = {1,0,0};
        // String ones[] = {"one hunderd  ", "two hunderd ", "three hunderd ", "four hunderd ", "five hunderd ", "six hunderd", "seven hunderd ", "eight hunderd ", "nine hunderd "};
        // String twos[] = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
        // String three[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // System.out.print(ones[(a[0]-1)] + " ");
        // System.out.print(twos[(a[1])] + " ");
        // System.out.print(three[(a[2])]);

        // int a[][] = {{1,2,3},
        //             {4,5,6,},
        //             {7,8,9}};
        // int count = 0;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length; j++) {
        //         if(count == i && count == j){
        //             System.out.println(a[i][j]);
        //         }
        //         else{
        //             if(count==0){
        //                 continue;
        //             }
        //             else if(count == 1){
        //                 System.out.print(" ");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     }
        // count++;
        // }

        // int a[][] = {{1,2,3},
        //             {4,5,6,},
        //             {7,8,9}};
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length; j++) {
        //         if(i + j == 2){
        //             System.out.print(a[i][j]);
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        // System.out.println();
        // }

        // int a[][] = {{1,2,3},
        //             {4,5,6,},
        //             {7,8,9}};
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[1].length; j++) {
        //         if(i + j == 0 || i - j == 2 || i - j == -2 || i * j == 4){
        //             System.out.print(a[i][j]);
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        // System.out.println();
        // }

        // int a[][] = {{1,2,3},
        //             {4,5,6,},
        //             {7,8,9}};
        // int temp = 0;
        // int b[][] = new int[a.length][a[0].length];
        // for (int i = 0; i < a[1].length; i++) {
        //     for (int j = 0; j < a.length; j++) {
        //         temp = a[j][i];
        //         b[i][j] = temp;
        //         System.out.print(b[i][j]);
        //     }
        // System.out.println();
        // }

        int a[][] = {{1,2,3},
                    {4,5,6,},
                    {7,8,9}};
        int temp = 0;
        int b[][] = new int[a.length][1];
        for (int i = 0; i < a[1].length; i++) {
            System.out.println(b[i][0]);
        }


    }}