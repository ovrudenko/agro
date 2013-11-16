/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbutillib;

import com.onebutton.db.connection.PgsqlConnection;
import com.onebutton.db.hibernate.Advert;
import com.onebutton.db.hibernate.RefAdvertType;
import com.onebutton.db.params.AdvertParams;
import com.onebutton.db.queries.AdvertQueries;
import java.sql.SQLException;
import java.util.List;
import javax.naming.RefAddr;

/**
 *
 * @author lolka
 */
public class DbUtilLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        AdvertQueries aq = new AdvertQueries();
        AdvertParams p = new AdvertParams();
        p.setLimit(10);
        PgsqlConnection ps = new PgsqlConnection();
        List<RefAdvertType> adv = aq.getGroupedAdvertsByProductType(ps.getConnection());
        for (int i = 0; i < adv.size(); i++) {
            System.out.println(adv.get(i).getName());          
            System.out.println(adv.get(i).getCount());
        }
    }
}
