public int makeChocolate(int small, int big, int goal) {
    big = big*5; //one big equals 5 smalls;
  int remain = 0;
  if (goal<= big + small){  
    return remain = goal-big; //if it is possible to make chocolate returns remain 
  }else{
    return -1;
  }
}
