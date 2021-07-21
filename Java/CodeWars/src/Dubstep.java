import java.util.ArrayList;

public class Dubstep {

    public static String songDecoder(String song) {
        String[] array =  song.split("WUB");
        ArrayList<String> noSpaceArray = new ArrayList<>();
        for(String s : array) {
            if(!s.isEmpty()) {
                noSpaceArray.add(s);
            }
        }
        String[] result = new String[noSpaceArray.size()];

        for(int i = 0; i < result.length; i++) {
            result[i] = noSpaceArray.get(i);
        }

        return String.join("-", result);
    }

    public static void main(String[] args) {

        System.out.println(songDecoder("RWUBWUBWUBLWUB"));
    }
}


/*
        String[] array =  song.split("WUB");
        return String.join("", array);
 */

/*

 */