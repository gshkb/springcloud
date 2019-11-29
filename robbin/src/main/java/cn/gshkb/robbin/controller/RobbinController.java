package cn.gshkb.robbin.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author hkb
 * @version v1.0
 * @date 2019-11-23-1:08
 */
@RestController
public class RobbinController {

    private final static String PREFIX = "http://service-test";

    @Autowired
    private RestTemplate template;

    @RequestMapping(value = "/robbin/balance",method = RequestMethod.GET)
   public String testRobbin(){
       return template.getForEntity(PREFIX+"/test/robbin",String.class).getBody();
   }
}
