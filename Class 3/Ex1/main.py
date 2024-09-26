FNAME = "Subjects.txt"

def create():
    outf = open(FNAME, 'w')
    subject = str(input("Enter the school subject: "))
    outf.write(subject)
    outf.close()

def display():
    inf = open(FNAME, 'r')
    lines = inf.readlines()
    for line in lines:
        print(line.strip("\n"))
    inf.close()
def add():
    outf = open(FNAME, 'a')
    subject = str(input("Enter the school subject: "))
    outf.write("\n" + subject)
    outf.close()

print("1) Creat a new file")
print("2) Display the file")
print("3) Add a new item to the file")
user_input = int(input("Select what to do (1/2/3): "))

while True:
    if user_input < 1 or user_input > 3:
        print("\nInvalid number!\n")
        user_input = int(input("Try again (1/2/3): "))
    else:
        if user_input == 1:
            create()
        elif user_input == 2:
            display()
        elif user_input == 3:
            add()
        break  