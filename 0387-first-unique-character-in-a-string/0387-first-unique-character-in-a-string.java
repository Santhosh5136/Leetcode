class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        int count=-1;
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))<=1)
            {
                count=i;
                break;
            }
        }

        return count;


        
    }
}