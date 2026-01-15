public class PlayCard {
    public static void main(String[] args) {
        String[][] cards = new String[5][13];
        cards[0]=new String[]{"大王","小王"};
        String[] types = {"黑桃", "红桃", "梅花", "方块"};
        String[] playCards = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        for (int i = 1; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                cards[i][j]=types[i-1]+playCards[j];
            }
        }
        for (String[] card : cards) {
            for (String s : card) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }
    }
}
