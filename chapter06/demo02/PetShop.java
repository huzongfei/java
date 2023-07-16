package demo02;

public class PetShop {
    public Pet sale(String type){
        switch(type){
            case "Dog":
                return new Dog();

            case "Cat":
                return new Cat();

        }
        return null;
    }
}
