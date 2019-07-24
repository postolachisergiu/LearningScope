package com.cucumber.transform;

import cucumber.api.Transformer;

public class CountTransform extends Transformer<Integer> {

    @Override
    public Integer transform(String salary) {
        return salary.length();
    }
}
