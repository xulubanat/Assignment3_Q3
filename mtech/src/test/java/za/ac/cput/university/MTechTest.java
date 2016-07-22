package za.ac.cput.university;


import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import  org.junit.After;
import za.ac.cput.university.Impl.MTechImpl;

/**
 * Created by student on 2015/02/20.
 */
public class MTechTest {

    private MTech mtech;

    @Before
    public void setUp() throws Exception{
        mtech = new MTechImpl();
    }
    @Test
    public void testMtech() throws Exception{
        Assert.assertEquals("MTech Student" ,"YumNgaba", mtech.welcome("200987676"));
    }

    @After
    public void after() throws Exception{

    }


}
