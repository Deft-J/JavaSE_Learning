
package cn.shaoxiongdu;

import cn.shaoxiongdu.controller.IndexController;
import cn.shaoxiongdu.db.DB;

/**
 * @作者: coder <email@coder.cn>
 * @日期: 2025年09月14日 | 8:46
 * @描述: Main入口
 */
public class MainApplication {

    public static void main(String[] args) {

        //初始化数据
        DB.init();

        //启动
        IndexController.run();

    }

}
