public class assginment0 {
    public String movie_name;
    public int run_time;

public void watch_movie(String movie_name, int run_time){
    System.out.println("Watching " + movie_name);
    System.out.println("Show Time is " +run_time);
}
public static void main(String[] args) {
    assginment0 m1 = new assginment0();
    assginment0 m2 = new assginment0();
    m1.watch_movie("jailer", 630);
    System.out.println();
    m2.watch_movie("leo", 7);
}
}
