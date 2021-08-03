class Animal{
    String species;
    Integer age;
    boolean isDead;

    public Animal(String species, Integer age, boolean isDead){
        this.species = species;
        this.age = age;
        this.isDead = isDead;
    }
    public Animal(){
        this.species = "Cat";
        this.age = 1;
        this.isDead = false;
    }

    public void printInfo(){
        String output = constructPrintOutput();
        System.out.println(output);
    }

    public static void printAllSpecies(){
        System.out.println("Parakeet, Cat, Dog, whatever...");
    }

    private String constructPrintOutput(){
        String output = "";
        output = "Species: " + this.species;
        output = output + "\nAge: " + this.age;
        output = output + "\nIs Dead?: " + this.isDead;
        return output;
    }
}

//class HousePet extends Animal{
//    String name;
//    public HousePet(String species, Integer age, boolean isDead, String name){
//        super(species, age, isDead);
//        this.name = name;
//        super.printInfo();
//    }
//}

class Runner{
    public static void main(String args[]){
        Animal.printAllSpecies();

        Animal parakeet = new Animal("Parakeet", 2, true);
        Animal dog = new Animal("Dog", 10, false);
        Animal cat = new Animal();
        parakeet.printInfo();
//        parakeet.printAllSpecies();
        dog.printInfo();
        cat.printInfo();
    }
}