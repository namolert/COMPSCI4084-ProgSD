import random
COLORS = ["red", "yellow", "blue", "green", "black"]
for e in COLORS:
    print(e)
rand_color = random.choice(COLORS)
user_choice = str(input("Choose one color: "))

while user_choice != rand_color:
    if rand_color == "red":
        print("I couldn't focus on the face, but I saw the glowing red eyes from you.")
    elif rand_color == "yellow":
        print("What do I want? I think maybe the yellow Lamborghini.")
    elif rand_color == "blue":
        print("Most of the tracks have a blues feeling to them each very downbeat.")
    elif rand_color == "green":
        print("What's the color of the Hulk?")
    elif rand_color == "black":
        print("You were wearing a hoodie and dressed in black, including gloves.")
    user_choice = str(input("Choose a color again: "))

print("Well done")