package java;

import java.util.List;

/**
 * ContactManager is responsible for managing contacts.
 * It uses an instance of DataSource to access the contacts.
 */
public class ContactManager {

    private final DataSource dataSource;

    /**
     * Creates a new ContactManager using the given DataSource.
     *
     * @param dataSource DataSource to use for accessing contacts
     * @throws Ill  egalArgumentException if dataSource is null
     */
    public ContactManager(DataSource dataSource) {
        if (dataSource == null) {
            throw new IllegalArgumentException("DataSource cannot be null");
        }
        this.dataSource = dataSource;
    }

    /**
     * Retrieves a list of all contacts from the data source.
     *
     * @return List of contacts
     */
    public List<Contact> getContacts() {
        return dataSource.getContacts();
    }
}

/**
 * Interface for accessing contacts.
 */
interface DataSource {
    /**
     * Retrieves a list of all contacts.
     *
     * @return List of contacts
     */
    List<Contact> getContacts();
}

/**
 * Implementation of DataSource that accesses contacts from a specific source.
 */
class Original implements DataSource {

    /**
     * Retrieves a list of all contacts.
     *
     * @return List of contacts
     */
    @Override
    public List<Contact> getContacts() {
        // Implementation to access contacts from original source
        return null; // Replace with actual implementation
    }
}
