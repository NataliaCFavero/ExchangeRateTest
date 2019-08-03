package com.favero.exchangerate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
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

public class MainActivity extends AppCompatActivity implements ExchangeRateView {

    private ExchangeRateInteractor interactor;

    private RecyclerView mRecyclerView;
    private TextView mBaseText;
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
        }
    }

    @Override
    public void showError() {
        Toast.makeText(getBaseContext(), R.string.error_service, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setBaseExchangeRate(String country) {
        if (mBaseText != null) {
            mBaseText.setText(getString(R.string.base_exchange_rate, country));
        }
    }

    private void initInteractor() {
        ExchangeRatePresenter presenter = new ExchangeRatePresenterImpl(this);
        interactor = new ExchangeRateInteractorImpl(presenter);
    }

    private void initIds() {
        mRecyclerView = findViewById(R.id.exchange_rate_recycler_view);
        mBaseText = findViewById(R.id.exchangeRateBaseTextView);
    }

    private void setupRecycler() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new ExchangeRateAdapter(new ArrayList(0));
        mRecyclerView.setAdapter(mAdapter);
    }
}
