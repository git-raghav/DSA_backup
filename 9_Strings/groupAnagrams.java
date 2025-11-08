//create a hashmap
//traverse through each string in the array
//create a key by sorting the string or using frequency count
//if the key is not present in the map, add the key with an empty arraylist
//if the key is present, add the string to the arraylist
//at last traverse through the map and add all the arraylists to the result list

import java.util.*;
public class groupAnagrams {
    // Using Sorting Approach
    public static List<List<String>> groupAnagramsSort(String[] str) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            char arr[] = str[i].toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str[i]);
        }

        ArrayList<List<String>> resultList = new ArrayList<>();
        for(String key : map.keySet()){
            resultList.add(map.get(key));
        }
        return resultList;
    }

    // Using Frequency Count Approach
    public static List<List<String>> groupAnagramsFreq(String[] str) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String freqString = getFreqString(str[i]);

            if(!map.containsKey(freqString)){
                map.put(freqString, new ArrayList<>());
            }
            map.get(freqString).add(str[i]);
        }

        ArrayList<List<String>> resultList = new ArrayList<>();
        for(String key : map.keySet()){
            resultList.add(map.get(key));
        }
        return resultList;
    }

    public static String getFreqString(String str){
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        char c = 'a';
        for (int i = 0; i < freq.length; i++) {
            sb.append(c);
            sb.append(freq[i]);
            c++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        // System.out.println(groupAnagramsSort(str));
        System.out.println(groupAnagramsFreq(str));
    }
}
