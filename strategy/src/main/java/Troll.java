public class Troll {

    private WeaponBehavior weapon;

    public Troll(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("Troll attacks!");
        weapon.useWeapon();
    }
}
