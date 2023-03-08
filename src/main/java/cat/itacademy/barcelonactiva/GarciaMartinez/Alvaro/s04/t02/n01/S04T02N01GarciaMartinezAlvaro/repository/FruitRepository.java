package cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.repository;

import cat.itacademy.barcelonactiva.GarciaMartinez.Alvaro.s04.t02.n01.S04T02N01GarciaMartinezAlvaro.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}
