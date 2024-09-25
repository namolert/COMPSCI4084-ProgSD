from array import *

num1, num2, num3, num4, num5 = str(input("Enter five numbers: ")).split()
nums = array('i', [int(num1), int(num2), int(num3), int(num4), int(num5)])

nums = sorted(nums)
nums.reverse()
print(f"The reverse sorted array is {nums}")