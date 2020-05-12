import com.UserDao;
import com.UserService;
import com.impl.Bean2;
import com.impl.User;
import com.impl.UserController;
import com.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
//        public static void main(String[] args) {
//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
//        userDao.say();
//        UserDao userDao1=new UserDaoImpl();
//        userDao1.say();
//    }
        public static void main(String[] args) {

            ApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml");

            UserController userController = (UserController) applicationContext.getBean("userController");
            userController.say();

//            ApplicationContext applicationContext =
//                    new ClassPathXmlApplicationContext("applicationContext.xml");
//            UserService userService = (UserService) applicationContext.getBean("userService");
//            userService.say();
//
//            UserService userService2 = (UserService) applicationContext.getBean("userService");
//            if(userService == userService2){
//                System.out.println("it is the same !");
//            }else {
//                System.out.println("it is not the same !");
//            }

//            Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
//            if(bean2==null){
//                System.out.println("it is null !");
//            }else{
//                System.out.println("it is not null!");
//            }

//            ApplicationContext applicationContext =
//                    new ClassPathXmlApplicationContext("applicationContext.xml");
//            User user1 = (User) applicationContext.getBean("user1");
//            User user2 = (User) applicationContext.getBean("user2");
//
//            System.out.println(user2.getName()+" : "+user2.getAge());
//            System.out.println(user1.getName()+" : "+user1.getAge());

        }
}
