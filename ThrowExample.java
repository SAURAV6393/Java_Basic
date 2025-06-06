public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        int[] testAges = {16, 18, 21};
        for (int age : testAges) {
            try {
                System.out.print("Checking age " + age + ": ");
                checkAge(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }
}
