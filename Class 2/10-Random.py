import random

COIN = ['h', 't']
flip = random.choice(COIN)
user_choice = str(input("Enter your choice (h/t): "))
if user_choice == flip:
    print("You win")
else:
    print("Bad Luck")

print(f"The computer choose {flip}")