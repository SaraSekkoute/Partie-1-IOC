package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        // IMetier metier=(IMetier) context.getBean("metier");//id=metier
       IMetier metier=context.getBean(IMetier.class);//cherche un objet qui implemente cette interface  si on a deux beans il affcihe erreur
         System.out.println(metier.calcul());
    }
}
