public class assignment2 {
    int a;
    int b;

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {
        assignment2 cal = new assignment2();
        System.out.println(cal.add(20, 10));
        System.out.println(cal.sub(20, 10));
        System.out.println(cal.mul(20, 10));
        System.out.println(cal.div(20, 10));
    }
}
