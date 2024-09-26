import csv

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

def delete():
    listf = list(csv.reader(open(FNAME)))
    user_name = str(input("Enter your name: "))
    temp = []
    for line in listf:
        if line[0] != user_name: 
            temp.append(line)

    outf = open(FNAME, 'w')
    for nline in temp:
        salary = nline[0] + ',' + nline[1] + '\n'
        outf.write(salary)
    outf.close()

def quitp():
    return

def menu():
    print("1) Add to file")
    print("2) View all records")
    print("3) Delete a record")
    print("4) Quit programme")
    
menu()
user_input = int(input("Enter the number of your selection: "))

while True:
    if user_input < 1 or user_input > 4:
        print("\nInvalid number!\n")
        user_input = int(input("Try again (1/2/3/4): "))
    else:
        if user_input == 1:
            add()
        elif user_input == 2:
            view()
        elif user_input == 3:
            delete()
        elif user_input == 4:
            quitp()
            break
    menu()
    user_input = int(input("Enter the number of your selection: "))