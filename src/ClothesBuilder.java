public class ClothesBuilder {
    private Category category;
    private String size;
    private String color;

    public ClothesBuilder setCategory(Category category) {
        this.category = category;
        return this;
    }

    public ClothesBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public ClothesBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Clothes build() {
        return new Clothes(this.category, this.size, this.color);
    }
}