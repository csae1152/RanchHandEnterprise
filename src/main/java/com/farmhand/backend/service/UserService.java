
package com.farmhand.backend.service;

import com.farmhand.backend.model.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Helmut
 */

@Stateless
public class UserService {
    @PersistenceContext
    EntityManager em;
    
    public User save(User entity) {
        return this.em.merge(entity);
    }
    
    public void delete(long id) {
        try {
            User reference = this.em.getReference(User.class, id);
            this.em.remove(reference);
        } catch (EntityNotFoundException e) {
    //It doesn't exist already
    }
    }
    public User findById(long id) {
        return this.em.find(User.class, id);
    }
    public List<User> findAll() {
        return this.em.createNamedQuery("User.findAll", User.class)
    .getResultList();
    }
    
}
