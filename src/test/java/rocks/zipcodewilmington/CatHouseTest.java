package rocks.zipcodewilmington;

import org.junit.Assert;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.AnimalWarehouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
        @org.junit.Test
        public  void add(){
            Cat cat1 = new Cat("Whiskers", null, 1);
            CatHouse catHouse = new CatHouse();
            CatHouse.add(cat1);


            Assert.assertEquals(1, (int) CatHouse.getNumberOfCats());
        }

        @org.junit.Test
        public  void remove(){
            Cat cat1 = new Cat("Whiskers", null, 1);
            CatHouse catHouse = new CatHouse();
            CatHouse.add(cat1);
            CatHouse.remove(1);


            Assert.assertEquals(0, (int) CatHouse.getNumberOfCats());
        }

        @org.junit.Test
        public void removeByCat(){
            Cat cat1 = new Cat("Whiskers", null, 1);
            CatHouse catHouse = new CatHouse();
            CatHouse.add(cat1);
            CatHouse.remove(cat1);


            Assert.assertEquals(0, (int) CatHouse.getNumberOfCats());
        }

        @org.junit.Test
        public  void getCatByInteger(){
            Cat cat1 = new Cat("Whiskers", null, 1);
            Cat cat2 = new Cat("stef", null, 5);
            CatHouse catHouse = new CatHouse();
            CatHouse.add(cat1);
            CatHouse.add(cat2);


            Assert.assertEquals(cat2, CatHouse.getCatById(5));
        }

 }
