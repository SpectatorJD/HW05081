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
    public String login(@RequestParam("login") String userLogin, @RequestParam("password") String userPassword,
                        @RequestParam ("confirmPassword") String userConfirmPassword ) {
        try {return service.checkPerson(userLogin, userPassword, userConfirmPassword);
    } catch (WrongLoginException e ){

        }finally {
            return service.checkPerson(userLogin,userPassword, userConfirmPassword);
        }
        }
}







