package SpaceBattle;

import java.util.List;

/**
 * Created by Fluffo on 09.02.2017.
 * Это корабли
 */
public class SpaceShip {
    private int structure = 100; //  Количество возможных пробоин. По сути хитпоинты.
    //  размер зависит от количества структуры.
    //  каждые 100 повышают шанс попадание по кораблю.
    // проследить чтобы клрабль не уменьшался во время боя.
    private int type = structure / 100; //проблема решена?
    private int speed; // скорость пока интом.
    private int maneuverability; // маневренность повышает шансы избежать попадания.
    private int weaponsOK; // количество исправных орудий; //надо ли  <-----------------------------| !!!
    private int brigeOK; // бонус от мостика // при разрушении станут 1 ха-ха.
    private int engine = 100; // состояние двигателей в процентах. Их состояние влияет на скорость.
    // При 50 пропадает бонус маневренности.
    // Да. Это игра про жидкий вакуум.
    private List<Weapon> weaponsList; // список орудий на борту.

    //-------------------ГЕТЕРЫ----------------------------
    public int getStructure() {
        return structure;
    }

    public int getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public int getManeuverability() {
        return maneuverability;
    }

    public int getWeaponsOK() {
        return weaponsOK;
    }

    public int getBrigeOK() {
        return brigeOK;
    }

    public int getEngine() {
        return engine;
    }

    public List<Weapon> getWeaponsList() {
        return weaponsList;
    }

    //--------------------СЕТЕРЫ----------------------------
    public void setStructure(int structure) {
        this.structure = structure;
    }

    public void setType(int type) {   // так-то о логике не надо, но пусть будет.
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setManeuverability(int maneuverability) {
        this.maneuverability = maneuverability;
    }

    public void setWeaponsOK(int weaponsOK) {
        this.weaponsOK = weaponsOK;
    }

    public void setBrigeOK(int brigeOK) {
        this.brigeOK = brigeOK;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setWeaponsList(List<Weapon> weaponsList) {
        this.weaponsList = weaponsList;
    }

    //---------------------КОНСТРУКТОР-------------------------
    public SpaceShip(int structure, int speed, int maneuverability, int brigeOK, List<Weapon> weaponsList) { // немножко забыл как лист орудий сюда впихнуть
        this.structure = structure;
        this.type = structure / 100;
        this.speed = speed;
        this.maneuverability = maneuverability;
        this.brigeOK = brigeOK;
        this.engine = 100;
        this.weaponsList = weaponsList;
        this.weaponsOK = weaponsList.size();
    }


}
