package main;
import java.util.*;
public class Solution {
    public List<Integer> findChairs(List<List<String>> chairs, Integer req){
        if(req == 0){
            Arrays.asList(1);
        }
        List<Integer> res = new ArrayList();
        int p = 0;
        while(req > 0 && p < chairs.size()){
            int diff = Math.max(chairs.get(p).get(0).length() - Integer.parseInt(chairs.get(p).get(1)), 0);
            res.add(Math.min(req, diff));
            req -= diff;
            p++;
        }
        return (req > 0)?Arrays.asList(0):res;
    }
}
