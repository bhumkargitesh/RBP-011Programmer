import java.util.ArrayList;

public class AddressBook {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        // Adding contacts to the address book
        addressBook.addContact(new Person("gitesh", "pune", "xyzabd"));
        addressBook.addContact(new Person("ganesh", "latur","abcd"));
        System.out.println(addressBook);
    }

         private ArrayList<Person> Person;

        public AddressBook() {
            Person = new ArrayList<>();
        }

        public void addContact (Person person){
            Person.add(person);
        }

        public void deleteContact (Person person){
            Person.remove(person);
        }

        public void updateContact (Person oldPerson, Person newPerson){
            int index = Person.indexOf(oldPerson);
            if (index != -1) {
                Person.set(index, newPerson);
            }
        }

        public Person searchContact (String name){
            for (Person person : Person) {
                if (person.toString().equals(name)) {
                    return person;
                }
            }
            return null;
        }
    }
      class Person {

    private String name;
    private String address;
    private String email;

    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }
    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + email + '\'' +
                '}';
    }
}


