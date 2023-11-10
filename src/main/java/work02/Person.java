package work02;
import work01.Utilitor;
public class Person {

    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        
        this.firstname = Utilitor.testString(firstname);
        this.lastname = Utilitor.testString(lastname);
        this.id = Person.nextId++;
        
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person( ");
        sb.append(id).append(", ");
        sb.append(firstname).append(", ");
        sb.append(lastname);
        sb.append(" )");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname =  Utilitor.testString(firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = Utilitor.testString(lastname);
    }

    @Override public boolean equals(Object obj) { return this == obj; }
    @Override public int hashCode() { return id; }

    
}
