package com.favero.exchangerate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.favero.exchangerate.exchangeRate.model.ExchangeRateModel;
import com.favero.exchangerate.exchangeRate.interactor.ExchangeRateInteractor;
import com.favero.exchangerate.exchangeRate.interactor.ExchangeRateInteractorImpl;
import com.favero.exchangerate.exchangeRate.presentation.ExchangeRateAdapter;
import com.favero.exchangerate.exchangeRate.presentation.ExchangeRateView;
import com.favero.exchangerate.exchangeRate.presenter.ExchangeRatePresenter;
import com.favero.exchangerate.exchangeRate.presenter.ExchangeRatePresenterImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class MainActivity extends AppCompatActivity implements ExchangeRateView {

    private ExchangeRateInteractor interactor;

    RecyclerView mRecyclerView;
    private ExchangeRateAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInteractor();
        initIds();
        setupRecycler();
    }

    @Override
    protected void onStart() {
        super.onStart();
        interactor.updateExchangeRates();
    }

    @Override
    protected void onStop() {
        super.onStop();
        interactor.destroy();
    }

    @Override
    public void updateExchangeRates(List<ExchangeRateModel> model) {
        if (mAdapter != null && model.size() > 0) {
            mAdapter.update(model);
            Toast.makeText(getBaseContext(), R.string.updating_service, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showError() {
        Toast.makeText(getBaseContext(), R.string.error_service, Toast.LENGTH_SHORT).show();
    }

    private void initInteractor() {
        ExchangeRatePresenter presenter = new ExchangeRatePresenterImpl(this);
        interactor = new ExchangeRateInteractorImpl(presenter);
    }

    private void initIds() {
        mRecyclerView = findViewById(R.id.exchange_rate_recycler_view);
    }

    private void setupRecycler() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new ExchangeRateAdapter(new ArrayList(0));
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
