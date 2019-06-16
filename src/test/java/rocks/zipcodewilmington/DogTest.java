package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Date birthDate;

    @Test
    public void createDog() {
        Dog dog1 = new Dog("Jax", null, 3);

        Assert.assertEquals(3, (int)dog1.getId());
    }

    @Test
    public void speak() {
        Dog dog1 = new Dog("Jax", null, 3);

        Assert.assertEquals("bark!", dog1.speak());
    }
//    @Test
//    public void setBirthDate() {
//
//        this.birthDate = 1994-10-06;
//
//        Assert.assertEquals( "null", birthDate.toString());
//    }

    @Test
    public void eat() {
        Dog dog1 = new Dog("Jax", null, 3);
        Food food = new Food();
        dog1.eat(food);

        Assert.assertEquals(1, (int)dog1.getNumberOfMealsEaten());
    }

    @Test
    public void getId() {
        Dog dog1 = new Dog("Jax", null, 3);

        Assert.assertEquals(3, (int)dog1.getId());
    }

    @Test
    public void newInstanceOfMammal() {
        Dog dog1 = new Dog("Jax", null, 3);

        Assert.assertTrue(dog1 instanceof Mammal);
    }

    @Test
    public void newInstanceOfAnimal() {
        Dog dog1 = new Dog("Jax", null, 3);

        Assert.assertTrue(dog1 instanceof Animal);
    }





    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
