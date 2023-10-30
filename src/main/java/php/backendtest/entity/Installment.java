package php.backendtest.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity(name = "installment_tb")
public class Installment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PaymentInfo paymentInfo;

    private Integer installmentOfNumber;

    @Column(precision = 6, scale = 2)
    private BigDecimal price;

    @Column(precision = 6, scale = 6)
    private BigDecimal monthlyInterestRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public Integer getInstallmentOfNumber() {
        return installmentOfNumber;
    }

    public void setInstallmentOfNumber(Integer installmentOfNumber) {
        this.installmentOfNumber = installmentOfNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(BigDecimal monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }
}
