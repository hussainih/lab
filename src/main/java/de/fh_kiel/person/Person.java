
package de.fh_kiel.person;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
/**
 * Created by moham on 10/8/2016.
 */
public class Person implements EmployAble {

    private String firstName, lastName;
    private int age;
    private char gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return new ToStringBuilder(this).
                append("name", firstName + " " + lastName).
                append("age", age).
                append("gender", gender).
                toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(firstName, person.firstName)
                .append(lastName, person.lastName)
                .append(age, person.age)
                .append(gender, person.gender)
                .isEquals();
    }

    public int hashCode() {

        return new HashCodeBuilder(17, 37).
                append(firstName).
                append(lastName).
                append(age).
                append(gender).
                toHashCode();
    }


}
