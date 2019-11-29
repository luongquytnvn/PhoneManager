package com.codegym.services;

import com.codegym.models.Category;
import com.codegym.models.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

import java.util.List;

public interface PhoneService {
    Page<Phone> findAll(Pageable pageable);
    List<Phone> findByCategory(Category category);
    Phone findById(Long id);
    void save(Phone phone);
    void remove(Long id);
}
