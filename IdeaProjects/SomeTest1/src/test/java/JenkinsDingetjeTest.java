/**
 * Created by ronaldverduin on 07/04/16.
 */
public class JenkinsDingetjeTest {

    @org.junit.Test
    public void testDoeIetsGoed() throws Exception {
        JenkinsDingetje jd = new JenkinsDingetje();
        String retval = jd.doeIets("name");
        System.out.println("retval=" + retval);

    }
}