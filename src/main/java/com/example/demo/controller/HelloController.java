package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  //  @Value("${app.varexample}")
 //   String message;

    @GetMapping("/hola")
    public String holaMundo(){

 //       System.out.println(message);
        return "Hola como estas";
    }


    @GetMapping("/")
    public String bootstap(){

        return """
               
                <!doctype html>
                <html lang="es">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Demo App de Giuliano</title>
                  </head>
                  <body>
                    <h1>Hola desde Bootstrap</h1>
                    <form>
                        <a href="https://www.facebook.com/">
                            <input type="button" value="click here">
                        </a>
                    </form>
                  </body>
                </html>
                
                
                
                """;
    }


}
