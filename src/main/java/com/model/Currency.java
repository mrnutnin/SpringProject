package com.model;

//import java.util.Arrays;

public enum Currency {

    THB(),
    USD(), 
    BTC(CurrencyType.CRYPTO), 
    ETH(CurrencyType.CRYPTO), 
    XRP(CurrencyType.CRYPTO),
    LTC(CurrencyType.CRYPTO), 
    BCH(CurrencyType.CRYPTO);

    /*
     * private static Currency[] fiatCurrencies; private static Currency[]
     * cryptoCurrencies;
     */
    private final CurrencyType type;

    Currency(CurrencyType type) {
        this.type = type;
    }

    Currency() {
        this(CurrencyType.FIAT);
    }

    public CurrencyType getType() {
        return type;
    }

    enum CurrencyType {
        FIAT, CRYPTO
    }

    /*
     * public static Currency[] getFiatCurrencies() { if (fiatCurrencies == null) {
     * fiatCurrencies =
     * Arrays.stream(values()).filter(Currency::isFiat).toArray(Currency[]::new); }
     * return fiatCurrencies; }
     * 
     * public static Currency[] getCryptoCurrencies() { if (cryptoCurrencies ==
     * null) { cryptoCurrencies =
     * Arrays.stream(values()).filter(Currency::isCrypto).toArray(Currency[]::new);
     * } return cryptoCurrencies; }
     * 
     * public boolean isFiat() { return CurrencyType.FIAT == this.type; }
     * 
     * public boolean isCrypto() { return CurrencyType.CRYPTO == this.type; }
     */

}
