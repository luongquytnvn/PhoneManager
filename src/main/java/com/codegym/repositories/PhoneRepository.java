package com.codegym.repositories;

import com.codegym.models.Category;
import com.codegym.models.Phone;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PhoneRepository extends PagingAndSortingRepository<Phone,Long> {
    List<Phone> findByCategory(Category category);
}
