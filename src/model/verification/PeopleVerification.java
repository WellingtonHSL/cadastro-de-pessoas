package model.verification;

public class PeopleVerification {

    public static boolean isValidCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") ||
                cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888") ||
                cpf.equals("99999999999")) {
            return false;
        }

        return cpf.matches("\\d{11}");
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.equals("00000000000") || phoneNumber.equals("11111111111") || phoneNumber.equals("22222222222") ||
                phoneNumber.equals("33333333333") || phoneNumber.equals("44444444444") || phoneNumber.equals("55555555555") ||
                phoneNumber.equals("66666666666") || phoneNumber.equals("77777777777") || phoneNumber.equals("88888888888") ||
                phoneNumber.equals("99999999999")) {
            return false;
        }
        return phoneNumber.matches("\\d{11}");
    }

    public static boolean isValidEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }



}
