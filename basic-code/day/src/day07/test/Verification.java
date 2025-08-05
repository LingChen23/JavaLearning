package day07.test;

import java.util.Random;

public class Verification {
    public static void main(String[] args) {
        String version = getVersion();

        System.out.println(version);
    }

    public static String getVersion(){
        String version = "";
        char[] chs = new char[52];
        for(int i = 0; i < chs.length; i++){
            if(i <= 25){
                chs[i] = (char)(97 + i);
            }else{
                chs[i] = (char)(65 + i -26);
            }
        }
        //随机四次
        Random r = new Random();
        for(int i = 0; i < 4; i++){
            int random = r.nextInt(chs.length);
            version += chs[random];
        }

        int random = r.nextInt(10);
        version += random;
        return version;

    }
}
