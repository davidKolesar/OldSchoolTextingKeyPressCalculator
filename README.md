# OldSchoolTextingKeyPressCalculator
This is a program that calculates the amount of button presses required for any phrase on a basic phone without T9 capabilities.

Prior to the development of T9 (predictive text entry) systems, the method of typing words was known as "multi-tap" and involved pressing a button repeatedly to cycle through the possible values.

For example, to type a letter "R" you would press the 7 key three times (as the screen display for the current character cycles through P->Q->R->S->7). A character is "locked in" once the user presses a different key or pauses for a short period of time (thus, no extra button presses are required beyond what is needed for each letter individually). The zero key handles spaces, with one press of the key producing a space and two presses producing a zero.

In order to send the message "WHERE DO U WANT 2 MEET L8R" a teen would have to actually do 47 button presses.

-- Punctuation is ignored for this exercise. 
-- don't distinguish between upper/lowercase characters (but the program accepts both as parameters).

The goal of this module was to simulate working for a manufacturer who was testing out different keyboard layouts to optimize text messaging in it's infancy, so hard codeing the amount of keypresses for all 26 letters by hand was avoided.