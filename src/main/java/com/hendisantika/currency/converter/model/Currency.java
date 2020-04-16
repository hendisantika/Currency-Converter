package com.hendisantika.currency.converter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hendisantika on 5/1/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Currency {
    String base;
    String date;
    Rates rates;

    public Currency(String base, Date date, Rates rates) {
        this.base = base;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.date = sdf.format(date);
        this.rates = rates;
    }
}
