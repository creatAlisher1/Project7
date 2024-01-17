
interface HavingSuperAbility {
    void applySuperAbility(String superAbilityType);
}


abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbilityType;

    public Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(this.getClass().getSimpleName() + " применил суперспособность " + superAbilityType);
    }
}


class Magic extends Hero {
    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }
}


class Medic extends Hero {
    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }
}


class Warrior extends Hero {
    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем массив из 3х разных героев
        Hero[] heroes = {
                new Magic(100, 20, "INVISIBILITY"),
                new Medic(120, 15, "HEALING"),
                new Warrior(150, 25, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility(hero.superAbilityType);
        }
    }
}