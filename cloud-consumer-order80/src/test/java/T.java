import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-04-03-11:52
 */
public class T {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        BigDecimal amount = new BigDecimal(1051);
        BigDecimal rate = new BigDecimal(0.9817);
        BigDecimal result = amount.multiply(rate).divide(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_DOWN);
        System.out.println(result.multiply(new BigDecimal(100)));
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
    }
}
