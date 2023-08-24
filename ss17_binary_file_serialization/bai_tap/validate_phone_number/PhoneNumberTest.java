package ss17_string_and_regex.bai_tap.validate_phone_number;


public class PhoneNumberTest {

    private static PhoneNumber phoneNumber;
    public static final String[] command = new String[]{"(84)-(0978489648)","(84)-(0978485639)"};
    public static final String[] illegal = new String[]{"(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String c : command){
            boolean check = phoneNumber.validate(c);
            System.out.println("Phone is: "+ c + " is check "+check);
        }
        for (String i : illegal){
            boolean check1 = phoneNumber.validate(i);
            System.out.println("Phone is: "+ i + " is check "+ check1);
        }
    }
}
