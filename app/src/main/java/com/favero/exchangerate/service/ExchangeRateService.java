package com.favero.exchangerate.service;

import com.favero.exchangerate.exchangeRate.model.ExchangeRateResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class ExchangeRateService {

    private String BASE_URL = "https://api.exchangeratesapi.io/";

    public ApiService getApi() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiService.class);
    }

    public interface ApiService {

        @GET("/latest")
        Call<ExchangeRateResponse> getExchangeRates();
    }

}
