/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * 345. Reverse Vowels of a String
 */

class ReverseVowels {
    public String reverseVowels(String s) {
        //set the vowels string to check with each character
        final String vowels = "aeiouAEIOU";

        //Convert string to character array
        char[] charArray = s.toCharArray();
        
        //left pointer to traverse upto first vowel
        int left = 0;

        //right pointer to travser from end to first vowel from last
        int right = charArray.length -1;

        //Traverset loop while left < right
        while(left < right) {

            //check here left < right AND traverse upto current charecter is eqaul to vowel
            while(left<right && (vowels.indexOf(charArray[left]) == -1))
            ++left;
            
            //Traverse from right to left to get vowels  
            while(left<right && (vowels.indexOf(charArray[right]) == -1))
            --right;
            
            //Change the place of character once we get positions of vowel from left and right
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            ++left;
            --right;
        }
        //return String result
        return String.valueOf(charArray);
    }
}