package com.example.tpp_05.service;


import com.example.tpp_05.dao.entity.Video;

import java.util.List;

public interface VideoManager {
    public Video addVideo(Video video);
    public boolean deleteVideo(Video video);
    public boolean deleteVideobyId(Integer id);
    public Video updateCreator(Video video);
    public List<Video> gettAllVideo();
    public Video getVideoById(Integer id);
}
