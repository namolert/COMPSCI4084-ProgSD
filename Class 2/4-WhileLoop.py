total = 0
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))
total = num1 + num2
is_continue = str(input("Add another number? (y): "))

while is_continue == "y":
    num = float(input("Enter another number: "))
    total += num
    is_continue = str(input("Add another number? (y): "))

print(f"The total is {total:.2f}")