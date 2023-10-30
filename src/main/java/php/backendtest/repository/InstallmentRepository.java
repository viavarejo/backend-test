package php.backendtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import php.backendtest.entity.Installment;

@Repository
public interface InstallmentRepository extends JpaRepository<Installment, Long> {
}
