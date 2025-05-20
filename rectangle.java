public class rectangle {
    private float width;
    private float height;

    public rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    void calculate() {
        System.out.println("Area: " + (width * height));
        System.out.println("Perimeter: " + (2 * (width + height)));
    }

    void setWidth(float width) {
        this.width = width;
    }

    void setHeight(float height) {
        this.height = height;
    }

    float getWidth() {
        return width;
    }

    float getHeight() {
        return height;
    }

    public static void main(String[] args) {
        rectangle a = new rectangle(0, 0); // initialize with default values
        a.calculate();
        a.setWidth(4);
        a.setHeight(6);
        a.calculate();
    }
}
