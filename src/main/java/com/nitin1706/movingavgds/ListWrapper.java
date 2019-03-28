package com.nitin1706.movingavgds;

public interface ListWrapper<Num extends Number> {

    Num add(Num element);
    boolean exists(Num element);
    Num getElementAt(int index);

    double getAvg();
    double getAvgLastN(int N);
    double getAvgFirstN(int N);

    Num deleteElementAt(int index);
    Number sumAll();

    int size();

}
