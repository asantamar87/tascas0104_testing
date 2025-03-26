package level2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AssertJTests {

    //- Exercici 1
    //
    //Una asserció que demostri que el valor de dos objectes sencers és igual, i una altra que indiqui que no ho és.

    @Test
    public void testIntegersEquality(){

        Integer a = 4;
        Integer b = 10;
        Integer c = 4;

        assertThat(a).isEqualTo(c);
        assertThat(b).isNotEqualTo(c);
    }

    //Exercici 2
    //
    //Una asserció que demostri que la referència a un objecte és la mateixa que una altra,
    // i una altra que indiqui que és diferent.

    @Test
    public void testObjectReferences(){
        String str1 = "Hello";
        String str2= str1;
        String str3 = new String ("Hello");

        assertThat(str1).isSameAs(str2);
        assertThat(str1).isNotSameAs(str3);

    }

    //- Exercici 3
    //
    //Una asserció que indiqui que dos arrays d'enters són idèntics.

    @Test
    public void testArrayEquality(){
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};

        assertThat(arr1).isEqualTo(arr2);
    }

    //- Exercici 4
    //
    //Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també).
    // Escriu una asserció per a verificar l'ordre dels objectes en l'ArrayList segons han estat inserits.
    //
    //    Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
    //    Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada.
    //    Deixa un dels elements sense afegir, i verifica que la llista no conté aquest últim.


    @Test
    public void testArrayListOrderAndContent(){

        class Student {
            String name;

            public Student(String name) {
                this.name = name;
            }
        }

        int id;
        Student student1= new Student("Aldo");
        Student student2= new Student("Martha");
        Student student3= new Student("Toffee");

        List <Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        assertThat(students).containsExactly(student1, student2, student3);
        assertThat(students).containsExactlyInAnyOrder(student3, student1, student2);
        assertThat(students).containsOnlyOnce(student2);

        Student student4= new Student("Manel");

        assertThat(students).doesNotContain(student4);

    }

    //- Exercici 5
    //
    //Crea un map i verifica que conté una de les key que li afegeix.

    @Test
    public void testMapContainsKey(){
        Map <String, Integer> map = new HashMap<>();

        map.put("key1", 100);
        map.put("key2", 200);

        assertThat(map).containsKey("key1");
        assertThat(map).doesNotContainKey("key3");
    }

    //- Exercici 6
    //
    //Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol.
    //Crea una asserció que validi que l'excepció és llançada quan correspon.

    @Test
    public void testArrayIndexOutOfBoundsException(){

        int [] numbers = {1,2,3,4,5};

        assertThatThrownBy(() ->{
            int number = numbers [5];
                }).isInstanceOf(ArrayIndexOutOfBoundsException.class).hasMessageContaining("5");
    }


    //- Exercici 7
    //
    //Crea un objecte Optional buit.
    // Escriu l'asserció correcta per a verificar que efectivament està buit.

    @Test
    public void testOptionalIsEmpty(){
        Optional <String> optional = Optional.empty();

        assertThat(optional).isEmpty();
    }
}
