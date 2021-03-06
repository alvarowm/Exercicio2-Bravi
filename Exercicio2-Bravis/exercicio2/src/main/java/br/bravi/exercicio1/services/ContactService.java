package br.bravi.exercicio1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.bravi.exercicio1.models.Contact;
import br.bravi.exercicio1.repositories.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
    private ContactRepository contactRepository;
	
	@Transactional(readOnly = true)
	public Contact findByID(Long id) {
		return contactRepository.findOne(id);
	}

	@Transactional
	public Contact save(Contact c) {
		return contactRepository.save(c);
	}

	@Transactional
	public Contact update(Contact contact, Long id) {
		Contact c = contactRepository.findOne(id);
		if (c == null)
			return null;

		c.setContact(contact.getContact());
		c.setContactType(contact.getContactType());
		
		return contactRepository.save(contact);
	}
	

	@Transactional
	public boolean delete(Long id) {
		if (id == null || !contactRepository.exists(id))
			return false;
		
		try {
			contactRepository.delete(id);
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
