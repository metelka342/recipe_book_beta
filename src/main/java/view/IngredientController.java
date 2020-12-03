package view;

import data.entities.Ingredient;
import data.entities.User;
import logic.IngredientService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("api")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/ingredients/{id}")
    public List<Ingredient> recipes_ingredients(@PathVariable Long id) {
        return ingredientService.findIngredientsInRecipe(id);
    }


    @GetMapping("/ingredients")
    public List<Ingredient> allIngredients() {
        return ingredientService.findAll();
    }

    @PostMapping
    public List<Ingredient> addNewIngredient(@RequestBody Ingredient ingredient) {
        ingredientService.addIngredient(ingredient);
        return ingredientService.findAll();
    }


    @DeleteMapping("/ingredient/delete/{id}")
    public List<Ingredient> deleteRecipeIngredients(@PathVariable Long id) {
        ingredientService.deleteIngredient(id);
        return ingredientService.findAll();
    }
}