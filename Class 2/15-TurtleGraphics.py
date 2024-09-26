import turtle
import random

screen = turtle.Screen()

t = turtle.Turtle()
t.speed(1)

num_lines = random.randint(2, 20)

for i in range(num_lines):
    length = random.randint(10, 200)
    t.forward(length)
    angle = random.randint(1, 359)
    t.right(angle)

t.hideturtle()

screen.exitonclick()