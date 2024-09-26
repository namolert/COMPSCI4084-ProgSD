MYLIST = [[2, 5, 8], [3, 7, 4], [1, 6, 9], [4, 2, 0]]

user_row = int(input("Enter row: "))
print(MYLIST[user_row])

user_col = int(input("Enter column: "))
print(MYLIST[user_row][user_col])

is_change = str(input("Want to change value?: "))
if is_change == "y":
    new_val = int(input("Enter new value: "))
    MYLIST[user_row][user_col] = new_val
print(MYLIST[user_row])
