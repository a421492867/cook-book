package org.spengy.cookbook.web;

import org.spengy.cookbook.domain.Response;
import org.spengy.cookbook.service.FoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/{id}")
    public Response getById(@PathVariable Integer id){
        assert id != null;
        return new Response(200, "", foodService.selectById(id));
    }

    @GetMapping("list/{clazzId}")
    public Response getByClazzId(@PathVariable String clazzId){
        assert clazzId != null;
        return new Response(200, "", foodService.selectByClazzId(clazzId));
    }


}
