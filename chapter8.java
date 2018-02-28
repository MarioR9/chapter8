public class chapter8 {

    public static void main(String[] args) {
        String[][] roster = new String[6][5];
        roster[4][4] = "nika";

        String[][] yellowPage = {{"shaheer", "571-365-4566"}, {"shahid", "703-224-5564"}, {"patrick", "571-256-4456"}};
        String[][][] threeD = new String[2][2][2];

        String[][][] yellowPages = {{{"shaheer", "571-365-4566"}, {"shahid", "703-224-5564"}, {"patrick", "571-256-4456"}},

                {{"shah", "571-365-4566"}, {"hid", "703-224-5564"}, {"pat", "571-256-4456"}}};

        for (int i = 0; i < yellowPages.length; i++) {
            for (int j = 0; j < yellowPages[i].length; j++) {
                for (int k = 0; k < yellowPages.length; k++) {
                    System.out.println(yellowPages[i][j][k]);
                }
            }
        }
    }
}