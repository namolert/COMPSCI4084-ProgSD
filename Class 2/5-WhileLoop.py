COMPNUM = 50
count = 1
num = int(input("Enter a number: "))
while num != COMPNUM:
    count += 1
    if num > COMPNUM:
        print("Too high")
    else:
        print("Too low")
    num = int(input("Another guess: "))

print(f"Well done, you took {count} attempts")