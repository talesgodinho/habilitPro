package util;

import java.util.regex.Pattern;

public class Valida {

    public static boolean validaEmail(String email){
        String regx = "^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,26}$";
        Pattern pattern = Pattern.compile(regx);
        return pattern.matcher(email).matches();
        //solução base: delftstack.com/pt/howto/java/email-validation-method-in-java/
    }

    public static boolean validaSenha(String senha){
        String regx = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$"; //8 caracteres, letras e números.
        Pattern pattern = Pattern.compile(regx);
        return pattern.matcher(senha).matches();
    }

}
