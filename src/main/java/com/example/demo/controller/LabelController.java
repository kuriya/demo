package com.example.demo.controller;


import com.example.demo.dto.LabeOutputDTO;
import com.example.demo.dto.LabelInputDTO;
import com.example.demo.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rx.Observable;

@RestController()
@RequestMapping("api/labels")
public class LabelController {

    @Autowired
    LabelService labelService;

    @GetMapping
    public Observable<LabeOutputDTO> getLabel(@RequestBody LabelInputDTO label) {

        LabeOutputDTO output = labelService.createLabel(label);
        Observable<LabeOutputDTO> observable = Observable.just(output);
        return observable;
    }

}
