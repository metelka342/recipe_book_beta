package logic;

import data.entities.Recipe;
import data.repositoryies.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe findRecipeByID(long id) {
        return recipeRepository.getOne(id);
    }

    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    public Recipe addRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void deleteById(long id) {
        recipeRepository.deleteById(id);
    }

    /* public List<Recipe> getFast(){
        return recipeRepository.
    }*/
}