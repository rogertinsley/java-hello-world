package com.hello.world.helloworld.services;

import org.springframework.stereotype.Service;

import com.hello.world.helloworld.model.Item;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    private final List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(String name) {
        items.add(new Item(name));
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }
}