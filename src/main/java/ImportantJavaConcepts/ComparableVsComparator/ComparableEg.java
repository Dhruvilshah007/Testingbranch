package ImportantJavaConcepts.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.scaler.com/topics/java/comparable-and-comparator-in-java/

// 1. Implement Comparable interface
class SuperHero implements Comparable<SuperHero> {
    private final String id;
    private final String name;
    private final int age;

    public SuperHero(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //compareTo is used for string comparison only
    // 2. override compareTo method.
/*    @Override
    public int compareTo(final SuperHero superHero) {
        return this.name.compareTo(superHero.name);
    }*/

    @Override
    public int compareTo(final SuperHero superHero) {

        if(this.name.compareTo(superHero.name)==0){
            //if name are same comapre their age
            return this.id.compareTo(superHero.id);

        }else{
            // return as per name standards
            return this.name.compareTo(superHero.name);
        }

    }

    public String getId() { return this.id; }

    public String getName() { return this.name; }

    public int getAge() { return this.age; }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Age: %d", id, name, age);
    }

}

public class ComparableEg {
    public static void main(String[] args) {
        List<SuperHero> superHeroes = new ArrayList<>();

        superHeroes.add(new SuperHero("2", "Iron Man", 35));
        superHeroes.add(new SuperHero("1", "Captain America", 25));
        superHeroes.add(new SuperHero("3", "Hulk", 20));

        Collections.sort(superHeroes);
        /* printing result */
        superHeroes.forEach(superHero ->
                System.out.println(superHero.toString()));
    }
}
