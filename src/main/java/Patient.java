import java.io.Serializable;

public class Patient implements Serializable {
    private String name;
    private String id;
    private String phoneNumber;

    public Patient(String name, String id, String phoneNumber){
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }
}
