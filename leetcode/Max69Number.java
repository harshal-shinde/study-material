
/
  Problem number - 1323 
  You are given a positive integer num consisting only of digits 6 and 9.
    Return the maximum number you can get by changing at most one digit
    (6 becomes 9, and 9 becomes 6).
 /
class Max69 {
    public int maximum69Number (int num) {
       char[] charArray = String.valueOf(num).toCharArray();
        for(int i=0; i< charArray.length; i++) {
            if(charArray[i] == '6') {
                charArray[i] = '9';
                break;
            }
        }
        return Integer.valueOf(String.valueOf(charArray));
    }
}