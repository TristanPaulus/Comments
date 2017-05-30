package com.comments.domain;

import java.util.ArrayList;
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
    private List<Response> responses;
    private List<Comment> comments;

    public User(Builder builder)
    {
        this.email = builder.email;
        this.screenName = builder.screenName;
        this.password = builder.password;
        this.status = builder.status;

        this.reputations = builder.reputations;
        this.responses = builder.responses;
        this.comments = builder.comments;
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

    public void addReputation(Reputation r)
    {
        this.reputations.add(r);
    }

    public void addResponse(Response r)
    {
        this.responses.add(r);
    }

    public void addComment(Comment c)
    {
        this.comments.add(c);
    }

    public List getReputations()
    {
        return reputations;
    }

    public List getComments()
    {
        return comments;
    }

    public List getResponses()
    {
        return responses;
    }

    public static class Builder
    {
        private String email;
        private String screenName;
        private String password;
        private String status;

        private List<Reputation> reputations;
        private List<Response> responses;
        private List<Comment> comments;

        public Builder reputations()
        {
            this.reputations = new ArrayList<Reputation>();
            return this;
        }

        public Builder responses()
        {
            this.responses = new ArrayList<Response>();
            return this;
        }

        public Builder comments()
        {
            this.comments = new ArrayList<Comment>();
            return this;
        }

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
