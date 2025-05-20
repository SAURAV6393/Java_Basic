public class Marks {
    public static class Student{
        String name;
        double percentage;
        int roll;

    };
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "saurav";
        s.percentage = 89;
        s.roll = 45;
        System.out.println(s.name);
        System.out.println(s.percentage);
        System.out.println(s.roll);

    }
}
