package com.example.tpp_05.service;

import com.example.tpp_05.dao.entity.Creator;

import java.util.List;

public interface CreatorManager {
    public Creator addCreator(Creator creator);
    public boolean deleteCreator(Creator creator);
    public boolean deleteCreatorbyId(Integer id);

    boolean deleteCreatorById(Integer id);

    public Creator updateCreator(Creator creator);
    public List<Creator> gettAllCreator();

    List<Creator> getAllCreators();

    Creator getCreatorById(Long id);
}