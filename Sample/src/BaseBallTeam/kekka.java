package BaseBallTeam;

public class kekka {
    public static void main(String[] args) {
        BaseBallTeam[] BaseBallCatalog = {
          new BaseBallTeam("ジャイアンツ", 77, 64, 2),
          new BaseBallTeam("ベイスターズ", 71, 69, 3),
          new BaseBallTeam("タイガース", 69, 68, 6),
          new BaseBallTeam("カープ", 70, 70, 3),
          new BaseBallTeam("ドラゴンズ", 68, 73, 2),
          new BaseBallTeam("ヤクルト", 59, 82, 2),
        };
        for (int i = 0; i < BaseBallCatalog.length; i++) {
          BaseBallCatalog[i].report();
        }
      }
}
