package com.molcmar.task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsk14 on 8/21/2018.
 */
public class Methods {

    public int countA1(List<String> list) {
        int count = 0;
        for (String s : list) {
            if(s.equals("a1")) {
                count++;
            }
        }
        return count;
    }
}
