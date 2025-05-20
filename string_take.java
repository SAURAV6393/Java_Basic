public class string_take {
    public static void main(String args[]) {
        System.out.println("saurav rajput");

        if (args.length >= 2) {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[0] + args[1]);
        } else {
            System.out.println("Please provide two command-line arguments.");
        }
    }
}
