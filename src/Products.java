public interface Products { // incorporates visitor from clothing visitor
    void accept(ClothingVisitor visitor);
}
