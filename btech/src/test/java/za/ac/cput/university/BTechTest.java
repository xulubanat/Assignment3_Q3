package za.ac.cput.university;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import za.ac.cput.university.Impl.BTechImpl;

/**
 * Created by student on 2015/02/20.
 */
public class BTechTest {

    private BTech btech;

    @Before
    public void setUp() throws Exception {
        btech = new BTechImpl();

    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals("SiphoTom", btech.welcome("223231344"));
    }

    @After
    public void after() throws Exception {

    }
}
