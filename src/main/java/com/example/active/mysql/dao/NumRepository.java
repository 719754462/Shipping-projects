package com.example.active.mysql.dao;

import com.example.active.mysql.pojo.Num;
import org.springframework.data.repository.CrudRepository;

public interface NumRepository extends CrudRepository<Num, Integer> {
}
