import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task18 {
    public static void main(String[] args) {
    //    String r = "100";
    //    String k = "2.4462";
    //    convert(r, k);
    }

    //  для операций с деньгами используем класс java.math.BigDecimal
    public static void convert(String rub, String kyrs) {
        BigDecimal rubley = new BigDecimal(rub);
        BigDecimal exchangeRates = new BigDecimal(kyrs);
        //  чтобы не было ArithmeticException и для удобства округляем до копеек(2 знака после запятой),
        //  округляем с помощью .setScale(scale, roundingMode)
        BigDecimal value = rubley.divide(exchangeRates,2, RoundingMode.HALF_DOWN);
        System.out.println(value);
    }
}