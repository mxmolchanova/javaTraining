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

    public Object getFirstElement(List<String> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.get(0);
    }

    public Object getLastElement(List<String> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.get(list.size()-1);
    }

    public Object getEqualElement(List<String> list, String e) {
        if (list.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            if (e.equals(value)) {
                return value;
            }
        }
        return 0;
    }

    public Object getValueOf(List<String> list, int index) {
        if (index < list.size()) {
            return list.get(index);
        }
        return 0;
    }


}
