package com.example.tpp_05;

import com.example.tpp_05.dao.entity.Video;
import com.example.tpp_05.dao.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Tpp05Application  implements CommandLineRunner {
    @Autowired
    private VideoRepository videoRepository;

    public static void main(String[] args) {
        SpringApplication.run(Tpp05Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Video video = new Video();
        video.setName("got");
        video.setDescription("action");
        video.setUrl("ff");
        video.setDatePublication(new Date());
        videoRepository.saveAll(List.of(video));


    }
}
