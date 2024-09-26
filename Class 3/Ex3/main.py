FNAME = "Salaries.csv"

def add():
    outf = open(FNAME, 'a')
    user_name = str(input("Enter your name: "))
    user_salary = str(input("Enter your salary: "))
    salary = user_name + ',' + user_salary + '\n'
    outf.write(salary)
    outf.close()

def view():
    inf = open(FNAME, 'r')
    for line in inf:
        print(line.strip("\n"))
    inf.close()
    
def quitp():
    return

def menu():
    print("1) Add to file")
    print("2) View all records")
    print("3) Quit programme")

menu()
user_input = int(input("Enter the number of your selection: "))

while True:
    if user_input < 1 or user_input > 3:
        print("\nInvalid number!\n")
        user_input = int(input("Try again (1/2/3): "))
    else:
        if user_input == 1:
            add()
        elif user_input == 2:
            view()
        elif user_input == 3:
            quitp()
            break
    menu()
    user_input = int(input("Enter the number of your selection: "))