public class King extends Character {
    public King(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("King attacks!");
        weapon.useWeapon();
    }
}
