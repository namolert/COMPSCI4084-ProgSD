import sqlite3

DB_PATH = "D:/sqlite DB/Class3.db"

with sqlite3.connect(DB_PATH) as db:
    cursor = db.cursor()

def menu():
    print("Main menu")
    print("1) View phone book")
    print("2) Add to phone book")
    print("3) Search for surname")
    print("4) Delete person from phone book")
    print("5) Quit")

def view():
    cursor.execute("SELECT * FROM PhoneBook1")
    print(cursor.fetchall())

def add():
    new_firstname = str(input("Enter your firstname: "))
    new_surname = str(input("Enter your surname: "))
    new_phone_no = str(input("Enter your phone number: "))
    cursor.execute(
    """
    INSERT INTO 
        PhoneBook1("Firstname", "Surname", "Phone Number")
    VALUES
        (?, ?, ?)
    """, (new_firstname, new_surname, new_phone_no)
    )
    db.commit()

def search():
    search_surname = str(input("Enter the surname: "))
    cursor.execute("SELECT * FROM PhoneBook1 WHERE surname=?", [search_surname])
    print(cursor.fetchall())

def delete():
    delete_id = int(input("Enter id: "))
    cursor.execute("DELETE FROM PhoneBook1 WHERE ID=?", [delete_id]) 
    db.commit()

def decision(number):
    if number == 1:
        view()
    elif number == 2:
        add()
    elif number == 3:
        search()
    elif number == 4:
        delete()
    else:
        print("\nInvalid number!\n")
    return

while True:
    menu()
    user_input = input("Enter your selection: ")
    if user_input == "5":
        break
    try:
        number = int(user_input)
        decision(number)
    except ValueError:
        print("\nInvalid input!\n")