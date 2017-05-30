package com.comments.domain;

/**
 * Created by Tristan on 2017/05/30.
 */
public class AbuseReport {

    private String description;

    public AbuseReport(Builder builder)
    {
        this.description = builder.description;
    }

    public String getDescription()
    {
        return description;
    }

    public static class Builder
    {
        private String description;

        public Builder description(String value)
        {
            this.description = value;
            return this;
        }

        public AbuseReport build()
        {
            return new AbuseReport(this);
        }

    }

}
