package org.formation.controller;

import lombok.RequiredArgsConstructor;
import org.formation.dto.CoffeeDto;
import org.formation.entity.Coffee;
import org.formation.service.CoffeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CoffeeController {

    private final CoffeeService service;


    @GetMapping("/coffees")
    List<CoffeeDto> coffees(){
        return service.allCoffees();
    }

    @GetMapping("/coffees/{id}")
    ResponseEntity<CoffeeDto> coffee(@PathVariable Long id){
        return service.oneCoffee(id);
    }

}
