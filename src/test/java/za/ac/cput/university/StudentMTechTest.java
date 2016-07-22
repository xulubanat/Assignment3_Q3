package za.ac.cput.university;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.university.Config.AppConfig;

/**
 * Created by student on 2016/06/04.
 */
public class StudentMTechTest {

    private Student mtech;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mtech = (Student)ctx.getBean("stud");
    }

    @Test
    public void testName() throws Exception {
         Assert.assertEquals("MTech Student", "YumNgaba", mtech.mtech("200987676"));
    }

    @After
    public void tearDown() throws Exception {


    }
}
