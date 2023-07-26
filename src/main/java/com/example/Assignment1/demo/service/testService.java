package com.example.Assignment1.demo.service;

import com.example.Assignment1.demo.model.TestModel;
import org.springframework.stereotype.Service;

@Service
public class testService {

    public static int addService(TestModel model) {
        return model.getNum1()+model.getNum2();
    }

    public static int subService(TestModel model) {
        return Math.abs(model.getNum1()-model.getNum2());
    }

    public static int mulService(TestModel model) {
        return model.getNum1()*model.getNum2();

    }

    public static int divService(TestModel model) {
        return model.getNum1()/model.getNum2();

    }

    public static int modService(TestModel model) {
        return model.getNum1()%model.getNum2();

    }
}
