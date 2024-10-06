import numpy as np
lst1 = [1, 2, 3, 4, 5]
lst2 = [6, 7, 8, 9, 10]

print("FOR LIST\n")

print("Concat")
print(lst1 + lst2)

print("Slicing")
lst1 = lst1[1:3] 
print(lst1)

print("Indexing")
print(lst2[-2])

print("Append")
lst2.append(11)
print(lst2)

print("Insert")
lst1.insert(2, 999)
print(lst1)

print("\nFOR ARRAY\n")

arr1 = np.array(lst1)
arr2 = np.array(lst2)
print("Element-Wise Sum")
print(arr1 + arr2[:3])

print("Element-Wise Mult")
print(arr1 * arr2[:3])
