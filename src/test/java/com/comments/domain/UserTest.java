package com.comments.domain;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Tristan on 2017/05/30.
 */
public class UserTest {

    Response response;
    Reputation reputation;
    Comment comment;

    User tristan;

    @BeforeMethod
    public void setUp() throws Exception
    {
        response = new Response.Builder()
                .comment("Test response")
                .date(new Date())
                .ipaddress("155.238.4.87")
                .build();

        reputation = new Reputation.Builder()
                .date(new Date())
                .value(0)
                .build();

        comment = new Comment.Builder()
                .comment("Test comment")
                .date(new Date())
                .ipaddress("155.238.4.87")
                .build();

        tristan = new User.Builder()
                .reputations()
                .responses()
                .comments()
                .email("tristan.ipaulus@gmail.com")
                .screenName("TeePee")
                .password("tristan")
                .status("Friendly")
                .build();
    }

    @Test
    public void testAddReputation() throws Exception {

        tristan.addReputation(reputation);

        List<Reputation> reps = tristan.getReputations();
        Reputation rep = reps.get(0);

        assertEquals(0, rep.getValue());
    }

    @Test
    public void testAddResponse() throws Exception {

        tristan.addResponse(response);

        List<Response> resps= tristan.getResponses();
        Response resp = resps.get(0);

        assertEquals("155.238.4.87", resp.getIpaddress());
    }

    @Test
    public void testAddComment() throws Exception {

        tristan.addComment(comment);

        List<Comment> coms = tristan.getComments();
        Comment com = coms.get(0);

        assertEquals("155.238.4.87", com.getIpaddress());
    }

    @Test
    public void testGetReputations() throws Exception {

        tristan.addReputation(reputation);
        tristan.addReputation(reputation);
        Reputation r = new Reputation.Builder()
                .date(new Date())
                .value(2)
                .build();
        tristan.addReputation(r);

        List<Reputation> reps = tristan.getReputations();


        assertEquals(0, reps.get(0).getValue());
        assertEquals(0, reps.get(1).getValue());
        assertEquals(2, reps.get(2).getValue());

    }

    @Test
    public void testGetComments() throws Exception {

        tristan.addComment(comment);
        tristan.addComment(comment);
        Comment c = new Comment.Builder()
                .comment("Sample")
                .date(new Date())
                .ipaddress("123.456.7.89")
                .build();

        tristan.addComment(c);

        List<Comment> coms = tristan.getComments();


        assertEquals("155.238.4.87", coms.get(0).getIpaddress());
        assertEquals("155.238.4.87", coms.get(1).getIpaddress());
        assertEquals("123.456.7.89", coms.get(2).getIpaddress());

    }

    @Test
    public void testGetResponses() throws Exception {

        tristan.addResponse(response);
        tristan.addResponse(response);
        Response r = new Response.Builder()
                .comment("Sample")
                .date(new Date())
                .ipaddress("123.456.7.89")
                .build();

        tristan.addResponse(r);

        List<Response> resps = tristan.getResponses();


        assertEquals("155.238.4.87", resps.get(0).getIpaddress());
        assertEquals("155.238.4.87", resps.get(1).getIpaddress());
        assertEquals("123.456.7.89", resps.get(2).getIpaddress());
    }

}