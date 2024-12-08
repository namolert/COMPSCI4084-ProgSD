import numpy as np
arr1 = np.array([[23,45,11],[12,23,54],[1,23,10]])
arr2 = np.array([[3,5,1],[2,3,4],[9,1,5]])

print("hstack")
h_stack = np.hstack((arr1, arr2))
print(h_stack)

print("vstack")
v_stack = np.vstack((arr1, arr2))
print(v_stack)

print("hsplit")
A, B, C = np.hsplit(arr1, 3)
print(A)
print(B)
print(C)

A, B, C = np.hsplit(arr2, 3)
print(A)
print(B)
print(C)

print("vsplit")
A, B, C = np.vsplit(arr1, 3)
print(A)
print(B)
print(C)

A, B, C = np.vsplit(arr2, 3)
print(A)
print(B)
print(C)


x = np.arange(10)
[A, B, C] = np.split(x, [2, 1],  axis=0)
print(A)
print(B)
print(C)