package progra3;

public class registroPokeDatos {
    public String species;
    public String name;
    public String mother;
    public String father;
    public String children;
    public String posibleEvol;
    public String preEv;
    public int attack;
    public int speed;
    public int specialAttack;
    public int defense;
    public int specialDefense;       

    public registroPokeDatos(String species, String name, String mother, String father, String children, String posibleEvol, String preEv, int attack, int speed, int specialAttack, int defense, int specialDefense) {
        this.species = species;
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.posibleEvol = posibleEvol;
        this.preEv = preEv;
        this.attack = attack;
        this.speed = speed;
        this.specialAttack = specialAttack;
        this.defense = defense;
        this.specialDefense = specialDefense;
    }
    


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getPosibleEvol() {
        return posibleEvol;
    }

    public void setPosibleEvol(String posibleEvol) {
        this.posibleEvol = posibleEvol;
    }

    public String getPreEv() {
        return preEv;
    }

    public void setPreEv(String preEv) {
        this.preEv = preEv;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }
}