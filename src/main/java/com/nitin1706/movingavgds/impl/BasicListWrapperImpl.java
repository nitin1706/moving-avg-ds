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
    public double getAvg() {
        if (numberList == null) {
            throw new RuntimeException("Null List");
        }
        double sum = 0.0;
        for (Num num : numberList) {
            sum += num.doubleValue();
        }

        return (sum/numberList.size());
    }

    @Override
    public double getAvgLastN(int N) {
        if (N == 0) {
            return 0.0;
        }
        enoughElements(N);
        double sum = 0.0;
        for (int count = numberList.size()-1; (count >= 0 && (N >= numberList.size() - count)); count--) {
            sum += numberList.get(count).doubleValue();
        }
        return (sum/N);
    }

    @Override
    public double getAvgFirstN(int N) {
        if (N == 0) {
            return 0.0;
        }
        enoughElements(N);
        double sum = 0.0;
        for (int count = 0; count < numberList.size() && count < N ; count++) {
            sum += numberList.get(count).doubleValue();
        }
        return (sum/N);
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

    private void enoughElements(int N) {
        if (N >= numberList.size()) {
            throw new RuntimeException("List size is less than index specified.");
        }
    }
}
