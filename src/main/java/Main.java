import eliseeva.Config;
import eliseeva.Parse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)  {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Parse parse = context.getBean(Parse.class);
        parse.parseFile();
        context.close();
    }
}
