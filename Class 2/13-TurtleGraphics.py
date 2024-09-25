from turtle import Turtle
from random import random
import keyboard

t = Turtle()
t.screen.title('Object-oriented turtle demo')
t.screen.bgcolor("orange")

for i in range(100):
    steps = int(random() * 100)
    angle = int(random() * 360)
    t.right(angle)
    t.fd(steps)

    if keyboard.is_pressed("q"):
        t.bye()
        break

t.screen.mainloop()