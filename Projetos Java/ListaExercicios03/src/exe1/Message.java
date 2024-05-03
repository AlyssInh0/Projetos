package exe1;
public class Message {
    private String text;
    private Person person;

    public Message() {
    }

    public Message(String text, Person person) {
        this.setText(text);
        this.setPerson(person);
    }

    public String getText() {
        return text;
    }

    public final void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public final void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return " \nMessage={text=" + text + 
                ", person=" + person + '}';
    }
    
}
