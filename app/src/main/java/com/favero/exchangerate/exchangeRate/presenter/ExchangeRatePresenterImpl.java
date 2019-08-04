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
            ExchangeRateModel countryCAD = new ExchangeRateModel("CAD", String.valueOf(model.getRates().getCAD()));
            list.add(countryCAD);
            ExchangeRateModel countryHKD = new ExchangeRateModel("HKD", String.valueOf(model.getRates().getHKD()));
            list.add(countryHKD);
            ExchangeRateModel countryISK = new ExchangeRateModel("ISK", String.valueOf(model.getRates().getISK()));
            list.add(countryISK);
            ExchangeRateModel countryPHP = new ExchangeRateModel("PHP", String.valueOf(model.getRates().getPHP()));
            list.add(countryPHP);
            ExchangeRateModel countryDKK = new ExchangeRateModel("DKK", String.valueOf(model.getRates().getDKK()));
            list.add(countryDKK);
            ExchangeRateModel countryHUF = new ExchangeRateModel("HUF", String.valueOf(model.getRates().getHUF()));
            list.add(countryHUF);
            ExchangeRateModel countryCZK = new ExchangeRateModel("CZK", String.valueOf(model.getRates().getCZK()));
            list.add(countryCZK);
            ExchangeRateModel countryAUD = new ExchangeRateModel("AUD", String.valueOf(model.getRates().getAUD()));
            list.add(countryISK);
            ExchangeRateModel countryRON = new ExchangeRateModel("RON", String.valueOf(model.getRates().getRON()));
            list.add(countryRON);
            ExchangeRateModel countrySEK = new ExchangeRateModel("SEK", String.valueOf(model.getRates().getSEK()));
            list.add(countrySEK);
            ExchangeRateModel countryIDR = new ExchangeRateModel("IDR", String.valueOf(model.getRates().getIDR()));
            list.add(countryIDR);
            ExchangeRateModel countryINR = new ExchangeRateModel("INR", String.valueOf(model.getRates().getINR()));
            list.add(countryINR);
            ExchangeRateModel countryBRL = new ExchangeRateModel("BRL", String.valueOf(model.getRates().getBRL()));
            list.add(countryBRL);
            ExchangeRateModel countryRUB = new ExchangeRateModel("RUB", String.valueOf(model.getRates().getRUB()));
            list.add(countryRUB);
            ExchangeRateModel countryHRK = new ExchangeRateModel("HRK", String.valueOf(model.getRates().getHRK()));
            list.add(countryHRK);
            ExchangeRateModel countryJPY = new ExchangeRateModel("JPY", String.valueOf(model.getRates().getJPY()));
            list.add(countryJPY);
            ExchangeRateModel countryTHB = new ExchangeRateModel("THB", String.valueOf(model.getRates().getTHB()));
            list.add(countryTHB);
            ExchangeRateModel countryCHF = new ExchangeRateModel("CHF", String.valueOf(model.getRates().getCHF()));
            list.add(countryCHF);
            ExchangeRateModel countrySGD = new ExchangeRateModel("SGD", String.valueOf(model.getRates().getSGD()));
            list.add(countrySGD);
            ExchangeRateModel countryPLN = new ExchangeRateModel("PLN", String.valueOf(model.getRates().getPLN()));
            list.add(countryPLN);
            ExchangeRateModel countryBGN = new ExchangeRateModel("BGN", String.valueOf(model.getRates().getBGN()));
            list.add(countryBGN);
            ExchangeRateModel countryTRY = new ExchangeRateModel("TRY", String.valueOf(model.getRates().getTRY()));
            list.add(countryTRY);
            ExchangeRateModel countryCNY = new ExchangeRateModel("CNY", String.valueOf(model.getRates().getCNY()));
            list.add(countryCNY);
            ExchangeRateModel countryNOK = new ExchangeRateModel("NOK", String.valueOf(model.getRates().getNOK()));
            list.add(countryNOK);
            ExchangeRateModel countryNZD = new ExchangeRateModel("NZD", String.valueOf(model.getRates().getNZD()));
            list.add(countryNZD);
            ExchangeRateModel countryZAR = new ExchangeRateModel("ZAR", String.valueOf(model.getRates().getZAR()));
            list.add(countryZAR);
            ExchangeRateModel countryUSD = new ExchangeRateModel("USD", String.valueOf(model.getRates().getUSD()));
            list.add(countryUSD);
            ExchangeRateModel countryMXN = new ExchangeRateModel("MXN", String.valueOf(model.getRates().getMXN()));
            list.add(countryMXN);
            ExchangeRateModel countryILS = new ExchangeRateModel("ILS", String.valueOf(model.getRates().getILS()));
            list.add(countryILS);
            ExchangeRateModel countryGBP = new ExchangeRateModel("GBP", String.valueOf(model.getRates().getGBP()));
            list.add(countryGBP);
            ExchangeRateModel countryKRW = new ExchangeRateModel("KRW", String.valueOf(model.getRates().getKRW()));
            list.add(countryKRW);
            ExchangeRateModel countryMYR = new ExchangeRateModel("MYR", String.valueOf(model.getRates().getMYR()));
            list.add(countryMYR);

            view.updateExchangeRates(list);
            view.setBaseExchangeRate(model.getBase());
        }

    }

    @Override
    public void showError() {
        view.showError();
    }
}
