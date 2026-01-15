/*
 * Copyright (c) 2021. 杜少雄 AllRightsReserved
 */

package cn.shaoxiongdu.controller.systemmodule;

import cn.shaoxiongdu.bean.Log;
import cn.shaoxiongdu.service.LogService;

import java.util.List;

/**
 * @作者: coder <email@coder.cn>
 * @日期: 2025年04月07日 | 16:39
 * @描述: 日志 控制层
 */
public class LogController {

    /**
     * 日志管理菜单
     */
    public static void menu() {
        printAll();
    }


    /**
     * 打印全部日志
     */
    public static void printAll() {
        System.out.println("------------------------------------------ 日 志 记 录 --------------------------------------------------------");
        //循环输出
        List<Log> all = LogService.getAll();
        all.stream().forEach(System.out::println);
        System.out.println("------------------------------------------ 日 志 记 录 --------------------------------------------------------");
        System.out.println("\t共计" + all.size() + "条记录。");
    }

}
