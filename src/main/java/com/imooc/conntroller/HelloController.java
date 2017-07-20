package com.imooc.conntroller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/15.
 */
@RestController
public class HelloController {


    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") String id) {

        return "我获取到的ID："+id;
    }
}
