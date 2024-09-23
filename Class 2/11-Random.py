import random

rand_num = random.randint(1, 5)
first_choice = int(input("Enter your number between 1 to 5: "))
if first_choice == rand_num:
    print("Well done")
else:
    if first_choice > rand_num:
        print("Too high")
    else:
        print("Too low")
    second_choice = int(input("Enter your number again: "))
    if second_choice == rand_num:
        print("Correct")
    else: 
        print("You lose")

print(f"The computer choose {rand_num}")