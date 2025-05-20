public class call {
    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 8;
        call obj = new call();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        obj.swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}