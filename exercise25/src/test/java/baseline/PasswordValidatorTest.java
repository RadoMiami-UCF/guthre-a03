/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void testPasswordValidator() {
        assertEquals(1, PasswordValidator.passwordValidator("1234"),
                "Can't identify very weak passwords");
        assertEquals(2, PasswordValidator.passwordValidator("pppp"),
                "Can't identify weak passwords");
        assertEquals(0, PasswordValidator.passwordValidator("12ab"),
                "Can't properly identify short unknown passwords");
        assertEquals(3, PasswordValidator.passwordValidator("abcd1234"),
                "Can't identify strong passwords");
        assertEquals(4, PasswordValidator.passwordValidator("abc1234$"),
                "Can't identify very strong passwords");
        assertEquals(0, PasswordValidator.passwordValidator("abcdefghijkl"),
                "Can't properly identify long unknown passwords");

    }
}