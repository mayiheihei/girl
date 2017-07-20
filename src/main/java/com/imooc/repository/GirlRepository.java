package com.imooc.repository;

import com.imooc.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 该接口继承了JpaReposistory接口，在simpleJapRepository中实现了接口中各种方法。
 * Created by Administrator on 2017/7/16.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    //通过年龄来查询
    public List<Girl> findByAge(Integer age);

}
