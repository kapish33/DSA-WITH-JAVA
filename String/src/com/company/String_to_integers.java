package com.company;


public class String_to_integers {
    public int myAtoi(String s) {

        int index = 0;

        /*
         * This skips the leading whitespace.
         */
        while (index < s.length( ) && s.charAt(index) == ' ') {
            index = index + 1;
        }

        /*
         * If we're at the end of the string (string is only whitespace), we return 0
         * as per the problem description.
         */
        if (index == s.length( )) {
            return 0;
        }

        /*
         * This gets the sign: 1 if positive, -1 if negative, so that we can
         * apply it by multiplication.
         */
        long sign = 1;
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index = index + 1;
        }

        /*
         * This keeps track of the current output value.
         *
         * We use a long instead of an int to avoid underflow/overflow problems.
         *
         * The loop terminates early if this value gets outside the [-2^31, 2^31 - 1]
         * range given in the problem description, so we don't have to worry about
         * underflowing/overflowing the long.
         */
        long value = 0;

        /*
         * Now we parse the digits and add each digit's numeric value to the "value" variable.
         */
        while (index < s.length( ) && Character.isDigit(s.charAt(index))) {

            /*
             * First, we multiply the old value by 10 to increase the magnitude.
             * Then, we get the current digits value as an integer by subtracting '0' from it (see ASCII table).
             * Finally, we add those two together to update the value.
             */
            value = (value * 10) + (s.charAt(index) - '0');

            /*
             * We check if the new value (with the sign applied), has left the [-2^31, 2^31 - 1] range, and
             * terminate early if it has. This avoids overflowing/underflowing the long variable.
             */
            if (value * sign <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (value * sign >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            index = index + 1;
        }

        /* Return the value with the sign applied */
        return (int) (sign * value);
    }
}
