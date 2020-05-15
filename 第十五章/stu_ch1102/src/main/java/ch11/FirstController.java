package ch11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 控制器类
 */
@Controller
@RequestMapping("/hello")
public class FirstController {
    @RequestMapping("/first")
    public String sayHello(Model model){
        model.addAttribute("msg","这是我的第二个Spring MVC程序");
        return "first";
    }
//    public ModelAndView handleRequest(HttpServletRequest request,
//                                      HttpServletResponse response)  {
//        // 创建ModelAndView对象
//        ModelAndView mav = new ModelAndView();
//        // 向模型对象中添加数据
//        mav.addObject("msg", "这是我的第一个Spring MVC程序");
//        // 设置逻辑视图名
//        mav.setViewName("/WEB-INF/jsp/first.jsp");
//        // 返回ModelAndView对象
//        return mav;
//    }
}
