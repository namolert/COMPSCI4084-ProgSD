def show_menu():
    print("1) Add a name to the list")
    print("2) Change the name in the list")
    print("3) Delete the name from the list")
    print("4) View all the names in the list")
    print("Press 'q' to end the program")

def add(name_list, name):
    name_list.append(name)
    return name_list

def change(name_list, idx):
    new_name = str(input("Enter a new name: "))
    name_list[idx] = new_name
    return name_list

def delete(name_list, name):
    name_list.remove(name)
    return name_list

def view(name_list):
    for name in name_list:
        print(name)

action = str(input("Enter your choice (1/2/3/4/q): "))
name_list = []

while action != 'q':
    if action == '1':
        name = str(input("Enter a name: "))
        name_list = add(name_list, name)
    elif action == '2':
        name = str(input("Enter an name to change: "))
        if name in name_list:
            idx = name_list.index(name)
            name_list = change(name_list, idx)
        else:
            print("This name isn't appear on the list")
    elif action == '3':
        name = str(input("Enter an name to delete: "))
        if name in name_list:
            name_list = delete(name_list, name)
        else:
            print("This name isn't appear on the list")
    elif action == '4':
        view()
    else:
        print("Incorrect input! Try again")
    
    action = str(input("Enter your choice (1/2/3/4/q): "))

print("End")