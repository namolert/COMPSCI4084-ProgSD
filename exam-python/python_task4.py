import sqlite3

DB_PATH = "D:/sqlite DB/mock-exam.db"
f = open("Booklist.txt", "w")

with sqlite3.connect(DB_PATH) as db:
    cursor = db.cursor()

user_input = str(input("Enter an author's name: "))

cursor.execute(
"""
SELECT * FROM Books
WHERE "Author"=?
""",
[user_input]
)

for e in cursor.fetchall():
    print(e)
    f.write(f"{e[0]}-{e[1]}-{e[2]}-{e[3]}\n")

f.close()