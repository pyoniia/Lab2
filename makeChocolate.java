public int makeChocolate(int small, int big, int goal) {
    big = big*5; //one big equals 5 smalls;
  int remain = 0;
  if (goal<= big + small){  
    remain = goal%=big; // modulo, goal divided by big gives remaining
    return remain = remain; 
  }else{
    return -1;
  }
}
