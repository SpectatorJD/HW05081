package pro.skyHW0508.HW05081;

public interface ServiceInterface {
    String checkLogin (String userLogin);

    String checkPassword(String userPassword);

    String checkPerson(String userLogin, String userPassword, String userConfirmPassword);
}
