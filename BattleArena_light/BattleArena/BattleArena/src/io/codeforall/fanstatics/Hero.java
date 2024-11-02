package io.codeforall.fanstatics;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Hero {

    //Attributes
    private String name;
    private int health;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private int mana;
    private int victories;
    private int draws;
    private int defeats;

    //Constructor
    public Hero(String name, int health, String nationality, int age, float height, float weight, int mana, int victories, int draws, int defeats) {
        this.name = name;
        this.health = health;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.mana = mana;
        this.victories = victories;
        this.draws = draws;
        this.defeats = defeats;
    }


    //Getters && Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    /*
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }*/

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }


    //Custom Methods
    public void playerPresentation() {
        System.out.println("---------- FIGHTER PRESENTATION ----------");
        System.out.println("It´s time to fight!!! We present the fighter " + this.getName() + "!!!");
        System.out.println("Directly from " + this.getNationality());
        System.out.println("with " + this.getAge() + " years and " + this.getHeight() + " meters of height,");
        System.out.println("is weight is " + this.getWeight() + " kg.");
        System.out.println(this.getVictories() + " VICTORIES");
        System.out.println(this.getDefeats() + " DEFEATS");
        System.out.println(this.getDraws() + " DRAWS");

    }

    public void playerStatus () {
        System.out.println( "---------- FIGHTER STATUS ----------");
        System.out.println(this.getName() + " is from" + getNationality() + " ,with " + this.getAge() + " years old.");
        System.out.println("is height is " + this.getHeight() + "and is weight is " + this.getWeight() +".");
        System.out.println("Victories: " + this.getVictories());
        System.out.println("Defeats: " + this.getDefeats());
        System.out.println("Draws: " + this.getDraws());

    }
    public void winFight() {
        this.victories++;
    }

    public void loseFight () {
        this.defeats++;

    }
    public void draw () {
        this.draws++;

    }

    public void attack() {

    }

    public void defence() {

    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", mana=" + mana +
                ", victories=" + victories +
                ", draws=" + draws +
                ", defeats=" + defeats +
                '}';
    }
}
