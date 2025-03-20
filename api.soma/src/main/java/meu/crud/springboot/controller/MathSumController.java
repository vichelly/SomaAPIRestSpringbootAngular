package meu.crud.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@Controller
@ResponseBody
@RequestMapping("/math")
public class MathSumController {
    @GetMapping("/sum/{num1}/{num2}")
    public Double getSum(@PathVariable Double num1,@PathVariable Double num2) {
        return num1 + num2;
    }
    
}
