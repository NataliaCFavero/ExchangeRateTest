package com.favero.exchangerate.exchangeRate.presentation;

import com.favero.exchangerate.exchangeRate.Model.ExchangeRateModel;

import java.util.List;

public interface ExchangeRateInteractorView {

    void updateExchangeRates(List<ExchangeRateModel> model);
}
