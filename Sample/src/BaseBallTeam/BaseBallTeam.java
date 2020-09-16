package BaseBallTeam;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam(String sn, int iw,int il,int id) {
      name = sn;
      win = iw;
      lose = il;
      draw = id;
    }

    public String getName() {
      return name;
    }
    public void setName(String sn) {
      name = sn;
    }

    public int getWin() {
      return win;
    }
    public void setWin(int iw) {
      win = iw;
    }

    public int getLose() {
      return lose;
    }
    public void setLose(int il) {
      lose = il;
    }

    public int getDraw() {
      return draw;
    }
    public void setDraw(int id) {
      draw = id;
    }

    public double getRate() {
      return (double) win / (win + lose);
    }

    public void report(){
      int year = 2019;
      System.out.printf(
        "%s の%d年の成績は %d勝 %d敗 %d分、勝率は %1.6fです。%n",
        getName(),year,getWin(),getLose(),getDraw(),getRate());
    }
  }
