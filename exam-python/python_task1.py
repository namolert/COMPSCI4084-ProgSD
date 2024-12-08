import sqlite3

DB_PATH = "D:/sqlite DB/mock-exam.db"

with sqlite3.connect(DB_PATH) as db:
    cursor = db.cursor()

cursor.execute(
"""
CREATE TABLE "BookInfo" (
    "Name" TEXT NOT NULL,
    "Place of Birth" TEXT NOT NULL
)
"""
)

cursor.execute(
"""
CREATE TABLE "Books" (
    "ID" INTEGER NOT NULL,
    "Title" TEXT NOT NULL,
    "Author" TEXT NOT NULL,
    "Data Published" INTEGER NOT NULL,
    PRIMARY KEY("ID" AUTOINCREMENT)
)
"""
)

db.commit()