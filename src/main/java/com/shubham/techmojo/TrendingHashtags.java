package com.shubham.techmojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class TrendingHashtags {

    private HashMap<String, Integer> tweetFrequency ;

    public TrendingHashtags() {
        this.tweetFrequency = new HashMap<>();
    }

    public void processAndDisplayTop10Tweets(String sentence){

        //Process Hashtags
        String regexPattern = "(#\\w+)";
        Pattern p = Pattern.compile(regexPattern);
        Matcher m = p.matcher(sentence);
        while (m.find()) {
            String hashtag = m.group(1);
            if(tweetFrequency.containsKey(hashtag)){
                tweetFrequency.put(hashtag, tweetFrequency.get(hashtag) + 1);
            }else{
                tweetFrequency.put(hashtag, 1);
            }
        }

        //Display top 10 hashtags
        System.out.println("Top 10 hashtags: ");
        tweetFrequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .limit(10)
                .forEach((s) -> System.out.println(String.format("%s : %s", s.getKey(), s.getValue())));
        System.out.println();
    }
}
