import java.util.HashMap;
import java.util.Map;

class Word_Pattern {

  public boolean wordPattern(String pattern, String s) {
    //Split string to word array
    String[] arr = s.split(" ");
    //Convert pattern to char array
    char[] charArray = pattern.toCharArray();

    if(arr.length != charArray.length) return false;

    Map<String, Character> map= new HashMap<>();
    
    for(int i =0; i < arr.length; i++) {
      //Case 1 - check key and value are not present then put in map
      if(!map.containsKey(charArray[i]) && !map.containsValue(arr[i])) {
        map.put(arr[i],charArray[i]);
      } else 
      //Case 2  - if map not contain key but it contains character then return false
      if(!map.containsKey(charArray[i]) && map.containsValue(arr[i])) {
        return false;
      } else {
        //Case 3 - Current char is not matching with key of map : return false
        if(map.get(arr[i]) != charArray[i]) {
          return false;
        }
      }
    }
    return true;
  }

}