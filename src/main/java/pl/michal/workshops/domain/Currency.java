package pl.michal.workshops.domain;


public enum Currency {
    EUR("EUR"),
    USD("USD"),
    PLN("PLN"),
    CHF("CHF");

    public final String currency;

    Currency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
