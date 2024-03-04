package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAvecSpringAnnotation {
    public static void main(String[] args) {
//        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier");
//        IMetier metier =context.getBean(IMetier.class);//a bean of Imetier type
//        System.out.println("res="+metier.calcul());
        ApplicationContext context=new AnnotationConfigApplicationContext("ext","metier","dao");
        IMetier metier =context.getBean(IMetier.class);//a bean of Imetier type
        System.out.println("res="+metier.calcul());

    }
}
