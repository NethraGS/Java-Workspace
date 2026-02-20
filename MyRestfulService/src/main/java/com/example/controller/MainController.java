package com.example.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // It exposes data and service in the form of JSON/XML
public class MainController {
    List<String> list = new ArrayList<String>();

    public MainController() {
        list.add("Dhoni");
        list.add("Virat");
        list.add("Rahul");
    }

    @GetMapping("/list")
    //@RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<String> list() {
        return list;
    }

    @PostMapping("/list")
    public void add(@RequestBody String name) {
        //list.add("ice cream");
        list.add(name);
    }

    @PutMapping("/update/{index}")
    public void update(@PathVariable int index,@RequestBody String name){
        list.set(3,name);
    }
    @DeleteMapping("/delete/{index}")
    public void delete(@PathVariable int index){
        list.remove(index);
    }
    @GetMapping("/findOne/{index}")
    public String findOne(@PathVariable int index){
        return list.get(index);
    }
}
