import sqlite3

DB_PATH = "D:/sqlite DB/Class3.db"

with sqlite3.connect(DB_PATH) as db:
    cursor = db.cursor()

cursor.execute(
"""
CREATE TABLE "PhoneBook1" (
    "ID" INTEGER NOT NULL,
    "Firstname" TEXT NOT NULL,
    "Surname" TEXT NOT NULL,
    "Phone Number" TEXT,
    PRIMARY KEY("ID" AUTOINCREMENT)
);  
"""
)