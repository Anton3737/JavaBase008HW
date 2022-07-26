public class Animal {

    private String name;
    private int years;
    private boolean teal;

    public Animal(String name, int years, boolean teal) {
        this.name = name;
        this.years = years;
        this.teal = teal;
    }

    @Override
    public String toString() {
        return String.valueOf("Пухнастого звати " + name + " йому вже " + years + " а хвіст " + teal);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Василий", 7,true);
        System.out.println(animal);
    }

}

