package data.enums;

public enum  RecipeType {
    SOUP("meat"),
    COCKTAIL("fish"),
    SALAD("vegetable"),
    SNACK("spice");
    private String typeName;

     RecipeType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
