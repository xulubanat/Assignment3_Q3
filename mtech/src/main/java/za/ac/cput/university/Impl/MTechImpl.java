package za.ac.cput.university.Impl;

import za.ac.cput.university.MTech;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/06/04.
 */
public class MTechImpl implements MTech {

    private Map<String, String> mtech;
    private String stdDetail = "";

    public MTechImpl()
    {
        createStudentDetail();
    }

    public void createStudentDetail()
    {
        mtech = new HashMap<String, String>();

        mtech.put("200987676", "YumNgaba");
        mtech.put("254654564", "LouiSam");
    }

    @Override
    public String welcome(String studentNo) {

        if(mtech.containsKey(studentNo)){
            stdDetail = mtech.get(studentNo);
            return stdDetail;
        }
        else{
            return "Consult";
        }
    }
}
