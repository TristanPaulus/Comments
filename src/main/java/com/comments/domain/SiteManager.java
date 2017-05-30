package com.comments.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2017/05/30.
 */
public class SiteManager {

    private String email;
    private String firstname;
    private String lastname;
    private String password;

    private List<Site> sites;
    private Contact contact;
    private List<Role> roles;

    public SiteManager(Builder b)
    {
        this.email = b.email;
        this.firstname = b.firstname;
        this.lastname = b.lastname;
        this.password = b.password;
        this.sites = b.sites;
        this.contact = b.contact;
        this.roles = b.roles;
    }

    public List<Site> getSites()
    {
        return sites;
    }

    public List<Role> getRoles()
    {
        return roles;
    }

    public void addSite(Site s)
    {
        sites.add(s);
    }

    public void addRole(Role r)
    {
        roles.add(r);
    }

    public void setCellContact(String cell)
    {
        contact.setCellphone(cell);
    }

    public void setAddressContact(String address)
    {
        contact.setAddress(address);
    }

    public void setPostalContact(String postal)
    {
        contact.setPostalcode(postal);
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public Contact getContact(){return contact;}

    public static class Builder
    {
        private String email;
        private String firstname;
        private String lastname;
        private String password;

        private List<Site> sites;
        private Contact contact;
        private List<Role> roles;

        public Builder email(String value)
        {
            this.email = value;
            return this;
        }

        public Builder firstname(String value)
        {
            this.firstname = value;
            return this;
        }

        public Builder lastname(String value)
        {
            this.lastname = value;
            return this;
        }

        public Builder password(String value)
        {
            this.password = value;
            return this;
        }

        public Builder sites(Site site)
        {
            sites = new ArrayList<Site>();
            sites.add(site);
            return this;
        }

        public Builder roles(Role role)
        {
            roles = new ArrayList<Role>();
            roles.add(role);
            return this;
        }

        public Builder contact()
        {
            this.contact = new Contact();
            return this;
        }

        public SiteManager build()
        {
            return new SiteManager(this);
        }

    }
}
