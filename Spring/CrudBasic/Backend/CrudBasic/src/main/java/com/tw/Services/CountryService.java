package com.tw.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.tw.Entities.Country;
import com.tw.Repositories.CountryRepository;

@Service
@Transactional
public class CountryService{
	
	@Autowired
    CountryRepository countryRepository;
	
    public Page<Country> pages(Pageable pageable){
        return countryRepository.findAll(pageable);
    }

}
