/*
*
* by Mirko Schulze
 */
package eu.ggnet.gesundheitsschutz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Viewscoped managedbean respnsible for a the view of instances of
 * {@link eu.ggnet.gesundheitsschutz.Contact}.
 * <p>
 * A postconstruct method prepares a list with 3 contacts.
 *
 * @author Administrator
 */
@ManagedBean
@ViewScoped
public class ContactController implements Serializable {

    private List<Contact> contacts;
    private Contact selectedContact;

    @PostConstruct
    public void init() {
        contacts = new ArrayList<>();

        contacts.add(new Contact("Ärztehaus", "Chirurgie und Orthopädie am Wilhelmsburger Inselpark",
                "Neuenfelder Straße 31", "040 759596", "Sprechstunden: Mo, Di & Do: 8 - 12 & 14 - 18 Uhr; Mi & Fr: 8 - 12 Uhr"));
        contacts.add(new Contact("Durchgangsarzt", "Dr. med Wolfgang Dehoust",
                "Grotestraße 31", "040 759596", "Sprechstunden: Mo - Fr: 8 - 11:30 Uhr; Mo, Di & Do: 14:30 - 17:30 Uhr"));
        contacts.add(new Contact("Fachkraft für Arbeitssicherheit", "Burkhard Schmeckelbart",
                "Hilfsstraße 17", "040 70381734", "telefonisch erreichbar zwischen 8 und 18 Uhr, ist zweimal die Woche bei uns"));
        contacts.add(new Contact("Ersthelfer", "Peter Zornig",
                "aus dem Vertrieb", "Durchwahl 34", "zu unseren regulären Betriebszeiten"));
        contacts.add(new Contact("Ersthelfer", "Klaus Vonundzu",
                "aus der IT", "Durchwahl 06", "zu unseren regulären Betriebszeiten"));
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
        contacts.get(0).hashCode();
    }

    public Contact getSelectedContact() {
        return selectedContact;
    }

    public void setSelectedContact(Contact selectedContact) {
        this.selectedContact = selectedContact;
    }
}
