package ru.alishev.springcourse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//Hier wird es nur eine Mehtode geben, die die notwendige View zurückgeben wird
public class HelloController {
   // Hier wird der url angegeben, der(URL) in diese Methode des Kontrollers kommen wird
    //Wenn der User /hello-world angibt, seine Anfrage wird indiese Methode des Kontrollers kommen.
    // В этом методе мы можем польователя перенаправлять куда либо, можем в этом методе обращаться к модели
    // доставать данные из базы данных, показывать жти данные пользователю
    // сейчас мы сделаем простое. мы вернем пользователю представление
    // наше представление назыавется hello-world.html
   @GetMapping("/hello-world")
    public String Hello(){
        return "Hello_world";
    }

}
