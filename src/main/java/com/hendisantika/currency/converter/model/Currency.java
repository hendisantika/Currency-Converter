package com.hendisantika.currency.converter.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hendisantika on 5/1/17.
 */
public class Currency {
    String base;
    String date;
    Rates rates;

    public Currency() {
    }

    public Currency(String base, Date date, Rates rates) {
        this.base = base;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.date = sdf.format(date);
        this.rates = rates;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "base='" + base + '\'' +
                ", date=" + date +
                ", rates=" + rates +
                '}';
    }
}
