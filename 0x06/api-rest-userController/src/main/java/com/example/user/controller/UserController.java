package com.example.user.demo.controller;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {

        String msg = "You have entered valid ID";
        if (!isId(id)) {
            throw new UserIdException(String.format("%d", id));
        }
        return msg;
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {

        String msg = "You have entered valid USERNAME";
        if (!isUserName(userName)) {
            throw new UserNameException(userName);
        }
        return msg;
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {

        String msg = "You have entered valid CPF";
        if(!isCPF(cpf)){
            throw new CPFException(cpf);
        }
        return msg;

    }
    public boolean isId(int id){
        if(id > 0 && id < 100){
            return true;
        }
        return false;
    }
    public boolean isUserName(String userName){
        if(userName.length() > 3 && userName.length() < 15){
            return true;
        }
        return false;
    }
    public boolean isCPF(String cpf) {
        if(cpf.length() > 3 && cpf.length() < 15){
            return true;
        }
        return false;
    }
}