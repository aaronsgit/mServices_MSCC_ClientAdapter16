import org.junit.Test;
import solutions.legatus.mservice.mscc.client.Utils.BeanUtils;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by ahou on 6/5/2016.
 */
public class DatetimeTest {


    @Test
    public void DateTime_test() {

        String str = "2020-10-23 10:10:10.111";

        Timestamp ts = BeanUtils.GetUTCTimestamp( str  );


        System.out.println( "result is:" + ts );



    }


}
