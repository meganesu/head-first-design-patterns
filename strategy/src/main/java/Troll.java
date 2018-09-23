public class Troll extends Character {

    public Troll(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("Troll attacks!");
        weapon.useWeapon();
    }
}
