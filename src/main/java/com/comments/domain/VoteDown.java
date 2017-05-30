package com.comments.domain;

/**
 * Created by Tristan on 2017/05/30.
 */
public class VoteDown {

    private int counter;

    public VoteDown(Builder b)
    {
        this.counter = b.counter;
    }

    public int getCounter()
    {
        return counter;
    }

    public void increment()
    {
        counter++;
    }

    public static class Builder
    {
        private int counter;

        public Builder counter()
        {
            this.counter = 0;
            return this;
        }

        public VoteDown build()
        {
            return new VoteDown(this);
        }
    }

}
