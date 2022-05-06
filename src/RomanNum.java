import java.util.Scanner;

public class RomanNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите римское число:");
        String rome = in.nextLine();
        System.out.println("Arabian number " + romanToInt(rome));
    }

    public static int romanToInt(String s) {
        String[] mas = s.split("");
        int num = 0;
        for (int i = 0; i < mas.length - 1; i++) {

            switch (mas[i]) {
                case "I":
                    if (!mas[i + 1].equals("V") && !mas[i + 1].equals("X")) {
                        num += 1;
                    } else {
                        num -= 1;
                    }
                    break;
                case "V":
                    num += 5;
                    break;
                case "X":
                    if (!mas[i + 1].equals("L") && !mas[i + 1].equals("C")) {
                        num += 10;
                    } else {
                        num -= 10;
                    }
                    break;
                case "L":
                    num += 50;
                    break;
                case "C":
                    if (!mas[i + 1].equals("D") && !mas[i + 1].equals("M")) {
                        num += 100;
                    } else {
                        num -= 100;
                    }
                    break;
                case "D":
                    num += 500;
                    break;
                case "M":
                    num += 1000;
                    break;
            }
        }

//unnecessary actions
        switch (mas[mas.length - 1]) {
            case "I":
                num += 1;
                break;
            case "V":
                num += 5;
                break;
            case "X":
                num += 10;
                break;
            case "L":
                num += 50;
                break;
            case "C":
                num += 100;
                break;
            case "D":
                num += 500;
                break;
            case "M":
                num += 1000;
                break;
        }

        return num;
    }
}
