package com.favero.exchangerate.exchangeRate.model;

import com.google.gson.annotations.Expose;

public class ExchangeRateResponse {

    @Expose
    Rates rates;

    @Expose
    String base;

    @Expose
    String date;

    public Rates getRates() {
        return rates;
    }

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    public class Rates {
        @Expose
        Double CAD;

        @Expose
        Double HKD;

        @Expose
        Double ISK;

        @Expose
        Double PHP;

        @Expose
        Double DKK;

        @Expose
        Double HUF;

        @Expose
        Double CZK;

        @Expose
        Double AUD;

        @Expose
        Double RON;

        @Expose
        Double SEK;

        @Expose
        Double IDR;

        @Expose
        Double INR;

        @Expose
        Double BRL;

        @Expose
        Double RUB;

        @Expose
        Double HRK;

        @Expose
        Double JPY;

        @Expose
        Double THB;

        @Expose
        Double CHF;

        @Expose
        Double SGD;

        @Expose
        Double PLN;

        @Expose
        Double BGN;

        @Expose
        Double TRY;

        @Expose
        Double CNY;

        @Expose
        Double NOK;

        @Expose
        Double NZD;

        @Expose
        Double ZAR;

        @Expose
        Double USD;

        @Expose
        Double MXN;

        @Expose
        Double ILS;

        @Expose
        Double GBP;

        @Expose
        Double KRW;

        @Expose
        Double MYR;

        public Double getCAD() {
            return CAD;
        }

        public Double getHKD() {
            return HKD;
        }

        public Double getISK() {
            return ISK;
        }

        public Double getPHP() {
            return PHP;
        }

        public Double getDKK() {
            return DKK;
        }

        public Double getHUF() {
            return HUF;
        }

        public Double getCZK() {
            return CZK;
        }

        public Double getAUD() {
            return AUD;
        }

        public Double getRON() {
            return RON;
        }

        public Double getSEK() {
            return SEK;
        }

        public Double getIDR() {
            return IDR;
        }

        public Double getINR() {
            return INR;
        }

        public Double getBRL() {
            return BRL;
        }

        public Double getRUB() {
            return RUB;
        }

        public Double getHRK() {
            return HRK;
        }

        public Double getJPY() {
            return JPY;
        }

        public Double getTHB() {
            return THB;
        }

        public Double getCHF() {
            return CHF;
        }

        public Double getSGD() {
            return SGD;
        }

        public Double getPLN() {
            return PLN;
        }

        public Double getBGN() {
            return BGN;
        }

        public Double getTRY() {
            return TRY;
        }

        public Double getCNY() {
            return CNY;
        }

        public Double getNOK() {
            return NOK;
        }

        public Double getNZD() {
            return NZD;
        }

        public Double getZAR() {
            return ZAR;
        }

        public Double getUSD() {
            return USD;
        }

        public Double getMXN() {
            return MXN;
        }

        public Double getILS() {
            return ILS;
        }

        public Double getGBP() {
            return GBP;
        }

        public Double getKRW() {
            return KRW;
        }

        public Double getMYR() {
            return MYR;
        }
    }
}
