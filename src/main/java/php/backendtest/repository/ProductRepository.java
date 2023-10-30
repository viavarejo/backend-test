package php.backendtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import php.backendtest.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
