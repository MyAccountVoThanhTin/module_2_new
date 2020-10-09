package _0_project_furama_resort._04_commons;

import _0_project_furama_resort.exceptions.*;

import java.util.regex.Pattern;

public class Validate {
    private static final String NAME_SERVICES_REGEX = "^[A-Z]+[\\w]*$";
    private static final String ID_SERVICES_VILLA_REGEX = "SVVL-[0-9]{4}";
    private static final String ID_SERVICES_HOUSE_REGEX = "^SVHO-[0-9]{4}";
    private static final String ID_SERVICES_ROOM_REGEX = "^SVRO-[0-9]{4}";
    private static final String AREA_REGEX = "\\d+[.][\\d+]|\\d*";
    private static final String NAME_FREE_SERVICES_REGEX = "[massage | karaoke | food | drink | car]";
    private static final String NAME_CUSTOMER_REGEX = "[A-Z]+\\w*(\\s+[A-Z]{1}[a-z0-9]*)*";
    private static final String BIRTHDAY_CUSTOMER_REGEX = "\\d+\\d*/\\d+\\d*/\\d{4}";
    private static final String EMAIL_CUSTOMER_REGEX = "\\w+@[a-z]+(.[a-z]+)*";
    private static final String GENDER_CUSTOMER_REGEX = "[male|female|unknown]+";
    private static final String ID_CUSTOMER_REGEX = "\\d{3} \\d{3} \\d{3}";
    private static boolean pattern(String regex,String value){
        if(Pattern.compile(regex).matcher(value).matches()){
            return true;
        }
        return false;
    }
    public static boolean idServices(String id,int choose){
        String regex ;
        switch (choose){
            case 1 :
                regex = ID_SERVICES_VILLA_REGEX;
                break;
            case 2 :
                regex  = ID_SERVICES_HOUSE_REGEX;
                break;
            case 3:
                regex = ID_SERVICES_ROOM_REGEX;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
        if(pattern(regex,id)){
            return true;
        }
        return false;
    }

    public static boolean nameServices(String name){
        if(pattern(NAME_SERVICES_REGEX,name)){
            return true;
        }
        return false;
    }

    public static boolean areaUse(String area){
        if(pattern(AREA_REGEX,area)){
            if (Double.parseDouble(area) > 30){
                return true;
            }
        }
        return false;
    }

    public static boolean nameFreeService(String name){
        if(pattern(NAME_FREE_SERVICES_REGEX,name)){
                return true;
        }
        return false;
    }

    public static void nameCustomer(String name) throws NameException {
        char[] chars = name.trim().toCharArray();
        for (int i = 0;i < chars.length-1;i++){
            if(Character.isLowerCase(chars[0])){
                throw new NameException();
            }else if(Character.isWhitespace(chars[i]) && Character.isWhitespace(chars[i+1])){
                throw new NameException();
            }else if(Character.isWhitespace(chars[i]) && Character.isLowerCase(chars[i+1])){
                throw  new NameException();
            }
        }
    }

    public static void emailCustomer(String email) throws EmailException {
        if(!pattern(EMAIL_CUSTOMER_REGEX,email)){
            throw new EmailException();
        }
    }

    public static void genderException(String gender) throws GenderException {
        gender = gender.toLowerCase();
        if (!pattern(GENDER_CUSTOMER_REGEX,gender)){
            throw new GenderException();
        }
    }

    public static void idCustomer(String id) throws IdCardException {
        if(!pattern(ID_CUSTOMER_REGEX,id)){
            throw new IdCardException();
        }
    }

    public static void birthdayCustomer(String birthday) throws BirthdayException {
        if (pattern(BIRTHDAY_CUSTOMER_REGEX,birthday)){
            int year = Integer.parseInt(birthday.substring(birthday.lastIndexOf("/")+1));
            if(year < 1990){
                throw new BirthdayException();
            }
        }else {
            throw new BirthdayException();
        }
    }
}
