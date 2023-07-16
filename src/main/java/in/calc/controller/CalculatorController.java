package in.calc.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @GetMapping(path="/add/{a}/{b}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public double add(@PathVariable double a, @PathVariable double b) {
        return a + b;
    }

    @GetMapping(path="/subtract/{a}/{b}",produces = MediaType.APPLICATION_JSON_VALUE)
    public double subtract(@PathVariable double a, @PathVariable double b) {
        return a - b;
    }

    @GetMapping(path="/multiply/{a}/{b}",produces = MediaType.APPLICATION_JSON_VALUE)
    public double multiply(@PathVariable double a, @PathVariable double b) {
        return a * b;
    }

    @GetMapping(path="/divide/{a}/{b}",produces = MediaType.APPLICATION_JSON_VALUE)
    public double divide(@PathVariable double a, @PathVariable double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}

