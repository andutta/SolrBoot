package com.example.Examples;

import java.util.List;

/**
 * Created by adutta on 9/5/2014.
 */
public class TestClass<T, ID, K> implements TestInterface<T, ID> {

    private K classData;
    private T data;

    @Override
    public List<T> getAll(ID id) {
        return null;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    public T getOnly(ID id){
        T localData = (T) new Object();

        return localData;
    }
}
