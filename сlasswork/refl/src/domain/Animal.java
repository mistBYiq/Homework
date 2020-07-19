package domain;

import java.io.Serializable;

public abstract class Animal extends Essence implements AnimalTraining, Serializable {
    protected int paws;

    protected Long animalId;
@AcademyAnnotation
    protected int eyes;

    public Animal() {
        System.out.println("Default parent constructor");
    }

    //Overloading - перегрузка
    public Animal(int paws, Long animalId, int eyes) {
        this.paws = paws;
        this.animalId = animalId;
        this.eyes = eyes;

        System.out.println("Params parent constructor");
    }
@AcademyAnnotation
    public Long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Long animalId) {
        this.animalId = animalId;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
@AcademyAnnotation
protected int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public void run() {
        System.out.println("Run in animal");
    }

    public void jump() {
        System.out.println("Jump in animal");
    }

    public double print(String s) {
        return 5d;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "paws=" + paws +
                ", animalId=" + animalId +
                ", eyes=" + eyes +
                '}';
    }
}
