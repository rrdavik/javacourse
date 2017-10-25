package com.concretepage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.concretepage.entity.DressCategory;

@Repository
public interface DressCategoryRepository extends JpaRepository<DressCategory, Integer>{

}
