import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Student vis = new Student();
        vis.setID(101);
        vis.setName("Viswanath");
        vis.setAge(26);
        Configuration con = new Configuration();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.save(vis);
        
    }
}
