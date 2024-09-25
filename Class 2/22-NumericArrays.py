from array import *
from random import *

num1, num2, num3 = str(input("Enter three numbers: ")).split()
user_arr = array('i', [int(num1), int(num2), int(num3)])

com_arr = array('i', [])
for i in range(5):
    com_arr.append(randint(0, 100))

user_arr.extend(com_arr)
new_arr = sorted(user_arr)

for e in new_arr:
    print(e)