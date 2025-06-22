// Step 1: Define the Visitor interface
interface ClothingVisitor {
    void visit(WomenClothing clothing);
    void visit(MenClothing clothing);
    void visit(ChildrenClothing clothing);
}
