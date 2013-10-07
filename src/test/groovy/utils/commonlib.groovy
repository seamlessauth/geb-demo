package utils

/**
 * Created with IntelliJ IDEA.
 * User: anilk
 * Date: 7/10/13
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
class commonlib {

    public String getRandomText() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < 5; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);

        }
        return sb.toString();
    }
}
