import numpy as np
Z_ARR = np.arange(0, 20, 2)
A_ARR = np.linspace(10, 50, 5)

def check_zero(arr):
    return "None of the elements is zero?: " + str(np.all(arr))

print(check_zero(Z_ARR))
print(check_zero(A_ARR))