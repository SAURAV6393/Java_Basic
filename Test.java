class Test {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            float d = (float) i / j;
            System.out.println("Division = " + d);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No data in Array");
        } catch (NumberFormatException e) {
            System.out.println("Data must be integer");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
        System.out.println("End of program");
}