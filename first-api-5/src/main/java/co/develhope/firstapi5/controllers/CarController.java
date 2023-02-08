package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {


   //params da definire nella chiamata API
   @GetMapping
   public CarDTO getCar (CarDTO car, @RequestParam Integer Id, @RequestParam String ModelName) {
       return car;
   }
   @PostMapping
   public String carBody(@RequestBody CarDTO car){
       return "id " + car.getId() + " model name " + car.getModelName() + " cost " + car.getPrice();

   }





}
