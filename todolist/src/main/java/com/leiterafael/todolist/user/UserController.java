package com.leiterafael.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificadores:
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/user")
 public class UserController {

    @Autowired
    private IUserRepository userRepository;
    
    /**
     * String - Texto
     * Integer - (int) numeros inteiros
     * Double (double) Numeros 0.0000
     * Float (float) Numeros 0.0000
     * Char (a, b) Letras
     * Date (data)
     * void - nao ha nenhum retorno
     */
@PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
       var user = this.userRepository.findByUsername(userModel.getUsername());

       if(user != null) {
            System.out.println("Usuario ja existe");
            //Mensagem de erro
            //Status Code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario ja existe");
       }
       
       var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

}
