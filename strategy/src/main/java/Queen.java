public class Queen {
    private final WeaponBehavior weapon;

    public Queen(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("Queen attacks!");
        weapon.useWeapon();
    }
}
