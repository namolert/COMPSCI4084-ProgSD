total = 0
for i in range(5):
    num = float(input("Enter a number: "))
    is_included = str(input("Want to include? (y): ")).lower()
    if is_included == "y":
        total += num

print(f"The total is {total:.2f}")