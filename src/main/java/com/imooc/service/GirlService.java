package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(20);
        girlRepository.save(girlB);
    }

    public void ifAge(Integer id) throws Exception {
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        System.out.println("年龄是："+age);
        //如果年龄小于12岁，你还在上小学吧。
        if (age < 12) {
            throw new Exception("你还在上小学吧");
        }
        //如果年龄大于12岁，小于18岁，你在上初中吧。
        else if (12 < age && age < 18) {
            throw new Exception("你还在上初中吧");
        }
        //如果大于18岁，给钱。
        else {
            throw new Exception("多钱？");
        }
    }
}
