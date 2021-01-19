package com.example.newsapp;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "rss", strict = false)
public class Feed {

    @Element Channel channel;

}
