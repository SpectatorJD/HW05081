package pro.skyHW0508.HW05081;


import pro.skyHW0508.HW05081.exceptions.WrongLoginException;
import pro.skyHW0508.HW05081.exceptions.WrongPassException;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface{
    public String checkLogin (String userLogin) {
        if (userLogin.length()>=20){
            throw new WrongLoginException();
        }
       return "hi " + userLogin;
    }
    public String checkPassword (String userPassword){
        if (userPassword.length()>20){
            throw new WrongPassException();
        }
        return "pass " + userPassword;
    }
    }

