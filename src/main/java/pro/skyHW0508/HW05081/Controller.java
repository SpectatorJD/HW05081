package pro.skyHW0508.HW05081;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.skyHW0508.HW05081.exceptions.WrongLoginException;
import pro.skyHW0508.HW05081.exceptions.WrongPassException;

@RestController
public class Controller {
    private final ServiceInterface service;

    public Controller(ServiceInterface service) {
        this.service = service;
    }

    @GetMapping(path = "/login")
    public String login(@RequestParam("login") String userLogin, @RequestParam("password") String userPassword) {
        try {
            return service.checkLogin(userLogin);

        } catch (WrongLoginException e) {
            System.out.println("Логин должен быть не больше 20 символов! ");
        }

try {
            return service.checkPassword(userPassword);
        } catch (WrongPassException e){
            return "Пароль должен быть строго меньше 20 символов! ";
        }
    }
}




