public class Keypad {
  public static int presses(String phrase) {
    char[] letters = phrase.toCharArray();
        int characterValue = 0;

        for (char originalCharacter : letters)
        {
            char lowerCaseLetter = Character.toLowerCase(originalCharacter);
            int asciiValue = (int)lowerCaseLetter;

            //handle single quote (not  counted)
            if (asciiValue == 39 || asciiValue == 0 || asciiValue <= 32 )
            {
            characterValue = characterValue + 1;
                System.out.println("the letter " + lowerCaseLetter + " is not counted in this exercise");
            }
            else
            {
                //handle space 
                if (asciiValue >= 32 && asciiValue <= 96 || asciiValue >= 123 && asciiValue <= 126)
                {
                    characterValue = characterValue + 1;
                    System.out.println("the character " + lowerCaseLetter + " is a character");
                }
                else
                {

                    //handle s or z
                    if (asciiValue == 115 || lowerCaseLetter == 122)
                    {
                        characterValue = characterValue + 4;
                        System.out.println("the letter " + lowerCaseLetter + "is z or s");
                    }
                    else
                    {
                        //handle before s
                        if (asciiValue >= 115 && asciiValue <= 122)
                        {
                            asciiValue = asciiValue - 1;
                        }

                        if (asciiValue >= 97 && asciiValue <= 122)
                        {
                            {
                                characterValue = characterValue + calculatePresses(asciiValue);
                            }
                        }
                    }
                }
            }
        }
        return characterValue;
    }

    private static int calculatePresses(int asciiValue)
    {
        char b = (char)asciiValue;

        if (asciiValue == 97 || (asciiValue - 97) % 3 == 0)
        {
            return 1;
        }
        if (asciiValue == 98 || (asciiValue - 98) % 3 == 0)
        {
            return 2;
        }
        if (asciiValue == 99 || (asciiValue - 99) % 3 == 0)
        {
            return 3;
        }
        return 0;
    }
}