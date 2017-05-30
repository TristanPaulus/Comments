package com.comments.domain;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Tristan on 2017/05/31.
 */
public class SiteManagerTest {

    Site s;
    Role r;
    Contact c;
    SiteManager sm;

    @BeforeMethod
    public void setUp() throws Exception
    {
        s = new Site.Builder()
                .name("Site")
                .url("site.com")
                .stroryurl("test")
                .build();
        r = new Role.Builder()
                .name("Worker")
                .description("Work hard")
                .build();
        c = new Contact();
        sm = new SiteManager.Builder()
                .email("tristan.ipaulus@gmail.com")
                .firstname("Tristan")
                .lastname("Paulus")
                .password("Haha")
                .sites(s)
                .roles(r)
                .contact()
                .build();

    }

    @Test
    public void testGetSites() throws Exception {
        List<Site> sites = sm.getSites();
        assertEquals("Site", sites.get(0).getName());
    }

    @Test
    public void testGetRoles() throws Exception {
        List<Role> roles = sm.getRoles();
        assertEquals("Worker", roles.get(0).getName());
    }

    @Test
    public void testAddSite() throws Exception {
        sm.addSite(s);
        List<Site> sites = sm.getSites();
        assertEquals("Site", sites.get(1).getName());
    }

    @Test
    public void testAddRole() throws Exception {
        sm.addRole(r);
        List<Role> roles = sm.getRoles();
        assertEquals("Worker", roles.get(1).getName());
    }

    @Test
    public void testSetCellContact() throws Exception {
        sm.setCellContact("0799813979");
        assertEquals("0799813979", sm.getContact().getCellphone());
    }

    @Test
    public void testSetAddressContact() throws Exception {
        sm.setAddressContact("123 ABC way");
        assertEquals("123 ABC way", sm.getContact().getAddress());
    }

    @Test
    public void testSetPostalContact() throws Exception {
        sm.setPostalContact("7780");
        assertEquals("7780", sm.getContact().getPostalcode());

    }

}