package com.imooc.conntroller;

import com.imooc.domain.Sssj02;
import com.imooc.repository.Sssj02Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Sssj02Controller {
    @Autowired
    private Sssj02Repository sssj02Repository;

    @RequestMapping("findAllJw")
    @ResponseBody
    public List<Sssj02> findAllJw(){
        return sssj02Repository.findAll();
    }

    @PostMapping("updateJw")
    public Sssj02 updateJw(Sssj02 sssj02){
        return sssj02Repository.save(sssj02);
    }
}
