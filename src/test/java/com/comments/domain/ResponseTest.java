package com.comments.domain;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

/**
 * Created by Tristan on 2017/05/31.
 */
public class ResponseTest {

    AbuseReport ar, ar2;
    Response r;

    @BeforeMethod
    public void setUp() throws Exception {

        ar = new AbuseReport.Builder()
                .description("He swore")
                .build();
        ar2 = new AbuseReport.Builder()
                .description("He smiled")
                .build();
        r = new Response.Builder()
                .comment("Fuck")
                .date(new Date())
                .ipaddress("123.456.7.89")
                .abuseReports()
                .build();

    }

    @Test
    public void testAddAbuseReport() throws Exception {
        r.addAbuseReport(ar);
        assertEquals("He swore", r.getAbuseReports().get(0).getDescription());
    }

    @Test
    public void testGetAbuseReports() throws Exception {
        r.addAbuseReport(ar);
        r.addAbuseReport(ar2);
        assertEquals("He smiled", r.getAbuseReports().get(1).getDescription());
    }

}