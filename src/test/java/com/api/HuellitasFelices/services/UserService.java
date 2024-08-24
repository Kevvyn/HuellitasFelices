package com.api.HuellitasFelices.services;

import com.api.HuellitasFelices.models.UserModel;
import com.api.HuellitasFelices.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

//La etiqueta @Service sirve para marcar la clase que se encargara de la logica del negocio
@Service
public class UserService {

    //este anotation es para la inyeccion de dependencias
    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }

    //Metodo para buscar una persona con su id
    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }
}
