package org.spengy.cookbook.web;

import org.spengy.cookbook.domain.Response;
import org.spengy.cookbook.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clazz")
public class ClazzController {

    private final ClazzService clazzService;

    public ClazzController(ClazzService clazzService) {
        this.clazzService = clazzService;
    }

    @GetMapping("/{id}")
    public Response getById(@PathVariable Integer id){
        assert id != null;
        return new Response(200, "", clazzService.selectById(id));
    }

    @GetMapping
    public Response list(){
        return new Response(200, "", clazzService.selectList(null));
    }
}
