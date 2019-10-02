/*
*
* by Mirko Schulze
 */
package eu.ggnet.gesundheitsschutz;

import java.io.Serializable;

/**
 * Class for entity Contact, overrides {@link java.lang.Object#hashCode()} and
 * {@link java.lang.Object#equals(java.lang.Object)}.
 * <p>
 * Contains Strings for id, description, name, address, phone and hours.
 *
 * @author Administrator
 */
public class Contact implements Serializable {

    private String id;
    private String description;
    private String name;
    private String address;
    private String phone;
    private String hours;

    public Contact(String description, String name, String address, String phone, String hours) {
        this.description = description;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.hours = hours;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getHours() {
        return hours;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
