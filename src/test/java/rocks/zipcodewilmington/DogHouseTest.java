package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

        @org.junit.Test
        public  void add(){
            Dog dog1 = new Dog("Fido", null, 1);
            DogHouse dogHouse = new DogHouse();
            DogHouse.add(dog1);


            Assert.assertEquals(1, (int) DogHouse.getNumberOfDogs());
        }

        @org.junit.Test
        public  void remove(){
            Dog dog1 = new Dog("Fido", null, 1);
            DogHouse dogHouse = new DogHouse();
            DogHouse.add(dog1);
            DogHouse.remove(1);


            Assert.assertEquals(0, (int) DogHouse.getNumberOfDogs());
        }

        @org.junit.Test
        public void removeByDog(){
            Dog dog1 = new Dog("Fido", null, 1);
            DogHouse dogHouse = new DogHouse();
            DogHouse.add(dog1);
            DogHouse.remove(dog1);


            Assert.assertEquals(0, (int)DogHouse.getNumberOfDogs());
        }

        @org.junit.Test
        public  void getDogByInteger(){
            Dog dog1 = new Dog("Fido", null, 1);
            Dog dog2 = new Dog("stef", null, 5);
            DogHouse DogHouse = new DogHouse();
            rocks.zipcodewilmington.animals.animal_storage.DogHouse.add(dog1);
            rocks.zipcodewilmington.animals.animal_storage.DogHouse.add(dog2);


            Assert.assertEquals(dog2, rocks.zipcodewilmington.animals.animal_storage.DogHouse.getDogById(5));
        }


        @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}

