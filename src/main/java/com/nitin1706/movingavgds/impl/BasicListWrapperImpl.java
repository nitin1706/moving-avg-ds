package com.nitin1706.movingavgds.impl;

import com.nitin1706.movingavgds.ListWrapper;

import java.util.ArrayList;
import java.util.List;

public class BasicListWrapperImpl<Num extends Number> implements ListWrapper<Num> {

    private List<Num> numberList = new ArrayList<>();

    @Override
    public Num add(Num element) {
        numberList.add(element);
        return element;
    }

    @Override
    public boolean exists(Num element) {
        return numberList.contains(element);
    }

    @Override
    public Num getElementAt(int index) {
        return numberList.get(index);
    }

    @Override
    public Num getAvgLastN(int N) {
        return null;
    }

    @Override
    public Num getAvgFirstN(int N) {
        return null;
    }

    @Override
    public Num deleteElementAt(int index) {
        if (index >= numberList.size()) {
            throw new RuntimeException("List size is less than index specified.");
        }
        return numberList.remove(index);
    }

    @Override
    public Number sumAll() {
        Num firstElement = numberList.get(0);
        double sum = 0.0;
        for (Num num : numberList) {
            sum += num.doubleValue();
        }
        if (firstElement instanceof Double || firstElement instanceof Float) {
            return sum;
        } else {
            return (long) sum;
        }
    }

    @Override
    public int size() {
        return numberList.size();
    }
}
