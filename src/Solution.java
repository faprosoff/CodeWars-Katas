import java.lang.StringBuilder;

class Solution {

    static String toCamelCase(String s) {

        StringBuilder sb = new StringBuilder();
        String[] wordList = s.split("[-_]");
        String tempString;

        for (int i = 0; i < wordList.length; i++) {

            if (i >= 1) {
                tempString = wordList[i].substring(0, 1).toUpperCase() + wordList[i].substring(1);
            } else {
                tempString = wordList[i];
            }
            sb.append(tempString);
        }

        return sb.toString();
    }
} 