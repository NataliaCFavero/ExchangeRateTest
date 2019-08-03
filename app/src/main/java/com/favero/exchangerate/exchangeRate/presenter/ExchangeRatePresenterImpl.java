package com.favero.exchangerate.exchangeRate.presenter;

import com.favero.exchangerate.exchangeRate.model.ExchangeRateModel;
import com.favero.exchangerate.exchangeRate.presentation.ExchangeRateView;
import com.favero.exchangerate.exchangeRate.model.ExchangeRateResponse;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRatePresenterImpl implements ExchangeRatePresenter {

    private ExchangeRateView view;

    public ExchangeRatePresenterImpl(ExchangeRateView view) {
        this.view = view;
    }

    @Override
    public void updateExchangeRates(ExchangeRateResponse model) {
        List<ExchangeRateModel> list = new ArrayList<>();

        if (model != null && model.getRates() != null) {
            ExchangeRateModel countryAUD = new ExchangeRateModel("AUD", String.valueOf(model.getRates().getAUD()));
            list.add(countryAUD);
            ExchangeRateModel countryHKD = new ExchangeRateModel("HKD", String.valueOf(model.getRates().getHKD()));
            list.add(countryHKD);
            ExchangeRateModel countryISK = new ExchangeRateModel("ISK", String.valueOf(model.getRates().getISK()));
            list.add(countryISK);
            ExchangeRateModel countryPHP = new ExchangeRateModel("PHP", String.valueOf(model.getRates().getPHP()));
            list.add(countryPHP);
            ExchangeRateModel countryDKK = new ExchangeRateModel("DKK", String.valueOf(model.getRates().getDKK()));
            list.add(countryDKK);

            view.updateExchangeRates(list);
        }

    }

    @Override
    public void showError() {
        view.showError();
    }
}
