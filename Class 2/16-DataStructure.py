import random

rand_list = random.sample(range(100, 999), 4)
for e in rand_list:
    print(e)

num = int(input("Enter a three-digit number: "))

if num in rand_list:
    print(f"The position of this number is {rand_list.index(num) + 1} in the list")
else:
    print("That's not in the list")