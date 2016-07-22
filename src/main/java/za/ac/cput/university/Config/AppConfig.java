package za.ac.cput.university.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.university.Impl.ModularStudentImpl;
import za.ac.cput.university.Student;

/**
 * Created by student on 2016/06/03.
 */
@Configuration
public class AppConfig {
    @Bean(name = "stud")
    public Student getStudent(){
        return new ModularStudentImpl();
    }

}
