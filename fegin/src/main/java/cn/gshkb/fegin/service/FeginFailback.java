package cn.gshkb.fegin.service;

import org.springframework.stereotype.Component;

/**
 * 调用熔断
 *
 * @author hkb
 * @version v1.0
 * @date 2019-11-23-22:32
 */
@Component
public class FeginFailback implements FeginService{

    @Override
    public String fegin() {
        return "调用失败";
    }
}
