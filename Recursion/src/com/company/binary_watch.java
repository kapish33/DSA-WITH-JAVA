package com.company;

import java.util.ArrayList;
import java.util.List;

public class binary_watch {
        int[] map = {1,2,4,8,1,2,4,8,16,32};
        public List<String> readBinaryWatch(int num) {
            List<String> res = new ArrayList<>();
            backtrack(res, 0, 0, 0, num);
            return res;
        }
        public void backtrack(List<String> res, int curHour, int curMinute, int index, int left){
            if(index == 10 && left!=0) return;
            else if(left==0){
                res.add(translate(curHour, curMinute));
                return;
            }else{
                if(index<4&&curHour+map[index]<12) {
                    backtrack(res, curHour+map[index], curMinute, index+1, left-1);
                }else if(index>=4 && curMinute+map[index]<60){
                    backtrack(res, curHour, curMinute+map[index], index+1, left-1);
                }
                backtrack(res, curHour, curMinute, index+1, left);
            }
        }
        public String translate(int hour, int minute){
            if(minute<10) return String.valueOf(hour)+":0"+String.valueOf(minute);
            else return String.valueOf(hour)+":"+String.valueOf(minute);
        }

}
