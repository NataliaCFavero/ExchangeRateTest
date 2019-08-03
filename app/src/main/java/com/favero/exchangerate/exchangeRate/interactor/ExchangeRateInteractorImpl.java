package com.favero.exchangerate.exchangeRate.interactor;


import android.widget.Toast;

import androidx.annotation.NonNull;

import com.favero.exchangerate.exchangeRate.presenter.ExchangeRatePresenter;
import com.favero.exchangerate.exchangeRate.model.ExchangeRateResponse;
import com.favero.exchangerate.service.ExchangeRateService;

import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ExchangeRateInteractorImpl implements ExchangeRateInteractor {

    private final ExchangeRateService apiService;
    private final ExchangeRatePresenter presenter;
    private static final long ONE_MINUTE = 60000;

    private Timer timer;

    public ExchangeRateInteractorImpl(@NonNull ExchangeRatePresenter presenter) {
        apiService = new ExchangeRateService();
        this.presenter = presenter;
    }

    @Override
    public void updateExchangeRates() {
        if (timer == null) {
            startTimer();
        } else {
            apiService.getApi().getExchangeRates().enqueue(new Callback<ExchangeRateResponse>() {
                @Override
                public void onResponse(Call<ExchangeRateResponse> call, Response<ExchangeRateResponse> response) {
                    if (response.isSuccessful()) {
                        System.out.println("Updating...........");
                        presenter.updateExchangeRates(response.body() != null ? response.body() : new ExchangeRateResponse());
                    }
                }
                @Override
                public void onFailure(Call<ExchangeRateResponse> call, Throwable t) {
                    presenter.showError();
                }
            });
        }


    }

    @Override
    public void destroy() {
        stopTimer();
    }

    private void startTimer() {
        this.timer = new Timer();
        TimerTask updateExchangeRates = new TimerExchangeRatesTask();
        timer.scheduleAtFixedRate(updateExchangeRates, 0, ONE_MINUTE);
    }

    private void stopTimer() {
        this.timer.cancel();
        timer = null;
    }

    class TimerExchangeRatesTask extends TimerTask {
        @Override
        public void run() {
            updateExchangeRates();
        }
    }
}


