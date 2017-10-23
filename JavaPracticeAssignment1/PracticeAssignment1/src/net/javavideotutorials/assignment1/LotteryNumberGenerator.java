package net.javavideotutorials.assignment1;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class LotteryNumberGenerator 
{

  /**
   * This method should return a Set of 6 different
   * integers.  
   * 
   * Hint: use the 'Random' class located here: java.util.Random
   *       to generate random numbers
   * @return
   */
  public Set<Integer> generateLotteryNumbers ()
  {
    Set<Integer> lotteryNumbers = new HashSet<Integer>();

    Random random = new Random();

    while (lotteryNumbers.size() < 6)
    {
        lotteryNumbers.add(random.nextInt(49) + 1);
    }

    return lotteryNumbers;
  }
}
