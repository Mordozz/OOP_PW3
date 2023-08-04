interface CatAction {
    void performAction(Cat cat);
}

interface Animal {
    String makeSound();
}


interface AboutOwner {
    String getOwnerName();
    void setOwnerName(String ownerName);
}

interface Pet {
    String getName();
    void setName(String name);
}

interface OwnerActions {
    void setOwner(Owner owner);
    Owner getOwner();
}

interface Greeting {
    void greet();
}