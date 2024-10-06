import numpy as np
arr = np.random.random((5, 5))
print(arr[arr[:, 3] > 0.5])
print(arr[1,:])