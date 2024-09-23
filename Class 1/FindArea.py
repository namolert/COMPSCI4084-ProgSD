print("1) Square")
print("2) Triangle")
num = int(input("Enter a number: "))
if num == 1:
    length = float(input("Enter length: "))
    print(f"The area is {length ** 2:.2f}")
elif num == 2: 
    base = float(input("Enter base: "))
    height = float(input("Enter height: "))
    print(f"The area is {0.5 * base * height:.2f}")
else:
    print("Incorrect input!")