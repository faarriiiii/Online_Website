public class Main {
    public static void main(String[] args) throws Exception {
        // Using Singleton DesignFactory
        DesignFactory df = DesignFactory.getInstance();

        // Using FactoryCreator to create products
        FactoryCreator fc = new FactoryCreator();
        Products product = fc.createProduct(Category.Women);
        if (product instanceof WomenClothing) {
            WomenClothing womenClothing = (WomenClothing) product;
            womenClothing.check();
            womenClothing.accept();
            Cart cart = Cart.getInstance();
            cart.updateItemCart();
            System.out.println("Added Women's clothing");
        }

        Products product2 = fc.createProduct(Category.Men);
        if (product instanceof MenClothing) {
            MenClothing menClothing = (MenClothing) product2;
            menClothing.check();
            menClothing.accept();
            Cart cart = Cart.getInstance();
            cart.updateItemCart();
            System.out.println("Added Men's clothing");
        }



        Products product3 = fc.createProduct(Category.Children);
        if (product3 instanceof ChildrenClothing) {
            ChildrenClothing childrenClothing = (ChildrenClothing) product3;
            childrenClothing.check();
            childrenClothing.accept();
            Cart cart = Cart.getInstance();
            cart.updateItemCart();
            System.out.println("Added Children's clothing");
        }


        //instanceof is a built-in operator in Java, and is used to check
        // if an object belongs to a specific class or implements a certain interface.

        // Using Builder pattern to create Clothes

        Clothes clothes = new ClothesBuilder()
                .setCategory(Category.Men)
                .setSize("L")
                .setColor("Blue")
                .build();

        // Using CartSingleton
        Cart cart = Cart.getInstance();
        cart.completePurchase();

        System.out.println("Items in cart: " + cart.getItemCart());
    }
}