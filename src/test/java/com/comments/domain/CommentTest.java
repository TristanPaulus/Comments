package com.comments.domain;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Tristan on 2017/05/30.
 */
public class CommentTest {

    AbuseReport ar, ar2;
    Response r, r2;
    Comment testComment;

    @BeforeMethod
    public void setUp() throws Exception
    {
        ar = new AbuseReport.Builder()
                .description("He wasn't nice")
                .build();
        ar2 = new AbuseReport.Builder()
                .description("I don't like you")
                .build();

        r = new Response.Builder()
                .comment("Hey there, screw you")
                .date(new Date())
                .ipaddress("155.238.4.87")
                .build();

        r2 = new Response.Builder()
                .comment("Fokkof")
                .date(new Date())
                .ipaddress("155.238.4.87")
                .build();

        testComment = new Comment.Builder()
                .comment("Don't say screw you")
                .date(new Date())
                .ipaddress("123.456.7.89")
                .responses()
                .abuseReports()
                .build();
    }

    @Test
    public void testAddAbuseReport() throws Exception {
        testComment.addAbuseReport(ar);
        assertEquals("He wasn't nice", testComment.getAbuseReports().get(0).getDescription());
    }

    @Test
    public void testAddResponse() throws Exception {
        testComment.addResponse(r);
        assertEquals("Hey there, screw you", testComment.getResponses().get(0).getComment());
    }

    @Test
    public void testGetAbuseReports() throws Exception {
        testComment.addAbuseReport(ar);
        testComment.addAbuseReport(ar2);
        testComment.addAbuseReport(ar);

        List<AbuseReport> ars = testComment.getAbuseReports();

        assertEquals("I don't like you", ars.get(1).getDescription());

    }

    @Test
    public void testGetResponses() throws Exception {
        testComment.addResponse(r);
        testComment.addResponse(r2);
        testComment.addResponse(r);

        List<Response> ars = testComment.getResponses();

        assertEquals("Fokkof", ars.get(1).getComment());

    }

}