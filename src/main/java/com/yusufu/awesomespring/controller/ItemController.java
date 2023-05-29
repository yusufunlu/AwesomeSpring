package com.yusufu.awesomespring.controller;

import com.yusufu.awesomespring.entity.Item;
import com.yusufu.awesomespring.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping(value = "/add")
    public void add(){
        Item item = new Item();
        itemRepository.save(item);

    }


}
