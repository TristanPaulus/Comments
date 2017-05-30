package com.comments.domain;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

/**
 * Created by Tristan on 2017/05/31.
 */
public class SiteTest {

    Comment c, c2;
    Site s;

    @BeforeMethod
    public void setUp() throws Exception {
        c = new Comment.Builder()
                .comment("This is a comment")
                .date(new Date())
                .ipaddress("155.238.4.87")
                .build();

        c2 = new Comment.Builder()
                .comment("This is not a comment")
                .date(new Date())
                .ipaddress("155.238.4.87")
                .build();

        s = new Site.Builder()
                .name(".Comment")
                .url("comments.com")
                .stroryurl("155.238.4.87")
                .comments()
                .build();
    }

    @Test
    public void testAddComment() throws Exception {
        s.addComment(c);
        assertEquals("This is a comment", s.getComments().get(0).getComment());
    }

    @Test
    public void testGetComments() throws Exception {
        s.addComment(c);
        s.addComment(c2);

        assertEquals("This is not a comment", s.getComments().get(1).getComment());
    }

}