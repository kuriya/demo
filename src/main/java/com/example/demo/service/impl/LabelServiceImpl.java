package com.example.demo.service.impl;

import com.example.demo.dto.LabeOutputDTO;
import com.example.demo.dto.LabelInputDTO;
import com.example.demo.service.LabelService;
import org.springframework.stereotype.Service;

@Service
public class LabelServiceImpl implements LabelService {



    public LabelServiceImpl() {
    }

    @Override
    public LabeOutputDTO createLabel(LabelInputDTO label) {
        LabeOutputDTO output = new LabeOutputDTO("dilshan", "test");
        return output;
    }
}
