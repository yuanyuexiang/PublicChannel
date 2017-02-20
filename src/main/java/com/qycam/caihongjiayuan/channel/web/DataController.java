package com.qycam.caihongjiayuan.channel.web;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.qycam.caihongjiayuan.channel.domain.Comment;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.qycam.caihongjiayuan.channel.dao.BlogRepository;
import com.qycam.caihongjiayuan.channel.domain.Blog;
import com.qycam.caihongjiayuan.channel.domain.ReturnData;

import javax.validation.Valid;
import java.util.*;

/**
 * Created by tom on 16-9-29.
 */
@RestController
@RequestMapping("/blogs")
public class DataController {

    @Autowired
    BlogRepository blogRepository;

    @RequestMapping(method = RequestMethod.POST,produces="application/json")
    public ReturnData save(@RequestBody @Valid Blog _blog,@RequestHeader ("token") String token){
        /*
        Blog _blog =  new Blog("123456","hello");
        _blog.created_at = new Date();
        _blog.owner = new Blog.Owner("school","小花花","123456",new String[]{"sads","adsad"});
        _blog.audios = new Blog.Audio[]{new Blog.Audio("一首歌","http://www.song.com")};
        _blog.videos = new Blog.Video[]{new Blog.Video("http://www.song.com","我的班级","rtmp://www.v.com")};
        _blog.images = new Blog.Image[]{new Blog.Image("一幅画","http://www.image.com"),new Blog.Image("一首歌","http://www.song.com")};
        */
        _blog.setCreated_at(new Date());
        System.out.println( "Response body: " );
        blogRepository.save(_blog);
        return new ReturnData(0,"OK",_blog);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET,produces="application/json")
    public ReturnData get(@PathVariable String id,@RequestHeader ("token") String token){
        Blog blog = blogRepository.findById(id);
        return new ReturnData(0,"OK",blog);
    }

    /**
     * 经纬度
     *
     * @param lng float 经度
     * @param lat float 纬度
     * @return ReturnData
     */
    @RequestMapping(method = RequestMethod.GET,produces="application/json")
    public ReturnData getAll(@RequestParam("lan") float lng,@RequestParam("lat") float lat,@RequestHeader ("token") String token){
        List<Blog> c = blogRepository.findAll();
        if (c.isEmpty()) {
            return new ReturnData(-1, "NOT FOUND", null);
        }else{
            return new ReturnData(0, "OK", c);
        }
    }
}
