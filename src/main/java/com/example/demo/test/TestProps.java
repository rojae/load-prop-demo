package com.example.demo.test;

import kr.rojae.prop.annotation.ComponentAfterLoad;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@ComponentAfterLoad
public class TestProps {

    @Value("${messenger.list}")
    public List<String> list;

}
