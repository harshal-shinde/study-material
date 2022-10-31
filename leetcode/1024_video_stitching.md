




```
class Solution {
    public int videoStitching(int[][] clips, int time) {
        
        //Sort array using 0th index of each sub array
        Arrays.sort(clips, (a, b) -> a[0] - b[0]);
        //Stores current end
        int currentEnd = 0; 
        int answer = 0;
        
        for(int i=0; i< clips.length;){
              //check if first sub array starts from 0 th index else return -1
              if(clips[i][0] > currentEnd) {
                    return -1;
                }

                int newEnd = currentEnd;

                //Calculate new end , iterate upto clips total length
                while(i< clips.length &&  clips[i][0] <=currentEnd) {
                    newEnd = Math.max(newEnd, clips[i++][1]);
                }
                
                //once we get new end incremment counter of sub array
                answer++;
            
                //Update new end to current end
                currentEnd = newEnd;
            
                // if current end is equal to time provided return answer 
                if(currentEnd >= time) {
                    return answer;
                }
        }
        //for other cases return -1
        return -1;
        }
    }
```
