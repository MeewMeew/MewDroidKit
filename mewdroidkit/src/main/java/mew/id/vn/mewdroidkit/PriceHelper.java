package mew.id.vn.mewdroidkit;
import java.text.NumberFormat;
import java.util.Locale;

public class PriceHelper {
    private static NumberFormat numberFormat(Locale locale) {
        return NumberFormat.getCurrencyInstance(locale);
    }
    public static String format(double price) {
        return PriceHelper.numberFormat(Locale.getDefault()).format(price);
    }

    public static String format(double price, String language, String country) {
        return PriceHelper.numberFormat(new Locale(language, country)).format(price);
    }
}
