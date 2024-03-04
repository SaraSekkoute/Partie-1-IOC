package pres;

import dao.DaoImpl;
import dao.IDao;
import ext.DaoImplV2;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres {
    public static void main(String[] args)throws Exception{

       // instanciation statique (new)
     DaoImplV2 dao =new DaoImplV2();
    MetierImpl metier=new MetierImpl(dao);
     metier.setDao(dao);
     System.out.println(metier.calcul());



        //instanciation dynamique

        /*
      Scanner scanner =new Scanner(new File("config.txt"));
       String daoClassName=scanner.nextLine();
       Class cDao =Class.forName(daoClassName);
       IDao dao =(IDao) cDao.newInstance();
       //System.out.println(dao.getdata());


        String metierClasseName=scanner.next();
        Class cMetier=Class.forName(metierClasseName);
        IMetier metier= (IMetier) cMetier.newInstance();

        //metier.setDao(dao);
        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println("Resultat ="+metier.calcul());

         */






   }
}
