public class Queen extends Character {

    public Queen(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("Queen attacks!");
        weapon.useWeapon();
    }
}
