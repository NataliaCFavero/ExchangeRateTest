package com.favero.exchangerate.exchangeRate.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.favero.exchangerate.R;
import com.favero.exchangerate.exchangeRate.model.ExchangeRateModel;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRateAdapter extends RecyclerView.Adapter<ExchangeRateAdapter.ViewHolder> {

    private final List<ExchangeRateModel> mExchangeRates;

    public ExchangeRateAdapter(ArrayList exchangeRates) {
        this.mExchangeRates = exchangeRates;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.exchange_rate_line_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.country.setText(mExchangeRates.get(position).getCountry());
        holder.exchangeRate.setText(mExchangeRates.get(position).getExchangeRate());
    }

    @Override
    public int getItemCount() {
        return mExchangeRates != null ? mExchangeRates.size() : 0;
    }

    public void update(List<ExchangeRateModel> list) {
        mExchangeRates.clear();
        mExchangeRates.addAll(list);
        notifyDataSetChanged();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView country;
        public TextView exchangeRate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            country = (TextView) itemView.findViewById(R.id.countryTextView);
            exchangeRate = (TextView) itemView.findViewById(R.id.exchangeRateTextView);

        }
    }

}

