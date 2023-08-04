import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Барсик", 3));
        cats.add(new Cat("Мурка", 5));
        cats.add(new Cat("Дуська", 1));
        cats.add(new Cat("Маркиз", 2));
        cats.add(new Cat("Кекс", 4));
        cats.add(new Cat("Руфус", 3));
        Owner owner1 = new Owner("Михаил");
        Owner owner2 = new Owner("Виталий");
        Owner owner3 = new Owner("Елена");
        cats.get(0).setOwner(owner1);
        cats.get(1).setOwner(owner2);
        cats.get(2).setOwner(owner1);
        cats.get(3).setOwner(owner3);
        cats.get(4).setOwner(owner2);

/*        CatAction changeNameAction = new CatAction() {
            @Override
            public void performAction(Cat cat) {
                cat.setName("Васька");
            }
        };

        for (Cat cat : cats) {
            cat.performAction(changeNameAction);
        }
*/
        sortByAge(cats);


        for (Cat cat : cats) {
            Owner owner = cat.getOwner();
            String ownerName = (owner != null) ? owner.getName() : "Без владельца";
            System.out.println("Имя: " + cat.getName() + ", Возраст: " + cat.getAge() + ", Хозяин: " + ownerName);
        }
    }

    public static void sortByAge(List<Cat> list) {
        Collections.sort(list, Comparator.comparingInt(Cat::getAge));
    }
}