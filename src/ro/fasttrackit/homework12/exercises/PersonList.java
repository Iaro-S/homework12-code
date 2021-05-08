package ro.fasttrackit.homework12.exercises;

import java.util.*;

public class PersonList {
    private final List<Person> persons = new ArrayList<>();

    public PersonList(Collection<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public List<String> listNames() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, Integer> nameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public List<Person> olderThan(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public Map<String, List<String>> hairColourToName() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> nameList = result.get(person.getHairColour());
            if (nameList == null) {
                nameList = new ArrayList();
            }
            nameList.add(person.getName());
            result.put(person.getHairColour(), nameList);
        }
        return result;
    }

    public Map<Integer, List<String>> ageToName() {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> nameList = result.get(person.getAge());
            if (nameList == null) {
                nameList = new ArrayList();
            }
            nameList.add(person.getName());
            result.put(person.getAge(), nameList);
        }
        return result;
    }
}




