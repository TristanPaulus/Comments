package com.comments.domain;

import java.util.Date;

/**
 * Created by Tristan on 2017/05/30.
 */
public class Response {

    private String comment;
    private Date date;
    private String ipaddress;
    private VoteDown voteDown;
    private VoteUp voteUp;

    public Response(Builder builder)
    {
        this.comment = builder.comment;
        this.date= builder.date;
        this.ipaddress = builder.ipaddress;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public static class Builder
    {
        private String comment;
        private Date date;
        private String ipaddress;

        public Builder comment(String values)
        {
            this.comment = values;
            return this;
        }

        public Builder date(Date values)
        {
            this.date = values;
            return this;
        }

        public Builder ipaddress(String values)
        {
            this.ipaddress = values;
            return this;
        }

        public Response build()
        {
            return new Response(this);
        }

    }

}
