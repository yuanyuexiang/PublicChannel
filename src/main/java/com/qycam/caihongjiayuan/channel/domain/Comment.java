package com.qycam.caihongjiayuan.channel.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Resources;
import java.util.Date;

/**
 * Created by tom on 16-9-29.
 */

/**
 {
     "blog_id" : 2,
     "role": "teacher",
     "name": "TOM",
     "id": "123456",
     "content": "彩虹宝贝吊啊，用户都说好啊！",
     "created_at" : ISODate("2016-08-24T05:29:12.633Z")
 }
 */
@Document(collection = "comments")
public class Comment {
    public String blog_id;
    public String role;
    public String name;
    public String id;
    public String content;
    public Date created_at;

    public Comment() {}
}
