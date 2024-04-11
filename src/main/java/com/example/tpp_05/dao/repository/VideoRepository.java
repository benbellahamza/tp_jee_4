package com.example.tpp_05.dao.repository;

import com.example.tpp_05.dao.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
