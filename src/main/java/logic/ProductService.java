package logic;

import data.entities.Product;
import data.repositoryies.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product findById(long id) {
        return repository.getOne(id);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product append(Product product) {
        return repository.save(product);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }
}
