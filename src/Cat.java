class Cat implements Animal, Pet, AboutOwner, Greeting, OwnerActions, Comparable<Cat> {
    private String name;
    private int age;
    private String ownerName;
    private Owner owner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String makeSound() {
        return "Мяу!";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public Owner getOwner() {
        return owner;
    }

    @Override
    public void greet() {
        if (ownerName != null) {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + ownerName + ".");
        } else {
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Cat otherCat) {
        return Integer.compare(this.age, otherCat.age);
    }
}