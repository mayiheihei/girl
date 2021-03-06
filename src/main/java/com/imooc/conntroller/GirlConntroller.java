package com.imooc.conntroller;

import com.imooc.domain.Girl;
import com.imooc.domain.Result;
import com.imooc.repository.GirlRepository;
import com.imooc.service.GirlService;
import com.imooc.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2017/7/16.
 */
@RestController
public class GirlConntroller {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;


    private static final Logger logger = LoggerFactory.getLogger(GirlConntroller.class);

    /**
     * 查询出所有女生的信息
     *
     * @return 返回所有女生信息的集合
     */
    @GetMapping("/girls")
    public List<Girl> girlList() {
        logger.info("我是展示女生方法");
        return girlRepository.findAll();
    }


    /**
     * 增
     *
     * @param girl 女孩对象
     * @return 新增女孩信息
     */
    @PostMapping("/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());
        return ResultUtil.success(0, girlRepository.save(girl));
    }

    /**
     * 根据ID删除一个女孩
     *
     * @param id id
     * @return 删除成功提示信息
     */
    @DeleteMapping("/girls/{id}")
    public String girlDell(@RequestParam("id") Integer id) {
        girlRepository.delete(id);
        return "删除成功！";
    }

    /**
     * 根据ID查询女孩
     *
     * @param id
     * @return 女孩对象
     */
    @GetMapping("/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * 更新一个女孩的信息
     *
     * @param id
     * @param cupSize 罩杯
     * @param age     年龄
     * @return 更新后女孩的信息
     */
    @PutMapping("/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /**
     * 根据年龄查询
     *
     * @param age
     * @return girl集合
     */
    @GetMapping("/girls/girl/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }


    @PostMapping("/girls/two")
    @Transactional
    public void girlTwo() {
        girlService.insertTwo();
    }


    @GetMapping("/girls/ifAge/{id}")
    public void ifAge(@PathVariable("id") Integer id) throws Exception {
        girlService.ifAge(id);
    }
}
