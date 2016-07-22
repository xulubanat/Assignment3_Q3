package za.ac.cput.university;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.university.Config.AppConfig;

/**
 * Created by student on 2016/06/03.
 */
public class StudentBTexhTest {
    private Student btech;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        btech = (Student)ctx.getBean("stud");

    }

    @Test
    public void testName() throws Exception {

        Assert.assertEquals("Btech Student:", "SiphoTom", btech.btech("223231344"));

    }

    @After
    public void tearDown() throws Exception {


    }
}
