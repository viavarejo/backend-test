package php.backendtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import php.backendtest.entity.PaymentInfo;

@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Long> {
}
