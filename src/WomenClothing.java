public class WomenClothing implements Products, Gender_Check, Order {
    @Override
    public void check() {
        System.out.println("Checking for Women clothing.");
    }

    @Override
    public void accept() {
        System.out.println("Accepting order.");
    }

    @Override
    public void accept(ClothingVisitor visitor) {
        visitor.visit(this); // Calls visitor's visit method
    }
}




