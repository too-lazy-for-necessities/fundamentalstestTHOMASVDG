package be.intecbrussel.fundamentals.restaurant.model;

import java.util.List;

public class Ingredient {

    private String ingredientName;
    private List<Allergen> allergens;

    public Ingredient(String ingredientName) { }

    public void addAllergen(Allergen allergens) { }
    public void removerAllergen(Allergen) { }
    public String getIngredientName() { return ingredientName; }
    public List<Allergen> getAllergens() { return allergens; }
    public boolean equals(Object) { }
    public int hashCode() { }

    @Override
    public java.lang.String toString() {
        return "Ingredient{" +
                "String=" + String +
                '}';
    }
}
