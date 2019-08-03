package com.favero.exchangerate.exchangeRate.presenter;

import com.favero.exchangerate.exchangeRate.model.ExchangeRateResponse;

public interface ExchangeRatePresenter {

    void updateExchangeRates(ExchangeRateResponse model);
    void showError();
}
