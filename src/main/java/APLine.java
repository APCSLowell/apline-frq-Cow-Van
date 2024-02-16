public class APLine
{
  /* your code here */
  private final int a;
  private final int b;
  private final int c;

  public APLine(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getSlope() {
    return (double) -a / b;
  }

  public boolean isOnLine(int x, int y) {
    return (a * x + b * y + c) == 0;
  }
}
/*
  .--.            .--.
 ( (`\\."--``--".//`) )
  '-.   __   __    .-'
   /   /__\ /__\   \
  |    \ 0/ \ 0/    |
  \     `/   \`     /
   `-.  /-"""-\  .-`
     /  '.___.'  \
     \     I     /
      `;--'`'--;`
jgs     '.___.'
*/
