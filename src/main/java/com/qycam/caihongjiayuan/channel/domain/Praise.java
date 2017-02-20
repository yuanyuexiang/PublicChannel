package com.qycam.caihongjiayuan.channel.domain;

/**
 * Created by tom on 16-9-29.
 */

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 {
 "blog_id" : 2,
 "role": "teacher",
 "name": "TOM",
 "id": "123456",
 "created_at" : ISODate("2016-08-24T05:29:12.633Z")
 }
 */
@Document(collection = "praises")
public class Praise {
    public String blog_id;
    public String role;
    public String name;
    public String id;
    public Date created_at;

    public Praise() {}
}
