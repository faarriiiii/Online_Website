
class ChildrenClothing implements Products, Order {

    public void check() {
        System.out.println("Checking for Children's clothing.");
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


