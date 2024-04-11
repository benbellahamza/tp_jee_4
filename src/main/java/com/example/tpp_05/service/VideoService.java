package com.example.tpp_05.service;


import com.example.tpp_05.dao.entity.Video;
import com.example.tpp_05.dao.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements VideoManager {
    @Autowired
    private VideoRepository videoRepository;
    @Override
    public Video addVideo(Video video) {
        try {
            return videoRepository.save(video);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    @Override
    public boolean deleteVideo(Video video) {
        return false;
    }

    @Override
    public boolean deleteVideobyId(Integer id) {
        return false;
    }

    @Override
    public Video updateCreator(Video video) {
        return null;
    }

    @Override
    public List<Video> gettAllVideo() {
        List<Video>videos=videoRepository.findAll();
        return videos;

    }

    @Override
    public Video getVideoById(Integer id) {
        return null;
    }
}
