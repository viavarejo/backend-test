package php.backendtest.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "paymentInfo_tb")
public class PaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    @Column(precision = 6, scale = 2)
    private BigDecimal entry;

    private Integer numberOfInstallments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getEntry() {
        return entry;
    }

    public void setEntry(BigDecimal entry) {
        this.entry = entry;
    }

    public Integer getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(Integer numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }
}
