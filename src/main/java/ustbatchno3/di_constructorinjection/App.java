package ustbatchno3.di_constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context =new ClassPathXmlApplicationContext("applicate.xml"); 
    	Role r=context.getBean("Jen",Role.class);
    	r.display();
      
    }
}
