import java.math.BigDecimal;

public class ConvModel {

    public static final BigDecimal DEFAULT_RON_EUR = BigDecimal.valueOf(5.00);
    public static final BigDecimal DEFAULT_RON_USD = BigDecimal.valueOf(4.82);
    public static final BigDecimal DEFAULT_EUR_USD = BigDecimal.valueOf(1.03);

    private BigDecimal RON_EUR = DEFAULT_RON_EUR;
    private BigDecimal RON_USD = DEFAULT_RON_USD;
    private BigDecimal EUR_USD = DEFAULT_EUR_USD;

    private BigDecimal sum;

    public ConvModel() {
        sum = BigDecimal.ZERO;
    }

    public void multiply(BigDecimal value, BigDecimal scale) {
        sum = value.multiply(scale);
    }

    public void divide(BigDecimal value, BigDecimal scale) {
        sum = value.divide(scale, 2, BigDecimal.ROUND_HALF_UP); // Rotunjire la 2 zecimale
    }
    public BigDecimal getSum() {
        return sum;
    }

    public BigDecimal getRonToEur() {
        return RON_EUR;
    }

    public BigDecimal getRonToUsd() {
        return RON_USD;
    }

    public BigDecimal getEurToUsd() {
        return EUR_USD;
    }
}
