public class Methods {

//////////////   Introduction to Java Programming v.11   //////////////
                    //////////  Chapter 6   //////////
                      /////   Exercise 6.2    /////
                         /// 04-10-2018///
                           // - WITT - //

    public static int sumDigits(long n) {

        int result = 0;
        int extractDigit = 0;
        // long number = n;

        while (n != 0) {

            extractDigit =(int)(n % 10);
            n = (int)n / 10;

            result += extractDigit;
        }
        return result;
    }


}
