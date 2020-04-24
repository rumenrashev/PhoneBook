package phonebook.entity;

public class Contact {
    private String name;
    private String number;
    private String lastName;

    public Contact(String name, String number, String lastName) {
        this.name = name;
        this.number = number;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
