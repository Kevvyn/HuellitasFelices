package com.api.HuellitasFelices.repositories;

import com.api.HuellitasFelices.models.UserModel;
import net.bytebuddy.implementation.bytecode.collection.ArrayLength;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Este anotation nos ayuda a hacer consultas
@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {


}
