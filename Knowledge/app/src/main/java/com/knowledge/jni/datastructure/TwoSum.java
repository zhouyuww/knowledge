package com.knowledge.jni.datastructure;

import android.util.Log;
import android.util.SparseArray;

/**
 * Created by universe on 2017/6/8.
 */
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    Example:
//    Given nums = [2, 7, 11, 15], target = 9,
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].

public class TwoSum {

    private int[] target = new int[]{1,2,3,4,5,6,7,8,9,0,93,43,4,3,5,7};

    public int[] getTwoSum(int[] src,int sum){
        SparseArray array = new SparseArray();
        for(int i=0;i<src.length;i++){
             int sub = sum -src[i];
             if(null!=array.get(sub)){
                  int[] result = new int[2];
                  result[0] =(int)array.get(sub);
                  result[1] = i;
                  return  result;
             }else{
                 array.put(sub,i);
             }
        }
        return  null;
    }

    public static void test(){
         TwoSum twoSum = new TwoSum();
         int[] tar =twoSum.getTwoSum(twoSum.target,10);
         if(null!=tar){
             Log.e("TwoSum","  "+tar[0]+"  "+tar[1]);
         }
    }

}
