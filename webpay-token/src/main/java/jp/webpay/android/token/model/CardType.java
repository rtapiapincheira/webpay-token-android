package jp.webpay.android.token.model;

import java.util.Arrays;
import java.util.List;

/**
 * This enum represents card types (brands) that WebPay supports.
 * Changing the name breaks compatibility, be careful.
 */
public enum CardType {
    VISA("Visa"),
    MASTERCARD("MasterCard"),
    JCB("JCB"),
    AMERICAN_EXPRESS("American Express"),
    DINERS_CLUB("Diners Club");

    private final String name;

    CardType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CardType byName(String name) {
        for (CardType type : CardType.values())
            if (type.getName().equals(name))
                return type;
        throw new IllegalArgumentException("No constant with name " + name + " found");
    }

    public static List<CardType> VM() {
        return Arrays.asList(VISA, MASTERCARD);
    }

    public static List<CardType> All() {
        return Arrays.asList(values());
    }
}
