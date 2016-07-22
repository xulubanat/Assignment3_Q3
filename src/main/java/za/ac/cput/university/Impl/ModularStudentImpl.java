package za.ac.cput.university.Impl;

import za.ac.cput.university.*;
import za.ac.cput.university.MTech;
import za.ac.cput.university.Student;


/**
 * Created by student on 2016/06/04.
 */
public class ModularStudentImpl implements Student {

    private BTech btechmodule = new BTechImpl();
    private MTech mtechmodule = new MTechImpl();

    @Override
    public String btech(String stdNo) {
        return btechmodule.welcome(stdNo);
    }


    @Override
    public String mtech(String stdNo) {
        return mtechmodule.welcome(stdNo);
    }
}
