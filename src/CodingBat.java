public class CodingBat {

//TODO: 1. The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday) {
            return true;
        } else if (vacation) {
            return true;
        } else {
            return false;
        }
    }

//TODO: 2. We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

//TODO: 3. Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        } else {
            return (a + b) * 2;
        }
    }

//TODO: 4. Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }

//TODO: 5. We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 || hour > 20) {
            return talking;
        } else {
            return false;
        }
    }

//TODO: 6. Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    public boolean makes10(int a, int b) {
        if (a == 10 || b ==10) {
            return true;
        } else if (a + b == 10) {
            return true;
        } else {
            return false;
        }
    }

//TODO: 7. Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

    public boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10)) {
            return true;
        } else if ((Math.abs(200 - n) <= 10)) {
            return true;
        } else {
            return false;
        }
    }
//    //another method//
//    public boolean nearHundred(int n) {
//        return ((Math.abs(100 - n) <= 10) ||
//                (Math.abs(200 - n) <= 10));
//    }

//TODO: 8. Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

//TODO: 9. Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }

//TODO: 10. Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);

        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());

        return front + back;
    }

//TODO: 11. Given a string, return a new string where the first and last chars have been exchanged.

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

//TODO: 12. Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }
        return front + front + front;
    }

//TODO: 13. Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

    public String backAround(String str) {
        String replace = str.substring(str.length() - 1);
        return replace + str + replace;
    }

//TODO: 14. Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator.

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

//TODO: 15. Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

    public String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }

//TODO: 16. Given a string, return true if the string starts with "hi" and false otherwise.

    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        String wordHi = str.substring(0, 2);
        return wordHi.equals("hi");
    }

//TODO: 17. Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    public boolean icyHot(int tempOne, int tempTwo) {
        return (tempOne < 0 && tempTwo > 100) || (tempOne > 100 && tempTwo < 0);
    }

//TODO: 18. Given 2 int values, return true if either of them is in the range 10..20 inclusive.

    public boolean in1020(int x, int y) {
        return ((x >= 10 && x <= 20) || (y >= 10 && y <= 20));
    }

//TODO: 19. We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

    public boolean loneTeen(int x, int y) {
        boolean xTeen = (x >= 13 && x <= 19);
        boolean yTeen = (y >= 13 && y <= 19);
        return (xTeen && !yTeen) || (!xTeen && yTeen);
    }

//TODO: 20. Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }

//TODO: 21. Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

    public boolean mixStart(String str) {
        if (str.length() < 3) return false;

        String str2 = str.substring(1, 3);
        return str2.equals("ix");
    }

//TODO: 22. Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) =='o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) =='z') {
            result = result + str.charAt(1);
        }
        return result;
    }
    // extra review on this problem

//TODO: Given three int values, a b c, return the largest.

    public int intMax(int x, int y, int z) {
        int highest = Math.max(x, y);

        if (z > highest) {
            highest = z;
        }
        return highest;
    }

//TODO: Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

    public int close10(int x, int y) {
        int rand1 = Math.abs(x - 10);
        int rand2 = Math.abs(y - 10);

        if (rand1 < rand2) {
            return x;
        }
        if (rand2 < rand1) {
            return y;
        }
        return 0;
    }

}
