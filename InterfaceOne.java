package com.Day24_address_book_system;

import java.awt.List;

public interface InterfaceOne {

	void createContact();
    void addContact();
    void editContact();
    void deleteContact();
    void display();
    void displayBook();
    void addToBook();
    void operation();
    void searchPerson();
    void addContactByCity();
    void viewByCity();
    void addContactByState();
    void viewByState();
    void sortAddressBook();
    void sortByCity();
    void sortByState();
    void writeToAddressBookFile();
    public java.util.List<String> readDataFromFile();
}
