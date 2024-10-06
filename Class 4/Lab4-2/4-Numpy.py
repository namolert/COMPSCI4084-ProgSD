import numpy as np
arr = np.arange(0, 10, 1)
print(arr[4])
print(arr[-1])

arr2 = arr[1:].reshape((3, 3))
print(arr2[1, 2])
print(arr2[0, :])
print(arr2[:, 0])