package logic;

import data.entities.Ingredient;
import data.entities.Recipe;
import data.repositoryies.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class IngredientService {
    private IngredientRepository ingredientRepository;

    @Autowired
    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> findIngredientsInRecipe(long id) {
        return ingredientRepository.findAllById(Collections.singleton(id));
    }

    public List<Ingredient> findAll() {
        return ingredientRepository.findAll();
    }

    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public void deleteIngredient(long id) {
        ingredientRepository.deleteById(id);
    }
    /*
     * я хочу знать как обращаться к значениям полей, чтобы
     * фильтровать и получать объекты
     */

}
