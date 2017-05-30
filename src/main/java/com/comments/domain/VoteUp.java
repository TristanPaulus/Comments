package com.comments.domain;

/**
 * Created by Tristan on 2017/05/30.
 */
public class VoteUp {

    private int counter;
    private Response response;
    private Comment comment;

    public int getCounter()
    {
        return counter;
    }

    public void increment()
    {
        counter++;
    }

}
