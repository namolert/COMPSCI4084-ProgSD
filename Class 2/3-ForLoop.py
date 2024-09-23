direction = str(input("Which direction to count? (up/down): "))
if direction == "up":
    top_num = int(input("Enter top number: "))
    if top_num >= 1:
        for i in range(1, top_num + 1):
            print(i)
    else:
        print("Incorrect top number!")
elif direction == "down":
    bot_num = int(input("Enter bottom number: "))
    if bot_num <= 20:
        for i in range(20, bot_num - 1, -1):
            print(i)
    else:
        print("Incorrect bottom number!")
else:
    print("I don't understand")