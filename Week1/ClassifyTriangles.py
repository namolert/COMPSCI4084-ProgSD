a, b, c = map(int, input("Enter the lengths of three sides: ").split())

if a <= 0 or b <= 0 or c <= 0:
    print("Incorrect number!")
elif a == b or b == c or c == a:
    if a == b and b == c:
        print("This is \"Equilateral Triangle\"")
    else:
        print("This is \"Isosceles Triangle\"")
else:
    print("This is \"Scalene Triangle\"")