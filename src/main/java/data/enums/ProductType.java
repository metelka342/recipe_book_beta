package data.enums;

// ('meat', 'fish', 'vegetable', 'spice', 'fruit', 'cheese', 'drink', 'snack', 'sauce', 'alcohol');
//
//  ('soup', 'hot', 'cocktail', 'snack', 'salad');
public enum ProductType {
    MEAT("meat"),
    FISH("fish"),
    VEGETABLE("vegetable"),
    SPICE("spice"),
    FRUIT("fruit"),
    CHEESE("cheese"),
    DRINK("drink"),
    SNACK("snack"),
    SAUCE("sauce"),
    ALCOHOL("alcohol");

    private String name;

    ProductType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
