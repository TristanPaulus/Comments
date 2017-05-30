package com.comments;

import com.comments.domain.Comment;
import com.comments.domain.Reputation;
import com.comments.domain.Response;
import com.comments.domain.User;
import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Reputation> reps = new ArrayList<Reputation>();

        Reputation r1 = new Reputation.Builder()
                .date(new Date("12/12/1994"))
                .value(0)
                .build();

        reps.add(r1);

        test(reps);

    }

    public static void test(List<Reputation> reps)
    {
        for(int i = 0;i<reps.size();i++)
        {
            System.out.println(reps.get(i).getDate());
        }
    }
}
