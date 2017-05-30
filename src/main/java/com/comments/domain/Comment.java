package com.comments.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Tristan on 2017/05/30.
 */
public class Comment {

    private String comment;
    private Date date;
    private String ipaddress;

    private VoteDown votedown;
    private VoteUp voteup;

    private List<AbuseReport> abuseReports;
    private List<Response> responses;

    private ContentFilter contentFilter;

    public Comment(Builder builder)
    {
        this.comment = builder.comment;
        this.date= builder.date;
        this.ipaddress = builder.ipaddress;
        this.votedown = builder.votedown;
        this.voteup = builder.voteup;
        this.abuseReports = builder.abuseReports;
        this.responses = builder.responses;
        this.contentFilter = builder.contentFilter;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    public VoteDown getVotedown() {
        return votedown;
    }

    public VoteUp getVoteup() {
        return voteup;
    }

    public void addAbuseReport(AbuseReport ar)
    {
        this.abuseReports.add(ar);
    }

    public void addResponse(Response r)
    {
        this.responses.add(r);
    }

    public List<AbuseReport> getAbuseReports()
    {
        return abuseReports;
    }

    public List<Response> getResponses()
    {
        return responses;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public static class Builder
    {
        private String comment;
        private Date date;
        private String ipaddress;
        private VoteDown votedown;
        private VoteUp voteup;
        private List<AbuseReport> abuseReports;
        private List<Response> responses;
        private ContentFilter contentFilter;

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

        public Builder votedown(VoteDown vote)
        {
            this.votedown = vote;
            return this;
        }

        public Builder voteup(VoteUp vote)
        {
            this.voteup = vote;
            return this;
        }

        public Builder abuseReports()
        {
            this.abuseReports = new ArrayList<AbuseReport>();
            return this;
        }

        public Builder responses()
        {
            this.responses = new ArrayList<Response>();
            return this;
        }

        public Builder contentFilter()
        {
            this.contentFilter = new ContentFilter();
            return this;
        }

        public Comment build()
        {
            return new Comment(this);
        }

    }

}
