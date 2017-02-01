package hu.crs.designpatterns.creational.factory.creator;

import hu.crs.designpatterns.creational.factory.product.Weapon;

public abstract class WeaponFactory {

    public abstract Weapon create(String weaponId);
}
