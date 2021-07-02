public class MethodOverride {

    static class Sports {

        String getName() {
            return "Generic Sports";
        }

        void getNumberOfTeamPlayers() {
            System.out.println("Each team has n players in" + getName());
        }
    }

    static class Soccer extends Sports {

        @Override
        String getName() {
            return "Soccer Class";
        }

        @Override
        void getNumberOfTeamPlayers() {
            System.out.println("Each team has 11 players in" + getName());
        }
    }

    public static void main(String[] args) {
        Soccer soccer = new Soccer();
        soccer.getNumberOfTeamPlayers();
    }
}
