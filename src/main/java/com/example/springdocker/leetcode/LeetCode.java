package com.example.springdocker.leetcode;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println(winnerOfGame("AAAAABBB"));
    }
    public static boolean winnerOfGame(String colors) {
      boolean winner = false;
      if(colors.length() < 3) return winner;
      StringBuilder str = new StringBuilder(colors);
      boolean isElisQueue = true;
      int count = 1;
      while(count != 0 ){
          count = 0;
          for(int i = 1; i < str.length()-1; i++){
              if(isElisQueue){
                  if(str.charAt(i) == 'A' && str.charAt(i +1) == 'A' && str.charAt(i-1) == 'A' ){
                          str = new StringBuilder(str.substring(0,i) + str.substring(i+1));
                          isElisQueue = false;
                          i = 0;
                           count = 1;
                           winner=true;
                  }
              }else{
                  if(str.charAt(i) == 'B' && str.charAt(i +1) == 'B' && str.charAt(i-1) == 'B' ){
                      str = new StringBuilder(str.substring(0,i) + str.substring(i+1));
                      isElisQueue = false;
                      i = 0;
                      count = 1;
                      winner = false;
                  }
              }

          }
      }
        return winner;
    }
}

