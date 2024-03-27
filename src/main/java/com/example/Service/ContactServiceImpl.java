package com.example.Service;

import com.example.model.Contact;
import com.example.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService{

    private final ContactRepository contactRepository;

    @Override
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public List<Contact> listContacts() {
        return contactRepository.findAll();
    }

    @Override
    public void editContact(Contact contact) {
        contactRepository.update(contact);
    }

    @Override
    public void deleteById(Long id) {
        contactRepository.deleteById(id);
    }

    @Override
    public Contact findById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }
}
