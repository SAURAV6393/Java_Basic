import java.io.*;

class Test {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("MyFile.txt");

            // Read all bytes from the file
            byte[] b = fis.readAllBytes();

            // Print each byte as character
            for (int i = 0; i < b.length; i++) {
                System.out.print((char) b[i]);
            }

            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
