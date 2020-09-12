package com.matias;

public class Main {

    private static final int TEAM_NUMBER = 5;

    public static int perfectTeam(String skills) {
        // Write your code here
        char[] list = {'p','c','m','b','z'};
        int[] teamOk = {0,0,0,0,0};
        for (int i=0;i<skills.length();i++){
            for(int j=0;j<5;j++){
                if (skills.charAt(i) == list[j]){
                    teamOk[j] += 1;
                }
            }
        }
        int value = skills.length();
        for (int x=0;x<5;x++){
            if (value>teamOk[x]){
                value = teamOk[x];
            }
        }
        return value;
    }

    public static String isPossible(int a,int b, int c, int d){
        int[] coords = {0,0};
        int type = 1;
        String result = "";
        coords[0] = a;
        coords[1] = b;
        while (result == ""){
            switch (type){
                case 1:
                    if (coords[0]<c) {
                        coords[0] += b;
                    }
                    break;
                case 2:
                    if (coords[1]<d) {
                        coords[1] += a;
                    }
                    break;

            }
            if ((coords[0]==c) && (coords[1]==d)) {
                result = "Yes";
                break;
            } else if ((coords[0]>c) || (coords[1]>d)){
                result = "No";
                break;
            } else if (type>1){
                type--;
            } else {
                type++;
            }
            System.out.print(coords[0]);
            System.out.print(",");
            System.out.println(coords[1]);
        }
        return result;
    }

    static void doIt(int x,int y,int m ){
        if (x ==5){
            m=y;
        } else {
            m=x;
        }
    }
    public static void main(String[] args) {
	// write your code here

        System.out.println(isPossible(1,2,3,6));

        System.out.println(perfectTeam("ppcmbzpppmbzmbzpcmbz"));
   }
}


