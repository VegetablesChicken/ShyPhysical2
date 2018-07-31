/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TestController
 * Author:   sunhongyang
 * Date:     2018/7/9 22:23
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.shyphysical.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author sunhongyang
 * @create 2018/7/9
 * @since 1.0.0
 */
@EnableAutoConfiguration
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String Test(String tt){
        return tt;
    }
}
