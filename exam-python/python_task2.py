import sqlite3

DB_PATH = "D:/sqlite DB/mock-exam.db"

with sqlite3.connect(DB_PATH) as db:
    cursor = db.cursor()

user_input = str(input("Enter place of birth: "))


cursor.execute(
"""
SELECT * FROM BookInfo 
WHERE "Place of Birth"=?
""",
[user_input]
)

author_list = []
for e in cursor.fetchall():
    author_list.append(e[0])

for author in author_list:
    cursor.execute(
    """
    SELECT "Title", "Data Published" FROM Books
    WHERE "Author"=?
    """,
    [author]
    )

    for e in cursor.fetchall():
        print("")
        print(f"Title: {e[0]}")
        print(f"Data Published: {e[1]}")

