public class Lesson {
    public static void main(String[] args) {
        int days = 234;
        int weeks = 0;
        int a = 0;
        for (int i = 0; i < days; i++) {
            if(a==7){
                weeks = weeks +1;
                a = 0;
            }
            a++;
        }
        System.out.println(weeks);
    }
}
