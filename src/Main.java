import ru.gb.FamilyTree.FamilyTree.FamilyTree;
import ru.gb.FamilyTree.Humans.Gender;
import ru.gb.FamilyTree.Humans.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Human irina = new Human("Alekseeva Irina", Gender.Female, LocalDate.of(1972, 9, 26));
        Human sasha = new Human("Alekseev Aleksandr", Gender.Female, LocalDate.of(1969, 12, 24));

        familyTree.addHuman(irina);
        familyTree.addHuman(sasha);
        irina.setSpouse(sasha);

        Human tanya = new Human("Alekseeva Tatiana", Gender.Female, LocalDate.of(1994, 8, 23));
        Human nadya = new Human("Alekseeva Nadezda", Gender.Female, LocalDate.of(1991, 11, 9));
        familyTree.addHuman(tanya);
        familyTree.addHuman(nadya);

        irina.addChild(tanya);
        irina.addChild(nadya);
        sasha.addChild(tanya);
        sasha.addChild(nadya);

        System.out.println(irina.getSpouse());
        System.out.println(tanya.getName());
        System.out.println(sasha.getChildren());
        System.out.println(nadya.getInfo());
        System.out.println(familyTree.getInfo());

    }
}
