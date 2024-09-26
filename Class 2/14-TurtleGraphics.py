import turtle
import random

COLOURS = ["red", "blue", "yellow", "green", "purple", "orange"]

screen = turtle.Screen()

t = turtle.Turtle()
t.speed(1)

sides = 8
angle = 360 / sides

for i in range(sides):
    t.color(random.choice(COLOURS))
    t.forward(100)
    t.right(angle) 

t.hideturtle()

screen.exitonclick()