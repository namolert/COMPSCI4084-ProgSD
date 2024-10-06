import numpy as np
arr1 = np.array([23, 45, 11, 5])
arr2 = np.array([23, 5, 1])
common_values = np.intersect1d(arr1, arr2)
print(common_values) 