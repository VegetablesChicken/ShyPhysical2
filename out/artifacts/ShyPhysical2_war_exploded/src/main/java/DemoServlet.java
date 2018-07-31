/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: DemoServlet
 * Author:   sunhongyang
 * Date:     2018/7/9 19:19
 * Description: 测试servlet
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试servlet〉
 *
 * @author sunhongyang
 * @create 2018/7/9
 * @since 1.0.0
 */
public class DemoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.print("doPost");
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.print("doGet");
        super.doGet(req, resp);
    }


}
