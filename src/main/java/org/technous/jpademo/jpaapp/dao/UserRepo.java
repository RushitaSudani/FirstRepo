package org.technous.jpademo.jpaapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.technous.jpademo.jpaapp.entities.User;
public interface UserRepo extends CrudRepository<User, Integer> {


}
