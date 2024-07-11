public class assignment5 {
    
}

class school{
    int mark;
    private int salary = 0;
    static String school_name = "Adharsh_vidhalaya";

    public void conduct_exams(){
        System.out.println("exam scheduled at 3-10-2025");
    }

    public void publish_results(int mark){
        System.out.println(mark);
    }
}

class teacher extends school {
    public static void main(String[] args) {
        school a = new school();
        a.conduct_exams();
        a.publish_results(75);
        System.out.println(school_name);
        System.out.println();
    }
}
