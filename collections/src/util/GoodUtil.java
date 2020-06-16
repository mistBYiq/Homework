package util;

import java.security.SecureRandom;

public class GoodUtil {
    static final String ABC = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom random = new SecureRandom();

    public String randomString(int len) {
        StringBuilder stringBuilder = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            stringBuilder.append(ABC.charAt(random.nextInt(ABC.length())));
        return stringBuilder.toString();
    }
}
