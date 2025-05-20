public class OPPS {
    int a = 2;
    static int b = 9;

    public static void main(String[] args) {
        int d = 35;
        OPPS obj1 = new OPPS();
        OPPS obj2 = new OPPS();

        System.out.println(obj1.a);   
        System.out.println(OPPS.b);   

        obj1.a = 23;
        System.out.println(obj1.a);  

        OPPS.b = 8;                   
        System.out.println(OPPS.b);   
        System.out.println(obj2.a);
        System.out.println(d);
    }
}
