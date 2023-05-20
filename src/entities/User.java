package entities;

public class User {
    
    private long id;
    private String userName;
    
    private Adress adress;

    public User() {
    }

    public User(long id, String userName, Adress adress) {
        this.id = id;
        this.userName = userName;
        this.adress = adress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
