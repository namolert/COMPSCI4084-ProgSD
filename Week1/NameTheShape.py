SHAPE_NAME = ["Triangle", 
              "Quadrilateral",
              "Pentagon",
              "Hexagon",
              "Heptagon",
              "Octagon",
              "Nonagon",
              "Decagon"]

side_num = int(input("Enter a number of sides: "))

if side_num < 3 or side_num > 10:
    print("Incorrect number!")
else:
    print(f"The name of the shape is \"{SHAPE_NAME[side_num - 3]}\"")