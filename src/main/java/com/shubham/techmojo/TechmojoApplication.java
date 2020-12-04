package com.shubham.techmojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechmojoApplication {


    public static void main(String[] args) {

        SpringApplication.run(TechmojoApplication.class, args);
        TrendingHashtags trendingHashtags = new TrendingHashtags();
        trendingHashtags.processAndDisplayTop10Tweets("Testing #nature #love#instacool#anothertogether #likeforlike, #relax. \\nmulti-line... #festival-- some more text #aaa \\n#anotherhashtag");
        trendingHashtags.processAndDisplayTop10Tweets("Worlds best cricketer is #sachin #shubham #shubham #shubham #singhal #singhal");

    }

}
