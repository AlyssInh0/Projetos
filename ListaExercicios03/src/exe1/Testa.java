package exe1;

public class Testa {
    public static void main(String[] args) {
        // TODO code application logic here
        Person objPerson = new Person("Fulano de tal", "fulano");
        Message objMessage1 = new Message("Olá", objPerson);
        Message objMessage2 = new Message("boa noite", objPerson);
        
        Forum objForum = new Forum("de esportes",
                "http://forumdeesportes.com");
        objForum.addMessage(objMessage1);
        objForum.addMessage(objMessage2);
        System.out.println(objForum.toString());
        objForum.removeMessage(objMessage1);
        System.out.println(objForum.toString());
    }
    
}
