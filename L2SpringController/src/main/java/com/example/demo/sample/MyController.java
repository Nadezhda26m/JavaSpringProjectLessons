package com.example.demo.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// @Controller
// public class MyController { // код контроллера здесь }

// @Controller
// @RequestMapping("/api")
public class MyController {

    // Аннотация @RequestMapping
    @RequestMapping(value = "/items", method = RequestMethod.GET)
    // localhost:port/api/items
    public ResponseEntity<List<Item>> getItems() {
        // код обработчика здесь
        return null;
    }

    // Принимаем параметры запроса
    @RequestMapping(value = "/items/{id}", method = RequestMethod.GET)
    public ResponseEntity<Item> getItem(@PathVariable("id") Long id) {
        // код обработчика здесь
        return null;
    }

    // Возвращаем ответ
    @RequestMapping(value = "/items/{id}", method = RequestMethod.GET)
    public ResponseEntity<Item> getItem2(@PathVariable("id") Long id) {
        Item item = getItemFromDatabase(id); // просто пример
        if (item == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(item, HttpStatus.OK);
        }
    }

    // Работаем с параметрами запроса
    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ResponseEntity<List<Item>> getItems(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int size) {
        List<Item> items = getItemsFromDatabase(page, size); // просто пример
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    // Обрабатываем исключения
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleItemNotFoundException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    // Обрабатываем JSON
    @RequestMapping(value = "/items", method = RequestMethod.POST)
    public ResponseEntity<Item> createItem(@RequestBody Item newItem) {
        Item createdItem = saveItemToDatabase(newItem); // просто пример
        return new ResponseEntity<>(createdItem, HttpStatus.CREATED);
    }

    //region Заглушки
    private Item getItemFromDatabase(Long id) {
        return null;
    }

    private List<Item> getItemsFromDatabase(int page, int size) {
        return null;
    }

    private Item saveItemToDatabase(Item newItem) {
        return null;
    }

    //endregion
}
