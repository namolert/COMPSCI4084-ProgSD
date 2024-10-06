import numpy as np
arr = np.arange(0, 10, 1)
print(arr)
print(arr[arr > 5])
print(arr[arr % 2 == 0])

arr2 = np.arange(1, 17, 1)
arr2 = arr2.reshape((4, 4))
print(arr2)
print(arr2[[0, 1, 2, 3], [0, 2, 3, 1]])