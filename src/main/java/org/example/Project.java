package org.example;
public class Project {
//    Checks if the provided password is strong.
//A strong password must contain at least one uppercase letter, one lowercase letter, one digit, and one special symbol.
//Returns true if the password is strong; otherwise, returns false.

    public boolean isStrongPassword(String password) {
        if (password == null || password.length() < 6) {
            return false; //проверяет на отсутствие и если меньше 6
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "@#$%^&*()<>";//допустимые знаки чтоб код считался сильный
        for (char d : password.toCharArray()) {//цикл проходит по каждому символу в пароле, чтобы проверить, соответствует ли он каким-либо критериям
            if (Character.isUpperCase(d)) {
                hasUpper = true;
            } else if (Character.isLowerCase(d)) {
                hasLower = true;
            } else if (Character.isDigit(d)) {
                hasDigit = true;
            } else if (specialChars.indexOf(d) >= 0) {
                hasSpecial = true;
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;//В конце метод возвращает true, только если все четыре условия выполнены,если нет то false
    }
}
