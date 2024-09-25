from array import *
from random import *

com_arr = array('i', [])
for i in range(5):
    com_arr.append(randint(0, 100))
print(com_arr)

while True:
    selected_num = int(input("Select one number from the array: "))
    if selected_num in com_arr:
        print(f"The position of this number is {com_arr.index(selected_num)}")
        break
    