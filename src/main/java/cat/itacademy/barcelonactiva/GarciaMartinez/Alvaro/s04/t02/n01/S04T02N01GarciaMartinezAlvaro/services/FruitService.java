package cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.services;

import cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.domain.Fruit;
import cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {
        @Autowired
        private FruitRepository fruitRepository;
        public List<Fruit> findAll() {
            return fruitRepository.findAll();
        }
        public Fruit findById(int id) {
            return fruitRepository.findById(id).orElse(null);
        }
        public Fruit save(Fruit fruit) {
            return fruitRepository.save(fruit);
        }
        public void deleteById(int id) {
            fruitRepository.deleteById(id);
        }
}
