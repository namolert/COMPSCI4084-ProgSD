import sqlite3

DB_PATH = "D:/sqlite DB/mock-exam.db"

with sqlite3.connect(DB_PATH) as db:
    cursor = db.cursor()

user_input = str(input("Enter a year: "))

cursor.execute(
"""
SELECT * FROM Books
WHERE "Data Published">?
ORDER BY "Data Published"
""",
[user_input]
)

for e in cursor.fetchall():
    print("")
    print(f"Title: {e[1]}")
    print(f"Author: {e[2]}")
    print(f"Data Published: {e[3]}")