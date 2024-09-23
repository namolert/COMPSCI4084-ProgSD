def ask_num():
    return int(input("Enter a number: "))

def one_count(num):
    return num + 1

num = ask_num()
print(f"Next number is {one_count(num)}")