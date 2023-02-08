package co.develhope.firstapi5.DTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;



public class CarDTO {
    @NotBlank (message="Mandatory!")
    private Integer id;
    @NotBlank (message="Mandatory!")
    private String modelName;
    private double price;
    public CarDTO (Integer id, String modelName){
        this.id = id;
        this.modelName = modelName;
    }
    public CarDTO (Integer id, String modelName, double price){
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
