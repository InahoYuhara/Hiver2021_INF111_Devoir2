package modele.communication;

public class Message {

    String numeroDestination;
    String message;

    public Message(String numeroDestination, String message){
        this.numeroDestination = numeroDestination;
        this.message = message;
    }

    public String getNumeroDestination(){
        return this.numeroDestination;
    }

    public String getMessage(){
        return this.message;
    }

}
