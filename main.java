import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


final class Animal{
    final private String nom;
    final private char ab;
    public Animal(String nom, char ab){
        this.nom = nom;
        this.ab = ab;
    }

    public String getNom(){
        return this.nom;
    }

    public char getAb(){
        return this.ab;
    }
}

class Main{ 
    public static void main(String[] args) throws CloneNotSupportedException{
        List<Animal> lstAnimal = new ArrayList<>();
        lstAnimal.add(new Animal("ours",'o'));
        lstAnimal.add(new Animal("zebre",'z'));
        lstAnimal.add(new Animal("chien",'c'));
        lstAnimal.add(new Animal("chat",'b'));
        lstAnimal.add(new Animal("tigre", 't'));
        lstAnimal.forEach(c-> System.out.println(c.getAb()));

        lstAnimal.sort(Comparator.comparing(Animal::getAb));

        lstAnimal.forEach(c-> System.out.println(c.getAb()));
        System.out.println("Test");
   }

    public static void main(){
        System.out.println("Mon évolution 1");
        System.out.println("Mon évolution 0");
        System.out.println("Mon évolution 3");
        System.out.println("OUI");
        System.out.println("NON");
        System.out.println("NON,");
        System.out.println("Mon évolution 4");
    }
    
}
