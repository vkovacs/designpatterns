package hu.crs.designpatterns.factory.concretecreator;

import hu.crs.designpatterns.factory.creator.WeaponFactory;
import hu.crs.designpatterns.factory.concreteproduct.Sword;
import hu.crs.designpatterns.factory.product.Weapon;

public class MeleeWeaponFactory extends WeaponFactory {
    @Override
    public Weapon create(String weaponId) {
        if ("Sword".equals(weaponId)) {
            return new Sword();
        }
        return null;
    }
}
