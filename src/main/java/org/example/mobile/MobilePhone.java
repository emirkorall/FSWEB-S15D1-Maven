package org.example.mobile;


import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }


    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if (contact == null || contact.getName() == null || contact.getPhoneNumber() == null) {
            return false;
        }
        if (findContact(contact.getName()) >= 0) {
            return false;
        }

        return this.myContacts.add(contact);
    }

    public int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index < 0) {
            return false;
        }
        myContacts.set(index, newContact);
        return true;

    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index < 0) {
            return false;
        }
        myContacts.remove(index);
        return true;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }

    public void printContact() {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ", " + contact.getName() + " => " + contact.getPhoneNumber());


        }

    }
}
