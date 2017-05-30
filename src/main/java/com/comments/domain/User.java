package com.comments.domain;

import java.util.List;

/**
 * Created by Tristan on 2017/05/30.
 */
public class User {

    private String email;
    private String screenName;
    private String password;
    private String status;

    private List<Reputation> reputations;
    private List<Comment> comments;
    private List<Response> responses;

    public User(Builder builder)
    {
        this.email = builder.email;
        this.screenName = builder.screenName;
        this.password = builder.password;
        this.status = builder.status;
    }

    public String getEmail() {
        return email;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder
    {
        private String email;
        private String screenName;
        private String password;
        private String status;

        public Builder email(String value)
        {
            this.email = value;
            return this;
        }

        public Builder screenName(String value)
        {
            this.screenName = value;
            return this;
        }

        public Builder password(String value)
        {
            this.password = value;
            return this;
        }

        public Builder status(String value)
        {
            this.status = value;
            return this;
        }

        public User build()
        {
            return new User(this);
        }

    }


}
