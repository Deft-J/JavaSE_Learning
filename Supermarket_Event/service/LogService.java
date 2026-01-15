/*
 * Copyright (c) 2021. 杜少雄 AllRightsReserved
 */

package cn.shaoxiongdu.service;

import cn.shaoxiongdu.bean.Log;
import cn.shaoxiongdu.db.DB;

import java.util.List;

/**
 * @作者: coder <email@coder.cn>
 * @日期: 2025年04月07日 | 9:58
 * @描述: 日志记录器
 */
public class LogService {

    /**
     * DB
     */
    public static List<Log> logs = DB.db.get("logDB");

    /**
     * 保存日志
     *
     * @param title
     * @param description
     * @param isSuccess
     * @param logType
     * @param remark
     */
    public static void log(String title, String description, Boolean isSuccess, Log.LogType logType, String remark) {
        Log log = new Log(title, description, isSuccess, logType, remark);
        logs.add(log);
    }

    public static List<Log> getAll() {
        log("查看日志", "查看了全部日志记录", true, Log.LogType.日志管理模块日志, "无");
        return logs;
    }
}
