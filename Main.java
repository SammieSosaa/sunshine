class Main{
  public static void sun() {
    System.out.println("shine");
  }
  public static void summer( int temp ) {
    if( temp > 100){ //changed temp
      System.out.print("*");
      temp -= 1;
      summer(temp);
    }
  }
  public static void main(String[] args){
    summer(91);
    sun();
  }
}
