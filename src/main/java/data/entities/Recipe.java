package data.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import data.enums.RecipeType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Table(schema = "recipe_book", name = "recipes")
public class Recipe {
    @Id
    private Long id;
    @Column(name = "id_user")
    private Long user_id;
    @Column(name = "type")
    private RecipeType type;
    @Column(name = "manual")
    private String guide;
    @Column(name = "difficulty")
    private Short difficulty;
    @Column(name = "time")
    private String time;
    @Column(name = "count_serving")
    private Short serving;

}
