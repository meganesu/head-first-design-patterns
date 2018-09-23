public class Knight extends Character {

    public Knight(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("Knight attacks!");
        weapon.useWeapon();
    }
}
