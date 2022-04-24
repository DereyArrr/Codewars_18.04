//Завершите решение так, чтобы оно возвращало true,
// если первый переданный аргумент (строка) заканчивается вторым аргументом (тоже строкой).

class Kata {
    public static boolean solution(String str, String ending) {
        String str1= new String();
        if(str.length()>=ending.length()) {
            for (int i = str.length() - ending.length(); i < str.length(); i++) {
                str1 += str.charAt(i);
            }

            int val = str1.compareTo(ending);
            if (val == 0) {
                return true;
            } else return false;
        }else return false;
    }
}


//Ваша задача состоит в том, чтобы преобразовать строки в то, как они были бы написаны Джейденом Смитом.
//т.е. каждое слово должно быть написано с заглавной буквы
class JadenCase {

    public static String toJadenCase(String phrase) {
        if(phrase != null & phrase.length() !=0) {
            String s2 = new String();
            s2 = s2 + phrase.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
            for (int i = 1; i < phrase.length(); i++) {
                // смотрим, был ли слева пробел:
                if (" ".equals(phrase.substring(i - 1, i)))
                    s2 = s2 + phrase.substring(i, i + 1).toUpperCase();
                else s2 = s2 + phrase.substring(i, i + 1);
            }

            return s2;
        }else return null;
    }

}

//Учитывая целое число, определите, является ли оно квадратным числом :
//В математике квадратное число или идеальный квадрат — это целое число, являющееся квадратом целого числа;
class Square {
    public static boolean isSquare(int n) {
        if(n>=0) {
            for (int i = 0; i <= n; i++) {
                if (n == i * i)
                return true;
            }
        }else return false;
        return false;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println(Kata.solution("abc", "bc"));
        System.out.println(Kata.solution("abc", "d"));
        System.out.println(Kata.solution("abc", "dabc"));

        System.out.println(JadenCase.toJadenCase("ghgh gh hk"));

        System.out.println(Square.isSquare(-1));
        System.out.println(Square.isSquare(0));
        System.out.println(Square.isSquare(5));
        System.out.println(Square.isSquare(4));




    }
}
