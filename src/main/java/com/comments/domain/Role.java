package com.comments.domain;

/**
 * Created by Tristan on 2017/05/30.
 */
public class Role {

    private String name;
    private String description;

    public Role(Builder b)
    {
        this.name = b.name;
        this.description = b.description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder{

        private String name;
        private String description;

        public Builder name(String value)
        {
            this.name = value;
            return this;
        }

        public Builder description(String value)
        {
            this.description = value;
            return this;
        }

        public Role build()
        {
            return new Role(this);
        }
    }
}
