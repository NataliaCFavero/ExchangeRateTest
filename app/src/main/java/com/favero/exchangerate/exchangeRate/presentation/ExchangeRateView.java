package com.favero.exchangerate.exchangeRate.presentation;

import com.favero.exchangerate.exchangeRate.model.ExchangeRateModel;

import java.util.List;

public interface ExchangeRateView {

    void updateExchangeRates(List<ExchangeRateModel> model);

    void setBaseExchangeRate(String country);

    void showError();
}
