package community;

import javax.persistence.*;

@Entity
@Table(name="phonenumber")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "phone_id")
    private int id;

    @Column(name="phone_number")
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "namekey", referencedColumnName = "name_id")
    private Name name;

    public PhoneNumber() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhoneNumber: " + phoneNumber;
    }
}

