package com.kodilla.hibernate.manytomany;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQueries({
        @NamedQuery(
                name = "Employee.retrieveByLastname",
                query = "FROM Employee WHERE lastname = :LASTNAME"
        ),
        })
        @NamedNativeQuery(
        name = "Employee.findAnEmployeeByPartOfTheName",
        query = "SELECT * FROM EMPLOYEES " + "WHERE FIRSTNAME LIKE :PARTNAME OR LASTNAME LIKE :PARTNAME",
        resultClass = Employee.class
)



@Entity
@Table(name = "EMPLOYEES")
public class Employee {

    private long id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public Employee() {
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public long getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_COMPANY_EMPLOYEE",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")}

    )
    public List<Company> getCompanies() {
        return companies;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
