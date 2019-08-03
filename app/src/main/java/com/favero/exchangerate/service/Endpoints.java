package com.favero.exchangerate.service;

import com.favero.exchangerate.exchangeRate.repository.ExchangeRateResponse;

import retrofit2.Call;

public interface Endpoints {

    Call<ExchangeRateResponse> getExchangeRates();
}
