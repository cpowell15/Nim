public class RandomNim //creates the class
{
  public RandomNim(int startnum)
  {
  }
  public int play(int pieces) //contains the formulas for the computer to choose how many pieces
  {
    if ((pieces - 2) % 3 == 0) //if remainder of pieces after taking two is three, take one
      return 1;
    if ((pieces - 1) % 3 == 0) //if remainder of pieces after taking one is three, take two
      return 2;
    else
      return 2; //otherwise, take two
  }
}