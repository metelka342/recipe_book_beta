package view;

import data.entities.Product;
import data.entities.Recipe;
import logic.RecipeService;
import org.hibernate.Hibernate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @DeleteMapping("/recipes/{id}")
    public void delete(@PathVariable Long id) {
        recipeService.deleteById(id);
    }

    @GetMapping("/recipes")
    public List<Recipe> getRecipes() {
        return recipeService.findAll();
    }

    @GetMapping("/recipe/{id}")
    public Recipe getRecipe_byID(@PathVariable Long id) {
        Hibernate.initialize(recipeService.findRecipeByID(id));
        return recipeService.findRecipeByID(id);
    }

    @PostMapping("/recipe/new")
    public List<Recipe> newRecipe(@RequestBody Recipe recipe) {
    recipeService.addRecipe(recipe);
    return recipeService.findAll();
    }
}
