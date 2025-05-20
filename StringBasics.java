public class StringBasics {
    public static void main(String[] args) {
        // Declare and initialize strings
        String name = "Alice";
        String greeting = "Hello";

        // Concatenate strings
        String message = greeting + ", " + name + "!";
        System.out.println("Message: " + message);

        // String length
        System.out.println("Length of name: " + name.length());

        // Accessing characters
        System.out.println("First character of name: " + name.charAt(0));

        // Substring
        System.out.println("Substring of name: " + name.substring(1, 4));

        // Convert to uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        // Check if string contains a substring
        System.out.println("Contains 'lic': " + name.contains("lic"));

        // Compare strings
        String anotherName = "Alice";
        System.out.println("name equals anotherName: " + name.equals(anotherName));

        // String comparison ignoring case
        System.out.println("Equals ignore case: " + name.equalsIgnoreCase("alice"));
    }
}
