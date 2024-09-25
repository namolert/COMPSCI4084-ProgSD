from array import *
from random import *

num1, num2, num3, num4, num5 = str(input("Enter five numbers: ")).split()
user_arr = array('i', [int(num1), int(num2), int(num3), int(num4), int(num5)])
user_arr = sorted(user_arr)
print(f"Your array is {user_arr}")

selected_num = int(input("Which to remove?: "))
user_arr.remove(selected_num)
new_arr = user_arr.copy()
print(new_arr)