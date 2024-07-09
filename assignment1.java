public class assignment1 {

    public int units;
    public int price;
    public static int reading(int units){
        int consumed_units = units;
        return consumed_units;
    }

    public static int calculate(int consumed_units, int price){
        int payment = consumed_units * price;
        return payment;
    }
    public static void main(String[] args) {
        assignment1 assesor = new assignment1();
        int consumed_units = assesor.reading(12);
        System.out.println(assesor.calculate(consumed_units, 4));
    }
}
