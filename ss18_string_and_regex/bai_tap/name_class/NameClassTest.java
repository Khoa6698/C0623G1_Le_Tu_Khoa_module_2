package ss17_string_and_regex.bai_tap.name_class;

public class NameClassTest {
    private static NameClass nameClass;
    public static final String[] command = new String[]{"C0223G","A0323K"};
    public static final String[] illegal = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        nameClass = new NameClass();
        for (String c : command){
            boolean check = nameClass.validate(c);
            System.out.println("Name is: "+ c + " is check "+check);
        }
        for (String i : illegal){
            boolean check1 = nameClass.validate(i);
            System.out.println("Name is: "+ i + " is check "+ check1);
        }
    }
}
