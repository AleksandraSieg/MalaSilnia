package pl.madison.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @RequestMapping(value = "/silnia/{liczba1}")
    public String liczymySilnie(@PathVariable("liczba1") int liczba1){
        int mnozenie = getSilnia(liczba1);
        return "Wynik silni: "+mnozenie;
    }

    public int getSilnia(int liczba1) {
        int mnozenie = 1;
        for(int i = 1; i<=liczba1; i++){
            mnozenie = mnozenie*i;
        }
        return mnozenie;
    }
}
