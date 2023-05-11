package pro.skyHW0508.HW05081;


import pro.skyHW0508.HW05081.exceptions.WrongLoginException;
import pro.skyHW0508.HW05081.exceptions.WrongPassException;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface{
    public String checkPerson (String userLogin, String userPassword, String userConfirmPassword) {
        if (!userLogin.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongLoginException();
        }
        if (!userPassword.matches("^[a-zA-Z0-9_]{0,20}$")){
            throw new WrongPassException();
        }
        if (!userPassword.equals(userConfirmPassword)){
            throw new WrongPassException();
        }
        return "Login " + userLogin +  " Password " + userPassword;
    }

    @Override
    public String checkLogin(String userLogin) {
        return null;
    }

    @Override
    public String checkPassword(String userPassword) {
        return null;
    }
}


