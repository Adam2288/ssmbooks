import com.xiao.pojo.Books;
import com.xiao.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");
        for(Books book:bookServiceImpl.queryAllBooks()){
            //更新lombok的pom包至最新包，解决与IDEA下载的lombok插件版本不一致，从而导致books无法使用set、get方法的问题。
            System.out.println(book);
        }
    }
}
