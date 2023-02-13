class Solution{
  public int[] runningSum(int[] nums) {
    int[] myArray = new int[nums.lenght];
    int num = 0;
    for (int i = 0; i < nums.lenght; i++) {
      nums += nums[i];
      myArray[i] = num;
      
    }
    return myArray;
  } 
}


---Notes
num = 1   num = 3

myArray[1,2,3,4]

myArray[1,0,0,0]  myArray[1,3,0,0]


