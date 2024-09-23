age = float(input("Enter your age: "))

if age < 0:
    print("Incorrect age!")
elif age >= 18:
    print("you can vote")
elif age == 17:
    print("You can learn how to drive")
elif age == 16:
    print("you can buy a lottery ticket")
else:
    print("You can go Trick-or-Treating")