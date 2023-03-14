package cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.services;

import cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.domain.Fruit;
import java.util.List;

public interface FruitServiceInterface {
    List<Fruit> findAll();
    Fruit findById(int id);
    Fruit save(Fruit fruit);
    void deleteById(int id);
}
