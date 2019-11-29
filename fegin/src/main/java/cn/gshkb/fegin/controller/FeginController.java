package cn.gshkb.fegin.controller;

import cn.gshkb.fegin.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hkb
 * @version v1.0
 * @date 2019-11-23-18:03
 */
@RestController
public class FeginController {

    @Autowired
    private FeginService feginService;


    @RequestMapping(value = "/fegin/test",method = RequestMethod.GET)
    public String fegin(){
        return feginService.fegin();
    }
}
