package cn.gshkb.service3.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hkb
 * @version v1.0
 * @date 2019-11-23-0:54
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/test/robbin",method = RequestMethod.GET)
    public String robbinTest(){
        return "test3";
    }

    @RequestMapping(value = "/test/fegin",method = RequestMethod.GET)
    public String robbinFegin(){
        return "test3";
    }
}
