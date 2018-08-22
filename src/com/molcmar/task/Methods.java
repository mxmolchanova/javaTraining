package com.molcmar.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by dsk14 on 8/21/2018.
 */
public class Methods {

    public int countA1(List<String> list) {

        return (int) list.stream().filter("a1"::equals).count();
    }

    public String getFirstElement(List<String> list) {

        return list.stream().findFirst().orElse("0");
    }

    public Optional<String> getLastElement(List<String> list) {

        if (list.isEmpty()) {
            return Optional.empty();
        }
        return list.stream().skip(list.size()-1).findFirst();
    }

    public Object getEqualElement(List<String> list, String e) {
        if (list.isEmpty()) {
            return 0;
        }

        return (list.stream().filter(e::equals).findFirst().isPresent() ? e : 0);
    }

    public Object getValueOf(List<String> list, int index) {
        if (index < list.size()) {
            return list.stream().skip(index).findFirst().get();
        }
        return 0;
    }

    public List<String> getSubList(List<String> list, int startWith, int size) {
        List<String> res = new ArrayList<>();
        for (int i = startWith; i < (startWith+size); i++) {
            res.add(list.get(i));
            }
        return res;
    }

}
