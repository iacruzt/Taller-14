public class Main
{

    public static void main (String [] args)
    {
        System.out.println ( isAWeekDay ( "mon" ) );
        System.out.println ( allVowels ( "ii" ) );
        System.out.println ( clockTime ( "24:03:11" ) );
    }

    public static boolean isAWeekDay (String string)
    {
        boolean returnValue;

        if ( string.matches ("mon|tue|wed|thu|fri|sat|sun") ) // Vertical bar: or. Spaces matter: "mon | tue" isn't the
                                                              // same as "mon|tue"
        {
            returnValue = true;
        }
        else
        {
            returnValue = false;
        }

        return returnValue;
    }

    public static boolean allVowels (String string)
    {
        boolean returnValue;

        if ( string.matches ( "[a-e-i-o-u]+" ) )  // "(a|b|c|o|u)" = "[a-e-i-o-u]". Note: "1(2|3)" = "12|13"
                                                  // Repetitions:
                                                  // Asterisk *: Within the String it happens 0 to any times.
                                                  // Plus +: Within the String it happens 1 to any number of times.
                                                  // Question mark ?: Within the String it happens 0 to 1 times.
                                                  // {#}: Within the String it happens # times
                                                  // {#1 , #2}: Within the String it happens #1 to #2 times.
                                                  // {#,}: Within the String it happens # to any number of times.
        {
            returnValue = true;
        }
        else
        {
            returnValue = false;
        }

        return returnValue;
    }

    public static boolean clockTime (String string)
    {
       boolean returnValue;

       if ( string.matches ( "((0|1)\\d|2(0|1|2|3|4|))(:((0|1|2|3|4|5)\\d|60)){2}" ) )
       // Notice, first of all, how I didn't use any boxed braces here. It's because the use of those braces can
       // derive in some really nasty situations, all given the fact that [ab] means (a|b). YOU SHOULD AVOID THE USE
       // OF BOXED BRACES!!!
       // Second of all, notice the use of "\\d", which means "(0|1|2|3|4|5|6|7|8|9)". There are many shortcuts like
       // this... For instance, "\\w" is any alphanumerical character. These shortcuts are characterized for having a
       // "\\@" form, where @ varies for a given shortcut.
       {
           returnValue = true;
       }
       else
       {
           returnValue = false;
       }

       return returnValue;
    }
}
