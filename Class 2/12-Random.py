import random
COLORS = ["red", "yellow", "blue", "green", "black"]
for e in COLORS:
    print(e)
rand_color = random.choice(COLORS)
user_choice = str(input("Choose one color: "))

while user_choice != rand_color:
    if rand_color == "red":
        print("Loving him is red - said by Taylor Swift")
    elif rand_color == "yellow":
        print("Look at the star, look how they shine for you")
    elif rand_color == "blue":
        print("Why you so blue")
    elif rand_color == "green":
        print("What's the color of the Hulk?")
    elif rand_color == "black":
        print("Where's the light goes?")
    user_choice = str(input("Choose a color again: "))

print("Well done")