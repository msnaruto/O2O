/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HomeController
 * Author:   lyl
 * Date:     2019/8/1 20:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lyl.o2o.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lyl
 * @create 2019/8/1
 * @since 1.0.0
 */
@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/index")
    @ResponseBody
    public String toIndex(){

        logger.info("info信息");
        logger.error("error信息");
        logger.debug("debug信息");
        return "index";
    }
}

