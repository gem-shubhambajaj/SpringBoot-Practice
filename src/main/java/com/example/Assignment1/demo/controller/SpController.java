package com.example.Assignment1.demo.controller;

import com.example.Assignment1.demo.model.TestModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.Assignment1.demo.service.testService;

@Controller
@ResponseBody
public class SpController {

    @PostMapping("/add")
    public int add(@RequestBody TestModel model) {
        return testService.addService(model);
    }
    @PostMapping("/sub")
    public int sub(@RequestBody TestModel model) {
        return testService.subService(model);
    }
    @PostMapping("/mul")
    public int mul(@RequestBody TestModel model) {
        return testService.mulService(model);
    }
    @PostMapping("/div")
    public int div(@RequestBody TestModel model) {
        return testService.divService(model);
    }
    @PostMapping("/mod")
    public int mod(@RequestBody TestModel model) {
        return testService.modService(model);
    }


}
