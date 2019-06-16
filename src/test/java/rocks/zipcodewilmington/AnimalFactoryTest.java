package rocks.zipcodewilmington;

import org.junit.Assert;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @org.junit.Test
    public void createDogTest(){

        Dog newDog = new Dog("Fido", null, 5);

        Assert.assertEquals("Fido", newDog.getName());
    }

    @org.junit.Test
    public void createCatTest(){

        Cat newCat = new Cat("Whiskers", null, 5);

        Assert.assertEquals("Whiskers", newCat.getName());
    }
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
