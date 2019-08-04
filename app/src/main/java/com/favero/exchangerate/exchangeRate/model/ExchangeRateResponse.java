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

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setDate(String date) {
        this.date = date;
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

        public void setCAD(Double CAD) {
            this.CAD = CAD;
        }

        public void setHKD(Double HKD) {
            this.HKD = HKD;
        }

        public void setISK(Double ISK) {
            this.ISK = ISK;
        }

        public void setPHP(Double PHP) {
            this.PHP = PHP;
        }

        public void setDKK(Double DKK) {
            this.DKK = DKK;
        }

        public void setHUF(Double HUF) {
            this.HUF = HUF;
        }

        public void setCZK(Double CZK) {
            this.CZK = CZK;
        }

        public void setAUD(Double AUD) {
            this.AUD = AUD;
        }

        public void setRON(Double RON) {
            this.RON = RON;
        }

        public void setSEK(Double SEK) {
            this.SEK = SEK;
        }

        public void setIDR(Double IDR) {
            this.IDR = IDR;
        }

        public void setINR(Double INR) {
            this.INR = INR;
        }

        public void setBRL(Double BRL) {
            this.BRL = BRL;
        }

        public void setRUB(Double RUB) {
            this.RUB = RUB;
        }

        public void setHRK(Double HRK) {
            this.HRK = HRK;
        }

        public void setJPY(Double JPY) {
            this.JPY = JPY;
        }

        public void setTHB(Double THB) {
            this.THB = THB;
        }

        public void setCHF(Double CHF) {
            this.CHF = CHF;
        }

        public void setSGD(Double SGD) {
            this.SGD = SGD;
        }

        public void setPLN(Double PLN) {
            this.PLN = PLN;
        }

        public void setBGN(Double BGN) {
            this.BGN = BGN;
        }

        public void setTRY(Double TRY) {
            this.TRY = TRY;
        }

        public void setCNY(Double CNY) {
            this.CNY = CNY;
        }

        public void setNOK(Double NOK) {
            this.NOK = NOK;
        }

        public void setNZD(Double NZD) {
            this.NZD = NZD;
        }

        public void setZAR(Double ZAR) {
            this.ZAR = ZAR;
        }

        public void setUSD(Double USD) {
            this.USD = USD;
        }

        public void setMXN(Double MXN) {
            this.MXN = MXN;
        }

        public void setILS(Double ILS) {
            this.ILS = ILS;
        }

        public void setGBP(Double GBP) {
            this.GBP = GBP;
        }

        public void setKRW(Double KRW) {
            this.KRW = KRW;
        }

        public void setMYR(Double MYR) {
            this.MYR = MYR;
        }
    }
}
