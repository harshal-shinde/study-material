# 3. Longest Substring Without Repeating Characters


Example 1:
```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
```

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
```
```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

Constraints:
```
0 <= s.length <= 5  104
s consists of English letters, digits, symbols and spaces.
```


```
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max=0;
    
        for(int right=0, left=0; right < s.length(); right++) {
            int index = s.indexOf(s.charAt(right), left);
            if(index!=right) {
                left = index+1;
            }
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}

```