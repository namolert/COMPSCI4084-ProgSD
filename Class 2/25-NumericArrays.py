from array import *
from random import *

com_arr = array('d', [])
for i in range(5):
    com_arr.append(round(uniform(10, 100), 2))

user_input = float(input("Enter any number between 2 and 5: "))
while True:
    if user_input < 2 or user_input > 5:
        print("Invalid number!")
        user_input = float(input("Try again: "))
    else:
        for e in com_arr:
            print(round(e/user_input, 2))
        break