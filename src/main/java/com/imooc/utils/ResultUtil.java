package com.imooc.utils;

import com.imooc.domain.Result;

public class ResultUtil {
    public static Result success(Integer code,Object object){
        Result result = new Result();
        result.setCode(code);
        result.setMsg("成功！");
        result.setData(object);
        return result;
    }

    public  static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
