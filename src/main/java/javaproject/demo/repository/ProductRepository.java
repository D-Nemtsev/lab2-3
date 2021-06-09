package javaproject.demo.repository;
import javaproject.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductsBySupplier_Id(Long id);
}
