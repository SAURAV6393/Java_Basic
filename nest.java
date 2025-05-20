public class  nest {
    int num1, num2;

    // Constructor
    public  nest(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // Method to print the sum
    void printSum() {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
         nest obj = new  nest(3, 5);
        obj.printSum();
    }
}
