package com.comments.domain;

import java.util.Date;

/**
 * Created by Tristan on 2017/05/30.
 */
public class Reputation {

    private Date date;
    private int value;

    public Reputation()
    {
        date = new Date();
        value = 0;
    }

    public Date getDate()
    {
        return date;
    }

    public int getValue()
    {
        return value;
    }

}
