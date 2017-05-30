package com.comments.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2017/05/30.
 */
public class Site {

    private String name;
    private String url;
    private String stroryurl;

    private List<Comment> comments;

    public Site(Builder builder)
    {
        this.name = builder.name;
        this.url = builder.url;
        this.stroryurl = builder.stroryurl;
        this.comments = builder.comments;
    }



    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getStroryurl() {
        return stroryurl;
    }

    public void addComment(Comment c)
    {
        comments.add(c);
    }

    public List<Comment> getComments()
    {
        return comments;
    }

    public static class Builder{

        private String name;
        private String url;
        private String stroryurl;
        private List<Comment> comments;

        public Builder name(String value)
        {
            this.name = value;
            return this;
        }

        public Builder url(String value)
        {
            this.url = value;
            return this;
        }

        public Builder stroryurl(String value)
        {
            this.stroryurl = value;
            return this;
        }

        public Builder comments()
        {
            this.comments = new ArrayList<Comment>();
            return this;
        }

        public Site build() {
            return new Site(this);
        }

    }

}
