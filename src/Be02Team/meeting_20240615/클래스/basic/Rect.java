package Be02Team.meeting_20240615.클래스.basic;

public class Rect {

  private int width;
  private int height;

  public Rect() {}

  public Rect(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int round(int width, int height) {
    return (width*2) + (height*2);
  }

  public int area(int width, int height) {
    return width*height;
  }

}
