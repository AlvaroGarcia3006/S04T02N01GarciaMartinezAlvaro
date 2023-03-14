package cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.controllers;

import java.util.List;

import cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.domain.Fruit;
import cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.services.FruitServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController

public class FruitController {
    @Autowired
    private FruitServiceInterface fruitService;
    @GetMapping("/getAll")
    public List<Fruit> getAll(){
        return  fruitService.findAll();
    }
    @GetMapping("/getById/{id}")
    public  ResponseEntity<Fruit> getById(@PathVariable int id){
        Fruit fruit = fruitService.findById(id);
        if(fruit == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(fruit, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Fruit> add(@RequestBody Fruit fruit) {
        if (fruit.getId() != 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Fruit addFruit = fruitService.save(fruit);
        return new ResponseEntity<>(addFruit, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Fruit> update(@RequestBody Fruit fruit) {
        if (fruit.getId() == 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Fruit updateFruit = fruitService.save(fruit);
        return new ResponseEntity<>(updateFruit, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable int id) {
        Fruit fruit = fruitService.findById(id);
        if (fruit == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        fruitService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
