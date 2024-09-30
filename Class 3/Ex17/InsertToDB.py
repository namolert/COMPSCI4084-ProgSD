import sqlite3

DB_PATH = "D:/sqlite DB/Class3.db"

with sqlite3.connect(DB_PATH) as db:
    cursor = db.cursor()

# cursor.execute(
# """
# INSERT INTO PhoneBook1("ID", "Firstname", "Surname", "Phone Number")
# VALUES(1, "Simon", "Pierre", "01426789056")
# """
# )

# cursor.execute(
# """
# INSERT INTO PhoneBook1("Firstname", "Surname", "Phone Number")
# VALUES("Katarina", "Iglesias", "02034567078")
# """
# )

# cursor.execute(
# """
# INSERT INTO 
#     PhoneBook1("Firstname", "Surname", "Phone Number")
# VALUES
#     ("Derrick", "Brown", "0122345 8765"),
#     ("John", "Smith", "01126532312"),
#     ("Mark", "Isaac", "01416571383")
# """
# )

db.commit()