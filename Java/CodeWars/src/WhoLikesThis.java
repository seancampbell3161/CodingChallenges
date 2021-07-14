public class WhoLikesThis {

    public static String whoLikesIt(String... names) {

        int remainingLikes = names.length - 2;

        return names.length == 0 ? "no one likes this" : names.length == 1 ?
                String.format("%s likes this", names[0]) : names.length == 2 ?
                String.format("%s and %s like this", names[0],names[1]) : names.length == 3 ?
                String.format("%s, %s and %s like this", names[0],names[1],names[2]) :
                String.format("%s, %s and %d others like this", names[0],names[1],remainingLikes);

    }

    public static void main(String[] args) {

        WhoLikesThis test = new WhoLikesThis();
        String[] people = {"Peter", "John", "James", "Mary", "Joseph"};

        System.out.println(whoLikesIt(people));
    }
}
