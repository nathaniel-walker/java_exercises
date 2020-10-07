/**
* @author - Nathaniel Walker
* @version - 1.0
* date: 10/7/2020
*/

/**
* Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
*
* sameFirstLast([1, 2, 3]) --> false
* sameFirstLast([1, 2, 3, 1]) --> true
* sameFirstLast([1, 2, 1]) --> true
*/

package Array_1;

// Same_First_Last class
public boolean Same_First_Last(int[] nums) {
	// for loop iterating through array
  	for (int i = 0; i < nums.length; i++) {
  		// if the array is of length 1 or more and satisfies the conditions, return true
    		if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
      			return true;
    		}
  	}
  	// otherwise, return false
  	return false;
}
