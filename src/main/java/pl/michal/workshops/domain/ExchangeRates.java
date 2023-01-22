package pl.michal.workshops.domain;

public enum ExchangeRates {
    PLN(1.0f),
    EUR(4.23f),
    USD(3.72f),
    CHF(3.83f);

    public final float rate;

    ExchangeRates(final float rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "rate=" + rate +
                '}';
    }

    public float getRate() {
        return rate;
    }

}
