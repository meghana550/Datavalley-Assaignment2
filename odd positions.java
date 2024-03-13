public class Main {
    public static void main(String[] args) {
        String text = "type here to search";
        StringBuilder oddPositionChars = new StringBuilder();
        res = text.length;
        System.out.println(res);
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0 && text.charAt(i) != ' ') {
                oddPositionChars.append(text.charAt(i));
            }
        }
        
        System.out.println("Odd position characters: " + oddPositionChars.toString());
    }
}