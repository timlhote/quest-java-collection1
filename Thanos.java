import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
    	ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

    	Hero blackWidow = new Hero("Black Widow",34);
    	Hero captainAmerica = new Hero("Captain America", 100);
    	Hero vision = new Hero("Vision",3);
    	Hero ironMan = new Hero("Iron Man",48);
    	Hero scarletWitch = new Hero("Scarlet Witch", 29);
    	Hero thor = new Hero("Thor",1500);
    	Hero spiderMan = new Hero("Spider-man",18);
    	Hero hulk = new Hero("Hulk", 49);
    	Hero doctorStrange = new Hero("Doctor Strange",42);
    	
    	heroes.add(blackWidow);
    	heroes.add(captainAmerica);
    	heroes.add(vision);
    	heroes.add(ironMan);
    	heroes.add(scarletWitch);
    	heroes.add(thor);
    	heroes.add(spiderMan);
    	heroes.add(hulk);
    	heroes.add(doctorStrange);
    	
        // TODO 3 : It's Thor birthday, now he's 1501
    	thor.setAge(1501);
    	heroes.set(5, thor);
    	
        // TODO 4 : Shuffle the heroes list
    	Collections.shuffle(heroes);
    	
        // TODO 5 : Keep only the half of the list
    	heroes.remove(blackWidow);
    	heroes.remove(captainAmerica);
    	heroes.remove(vision);
    	heroes.remove(thor);
    	heroes.remove(doctorStrange);
    	
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
    	for(int i=0;i<heroes.size();i++) {
    		Hero hero = heroes.get(i);
    		System.out.println(hero);
    	}
    }
}