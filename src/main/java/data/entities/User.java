package data.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Table(schema = "recipe_book", name = "users")
public class User {
    @Id
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "des")
    private String description;
    @Column(name = "mail")
    private String mail;
}
