package Util;

import ExceptionHandling.ValidateInput;

/**
 *
 * @author ACER
 */
public class ValidationUtil {
    public static void validateInput(String input) throws ValidateInput{
        if(input.equals("0")){
            throw new ValidateInput("wajib pesan 1 makanan");
        }
    }
}
