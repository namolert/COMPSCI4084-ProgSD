import numpy as np
arr = np.arange(10, 20, 1)
print(arr)
print(arr[3:8])
print(arr[::2])

arr2 = np.arange(1, 17, 1)
arr2 = arr2.reshape((4, 4))
print(arr2)
print(arr2[1:3, 2:4])
print(arr2[:-2, :])
print(arr2[:, :2])
