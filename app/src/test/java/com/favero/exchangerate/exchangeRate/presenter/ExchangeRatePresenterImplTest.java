package com.favero.exchangerate.exchangeRate.presenter;

import com.favero.exchangerate.exchangeRate.model.ExchangeRateModel;
import com.favero.exchangerate.exchangeRate.model.ExchangeRateResponse;
import com.favero.exchangerate.exchangeRate.presentation.ExchangeRateView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;


import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ExchangeRatePresenterImplTest {

    @Mock
    ExchangeRateView view;

    ExchangeRatePresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new ExchangeRatePresenterImpl(view);
    }

    @Test
    public void updateExchangeRates_Null_Object_Test() {
        presenter.updateExchangeRates(null);
        verify(view, never()).setBaseExchangeRate("");
        verify(view, never()).updateExchangeRates(Mockito.<ExchangeRateModel>anyList());
    }

    @Test
    public void updateExchangeRates_Contains_Object_Test() {
        presenter.updateExchangeRates(createMockResponse());
        verify(view).setBaseExchangeRate("EUR");
        verify(view).updateExchangeRates(createMockModel());
    }

    @Test
    public void showError() {
        presenter.showError();
        verify(view).showError();
    }

    private ExchangeRateResponse createMockResponse() {
        ExchangeRateResponse response = new ExchangeRateResponse();
        response.setBase("EUR");
        response.setDate("2019-08-02");
        ExchangeRateResponse.Rates rates = new ExchangeRateResponse().new Rates();
        rates.setAUD(123.0);
        rates.setBGN(12.3);

        response.setRates(rates);
        return response;
    }

    private List<ExchangeRateModel> createMockModel() {
        ExchangeRateModel modelAUD = new ExchangeRateModel("AUD", "123.0");
        ExchangeRateModel modelBGN = new ExchangeRateModel("BGN", "12.3");
        List<ExchangeRateModel> list = new ArrayList<>();
        list.add(modelAUD);
        list.add(modelBGN);
        return list;
    }
}