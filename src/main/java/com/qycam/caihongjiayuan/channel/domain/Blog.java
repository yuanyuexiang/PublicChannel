package com.qycam.caihongjiayuan.channel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by tom on 16-9-29.
 */
/**
 *
 {
     "owner": {
         "type": "school",
         "name": "小红花幼儿园",
         "id": 123456,
         "location": [
             "34.23123",
             "34.21312"
         ]
     },
     "id": 2,
     "created_at": "2016-08-24T05:29:12.633Z",
     "title": "重归苏莲托",
     "content": "看，这海洋多么美丽！多么激动人的心情！看这大自然的风景，多么使人陶醉！",
     "images": [
         {
             "description": "天龙盖地虎",
             "address": "http://xx.xx.xx/xxx"
         },
         {
             "description": "宝塔镇河妖",
             "address": "http://yy.yy.yy/yyy"
         }
     ],
     "videos": [
         {
             "thumbnail": "http://xx.xx.xx/xxx",
             "description": "天龙盖地虎",
             "address": "rtmp://xx.xx.xx/xxx"
         },
         {
             "thumbnail": "http://xx.xx.xx/xxx",
             "description": "宝塔镇河妖",
             "address": "rtmp://yy.yy.yy/yyy"
         }
     ],
     "audios": [
         {
             "description": "天龙盖地虎",
             "address": "http://xx.xx.xx/xxx"
         },
         {
             "description": "宝塔镇河妖",
             "address": "http://yy.yy.yy/yyy"
         }
     ]
     }
 */

@Document(collection = "blogs")
public class Blog {

    public Owner owner;
    @Id
    public String id;
    public Date created_at;
    public String title;
    public String content;

    public Image[] images;
    public Video[] videos;
    public Audio[] audios;

    @DBRef
    public Comment[] comments;

    public Blog(String title,String content){
        this.title = title;
        this.content = content;
    }
    public Blog() {}

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public static class Owner{
        /**
         {
             "type": "school",
             "name": "小红花幼儿园",
             "id": 123456,
             "location": [
                 "34.23123",
                 "34.21312"
             ]
         }
         */
        public String type;
        public String name;
        public String id;
        public String[] location;

        public Owner(String type, String name, String id, String[] location) {
            this.type = type;
            this.name = name;
            this.id = id;
            this.location = location;
        }

        public Owner() {}
    }

    public static class Image {
        /**
         {
             "description": "天龙盖地虎",
             "address": "http://xx.xx.xx/xxx"
         }
         */
        public String description;
        public String address;

        public Image(String description, String address) {
            this.description = description;
            this.address = address;
        }

        public Image() {}
    }

    public static class Video {
        /**
         {
         "thumbnail": "http://xx.xx.xx/xxx",
         "description": "天龙盖地虎",
         "address": "rtmp://xx.xx.xx/xxx"
         }
         */
        public String thumbnail;
        public String description;
        public String address;

        public Video(String thumbnail, String description, String address) {
            this.thumbnail = thumbnail;
            this.description = description;
            this.address = address;
        }

        public Video() {}
    }

    public static class Audio {
        /**
         {
         "description": "天龙盖地虎",
         "address": "http://xx.xx.xx/xxx"
         }
         */
        public String description;
        public String address;

        public Audio(String description, String address) {
            this.description = description;
            this.address = address;
        }

        public Audio() {}
    }
}
