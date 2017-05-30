package com.comments.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Tristan on 2017/05/30.
 */
public class Response {

    private String comment;
    private Date date;
    private String ipaddress;

    private VoteDown voteDown;
    private VoteUp voteUp;

    private List<AbuseReport> abuseReports;
    private ContentFilter contentFilter;

    public Response(Builder builder)
    {
        this.comment = builder.comment;
        this.date= builder.date;
        this.ipaddress = builder.ipaddress;
        this.voteDown = builder.voteDown;
        this.voteUp = builder.voteUp;
        this.abuseReports = builder.abuseReports;
        this.contentFilter = builder.contentFilter;
    }

    public void addAbuseReport(AbuseReport ar)
    {
        abuseReports.add(ar);
    }

    public List<AbuseReport> getAbuseReports()
    {
        return abuseReports;
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

        private VoteDown voteDown;
        private VoteUp voteUp;

        private List<AbuseReport> abuseReports;
        private ContentFilter contentFilter;

        public Builder voteDown(VoteDown value)
        {
            this.voteDown = value;
            return this;
        }

        public Builder voteUp(VoteUp value)
        {
            this.voteUp = value;
            return this;
        }

        public Builder abuseReports()
        {
            this.abuseReports = new ArrayList<AbuseReport>();
            return this;
        }

        public Builder contentFilter()
        {
            this.contentFilter = new ContentFilter();
            return this;
        }

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
