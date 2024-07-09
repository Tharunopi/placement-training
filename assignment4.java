public class assignment4 {

    public static int book_tickets(int amount){
        int ticket_price = 120;
        int balance = amount - ticket_price;
        return balance;
    }
    public static void main(String[] args) {
        assignment4 raja = new assignment4();
        int balance = raja.book_tickets(200);
        System.out.println("The balance is :" + balance);
    }
}
