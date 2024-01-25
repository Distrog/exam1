
public class Main {
    public static void main(String[] args) {
        String test = "123456вапжрыат ыважпаи ы пыавж";
        String[] result = splitString(test);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] splitString(String s) {
        if (s.length() % 2 != 0) {
            return new String[]{"Невозможно разделить строку ровно поровну"};
        } else {
            return new String[]{s.substring(0, s.length() / 2), s.substring(s.length() / 2)};
        }
    }
}