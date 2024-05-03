package exe1;
public class Person {
    private String name, user;
    public Person(){
        
    }

    public Person(String name, String user) {
        this.setName(name);
        this.setUser(user);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public final void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", user=" + user + '}';
    }
    
}
