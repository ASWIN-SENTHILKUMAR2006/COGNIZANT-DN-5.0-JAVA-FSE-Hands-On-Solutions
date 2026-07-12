
/**
 * @author Aswin Senthilkumar
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

//@Configuration
//@ComponentScan(basePackages = "com.library")
//@EnableAspectJAutoProxy

public class LibraryApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service =
                context.getBean("bookService", BookService.class);

        BookRepository repository =
                context.getBean("bookRepository", BookRepository.class);

        service.displayService("Aswin");

     //   repository.displayRepository();

    }
}
