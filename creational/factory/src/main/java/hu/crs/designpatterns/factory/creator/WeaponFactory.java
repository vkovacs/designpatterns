package hu.crs.designpatterns.factory.creator;

import hu.crs.designpatterns.factory.product.Weapon;

public abstract class WeaponFactory {

    public abstract Weapon create(String weaponId);
}
