package data.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Entity
@Table(schema = "recipe_book", name = "ingredients")
public class Ingredient {
    @Id
    @Column(name ="id_recipe")
    Integer recipe_id;
    @Column(name = "id_prod")
    Integer product_id;
    @Column(name = "weight")
    Integer weight;
    @Column(name = "is_percent")
    Boolean isPercent;

}
