package ext;

import dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("dao2")

public class DaoImplV2 implements IDao {
    @Override
    public double getdata()
    {
        System.out.println("Versios Web Service");
        double temp=77;
        return  temp;
    }
}
