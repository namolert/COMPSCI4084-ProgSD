count_bottles = 10
print(f"There are {count_bottles} green bottles hanging on the wall,\
      {count_bottles} green bottle hanging on the wall,\
      and is 1 green bottle should accidentally fall\n")
num = int(input("How many green bottles will be hanging on the wall?: "))

while count_bottles != 1:
    if num == (count_bottles - 1):
        print(f"\nThere will be {num} green bottles hanging on the wall\n")
        count_bottles -= 1
    else:
        print(f"\nNo, try again\n")

    print(f"There are {count_bottles} green bottles hanging on the wall,\
      {count_bottles} green bottle hanging on the wall,\
      and is 1 green bottle should accidentally fall\n")
    num = int(input("How many green bottles will be hanging on the wall?: "))

print(f"\nThere are no more green bottles hanging on the wall\n")