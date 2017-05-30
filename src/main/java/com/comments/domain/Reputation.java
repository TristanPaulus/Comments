package com.comments.domain;

import java.util.Date;

/**
 * Created by Tristan on 2017/05/30.
 */
public class Reputation {

    private Date date;
    private int value;

    public Reputation(Builder builder)
    {
        this.date = builder.date;
        this.value = builder.value;
    }

    public Date getDate()
    {
        return date;
    }

    public int getValue()
    {
        return value;
    }

    public static class Builder
    {
        private Date date;
        private int value;

        public Builder date(Date value)
        {
            this.date = value;
            return this;
        }

        public Builder value(int values)
        {
            this.value = values;
            return this;
        }

        public Reputation build()
        {
            return new Reputation(this);
        }

    }

}
