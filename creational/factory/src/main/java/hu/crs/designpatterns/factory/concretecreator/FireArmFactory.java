package hu.crs.designpatterns.factory.concretecreator;

import hu.crs.designpatterns.factory.creator.WeaponFactory;
import hu.crs.designpatterns.factory.concreteproduct.Pistol;
import hu.crs.designpatterns.factory.product.Weapon;

public class FireArmFactory extends WeaponFactory {
    @Override
    public Weapon create(String weaponId) {
        if ("Pistol".equals(weaponId)) {
            return new Pistol();
        }
        return null;
    }
}
