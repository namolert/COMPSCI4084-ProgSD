total = 0

while True:
    user_input = input("Enter a number: ")
    if user_input == "_":
        break
    try:
        number = int(user_input)
        total += number
    except ValueError:
        try:
            number = float(user_input)
            total += number
        except ValueError:
            print("Invalid number!")
            
    print(total)
    