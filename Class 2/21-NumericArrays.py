import random
from array import *

nums = array('i', [])
for i in range(5):
    rand_num = random.randint(0, 100)
    nums.append(rand_num)

nums = sorted(nums)

for e in nums:
    print(e)
