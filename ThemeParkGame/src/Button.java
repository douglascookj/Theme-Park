public class Button {
private String color;
private int height;
private int width;

private boolean isClicked;

public Button(String color, int height, int width){
    setColor(color);
    setHeight(height);
    setWidth(width);
}

public String getColor() {
    return color;
  }

  
  public void setColor(String color) {
    this.color = color;
  }

  public int getHeight() {
    return height;
  }

  
  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  
  public void setWidth(int width) {
    this.width = width;
  }

}
