package com.favero.exchangerate.exchangeRate.model;

public class ExchangeRateModel {

    private String country;
    private String exchangeRate;

    public ExchangeRateModel(String country, String exchangeRate) {
        this.country = country;
        this.exchangeRate = exchangeRate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
