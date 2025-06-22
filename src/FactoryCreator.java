class FactoryCreator { // incorporates enums
    public Products createProduct(Category category) throws Exception {
        switch (category) {
            case Women:
                return new WomenClothing();
            case Men:
                return new MenClothing();
            case Children:
                return new ChildrenClothing();
            case Sale:
                return new SaleClothing();
            default:
                throw new Exception("INVALID CATEGORY");
        }
    }
}
