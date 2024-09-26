import csv
import random

FNAME = "Score.csv"

# Can be randomly generate all the questino 
MATH_QUIZ = [
    ("1 + 5 = ?", 6),
    ("34 - 4 * 3 = ?", 22),
    ("55 % 9 = ?", 1),
    ("What is the smallest prime number?", 2),
    ("4! = ?", 24),
    ("122 // 11 = ?", 11)
]

score = 0
user_name = str(input("Enter your name: "))
q1, q2 = random.sample(MATH_QUIZ, 2)
print("Q1: " + q1[0])
ans1 = int(input("Answer: "))
if ans1 == q1[1]:
    score += 1
print("Q2: " + q2[0])
ans2 = int(input("Answer: "))
if ans2 == q2[1]:
    score += 1

qa1 = "Q1: " + q1[0] + " Ans: " + str(ans1)
qa2 = "Q2: " + q2[0] + " Ans: " + str(ans2)
fin_score = "Score: " + str(score)

scoref = open(FNAME, 'a')
new_record = user_name + ',' + qa1 + ',' + qa2 + ',' + fin_score + "\n"
scoref.write(str(new_record))
scoref.close()