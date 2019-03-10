package community;

import javax.persistence.*;

@Entity
@Table(name="name")
public class Name {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="name_id")
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="middle_name")
    private String middleName;

    @Column(name="last_name")
    private String lastName;

	@OneToOne(mappedBy = "name")
	private Address address;

	@OneToOne(mappedBy = "name")
	private PhoneNumber phoneNumber;


	public Name() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nMember: " +
				firstName + ' ' +
				middleName + ' ' +
				lastName + ' ' +
				address + phoneNumber +
				" ";
	}
}

