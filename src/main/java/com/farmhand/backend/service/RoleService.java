/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmhand.backend.service;

import com.farmhand.backend.model.Role;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.EntityNotFoundException;

/**
 *
 * @author Helmut
 */
@Stateless
public class RoleService {
    @PersistenceContext
    EntityManager em;
public Role save(Role entity) {
return this.em.merge(entity);
}
public void delete(long id) {
try {
Role reference = this.em.getReference(Role.class, id);
this.em.remove(reference);
} catch (EntityNotFoundException e) {
// It doesn't exist already
}
}
public Role findById(long id) {
return this.em.find(Role.class, id);
}
public List<Role> findAll() {
return this.em.createNamedQuery("Role.findAll", Role.class)
.getResultList();
}
    
}
