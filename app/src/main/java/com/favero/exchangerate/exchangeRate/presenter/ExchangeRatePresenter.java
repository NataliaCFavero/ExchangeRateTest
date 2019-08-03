package com.favero.exchangerate.exchangeRate.presenter;

import com.favero.exchangerate.exchangeRate.Model.ExchangeRateModel;

import java.util.List;

public interface ExchangeRatePresenter {

    void updateExchangeRates(List<ExchangeRateModel> model);
}
