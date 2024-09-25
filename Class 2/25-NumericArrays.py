from array import *
from random import *

com_arr = array('f', [])
for i in range(5):
    com_arr.append(round(uniform(10, 100), 2))
print(com_arr)

print("something")