package com.example.Examples;

import java.util.List;

/**
 * Created by adutta on 9/5/2014.
 */
public interface TestInterface<T, ID> {
    public List<T> getAll(ID id);
    public void setData(T data);
}
