package za.ac.cput.university.Impl;

import za.ac.cput.university.BTech;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/06/04.
 */
public class BTechImpl implements BTech {

    private Map<String, String> btechStdList;
    private String stdDetail = "";


    public BTechImpl(){
        createStudentList();
    }
    public void createStudentList() {

        btechStdList = new HashMap<String, String>();

        btechStdList.put("211111111", "PinkPop");
        btechStdList.put("223231344", "SiphoTom");
    }

    @Override
    public String welcome(String studentNo) {

        if(btechStdList.containsKey(studentNo)) {
            stdDetail = (String)btechStdList.get(studentNo);
            return stdDetail;
        }
        else {
            return "Consult";
        }
    }
}
