from graphics import *

win = GraphWin()

input1 = Circle(Point(25, 50), 15)
input2 = Circle(Point(25, 125), 15)
hidden1 = Circle(Point(100, 50), 15)
hidden2 = Circle(Point(100, 125), 15)
output = Circle(Point(175, 87), 15)

input1.draw(win)
input2.draw(win)
hidden1.draw(win)
hidden2.draw(win)
output.draw(win)


weight11 = Line(input1.getRight(),hidden1.getLeft())
weight12 = Line(input1.getRight(),hidden2.getLeft())
weight21 = Line(input2.getRight(),hidden1.getLeft())
weight22 = Line(input2.getRight(),hidden2.getLeft())
weight1o = Line(hidden1.getRight(),output.getLeft())
weight2o = Line(hidden2.getRight(),output.getLeft())

weight11.setArrow("last")
weight12.setArrow("last")
weight21.setArrow("last")
weight22.setArrow("last")
weight1o.setArrow("last")
weight2o.setArrow("last")

weight11.setOutline("black")

weight11.draw(win)
weight12.draw(win)
weight21.draw(win)
weight22.draw(win)
weight1o.draw(win)
weight2o.draw(win)
