import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(List.of("Kiwi", "Banaan", "Aardbei"));
        for (String s : fruits) {
            System.out.println(s);
        }
        Collections.sort(fruits);
        for (int i = 0; i < fruits.size(); i++ ) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }

        System.out.println(fruits);
//        char[][] board = new char[3][3];
//
//        for (int r = 0; r < 3; r ++) {
//            for (int c = 0; c < 3; c++) {
//                board[r][c] = '-';
//            }
//        }
//        board[2][0] = 'X';
//
//        for (int r = 0; r < 3; r ++) {
//            for (int c = 0; c < 3; c++) {
//                System.out.println(board[r][c]);
//            }
//            System.out.println();
//        }

//        char[] chars = { 'a', 'b', 'c', 'd', 'g' };
//        String[] strs = { "Hallo", "daar" };
//
//
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }
//
//        for (char ch: chars) {
//            System.out.println(ch);
//        }
//        for (int i = chars.length - 1; i > 0; i--) {
//            System.out.println(chars[i]);
//        }
    }
}
