package com.mintApp.Backend.service;



import com.mintApp.Backend.entity.Category;
import com.mintApp.Backend.entity.Newsarticle;
import com.mintApp.Backend.entity.Region;
import org.springframework.stereotype.Component;

@Component
public interface NewsService {

    Iterable<Newsarticle> getNewsByRegion(String name);

    Iterable<Category> getAllCategory();

    Iterable<Newsarticle> getAllTechnology();

    Iterable<Newsarticle> getALlNewsDesc();

    Iterable<Region> getAllRegion();
}
