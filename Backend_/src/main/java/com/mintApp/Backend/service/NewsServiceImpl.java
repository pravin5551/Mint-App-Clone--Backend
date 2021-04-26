package com.mintApp.Backend.service;



import com.mintApp.Backend.entity.Category;
import com.mintApp.Backend.entity.Newsarticle;
import com.mintApp.Backend.entity.Region;
import com.mintApp.Backend.repository.CategoryDAO;
import com.mintApp.Backend.repository.NewsDAO;
import com.mintApp.Backend.repository.RegionDAO;
import com.mintApp.Backend.repository.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    NewsDAO newsDAO;
    @Autowired
    CategoryDAO categoryDAO;
    @Autowired
    RegionDAO regionDAO;
    @Autowired
    Technology technologyDAO;

    @Override
    public Iterable<Newsarticle> getNewsByRegion(String name) {
        return newsDAO.findAllByRegion(name);
    }

    @Override
    public Iterable<Category> getAllCategory() {
        return categoryDAO.findAll();
    }

    @Override
    public Iterable<Newsarticle> getAllTechnology() {
        return newsDAO.findAll();
    }

    @Override
    public Iterable<Newsarticle> getALlNewsDesc() {
        return newsDAO.findAllNewsDesc();
    }


    @Override
    public Iterable<Region> getAllRegion() {
        return regionDAO.findAll();
    }
}
