from graphics import *

win = GraphWin()

Ginput1 = Circle(Point(25, 50), 15)
Ginput2 = Circle(Point(25, 125), 15)
Ghidden1 = Circle(Point(100, 50), 15)
Goutput = Circle(Point(175, 125), 15)

Ginput1.draw(win)
Ginput2.draw(win)
Ghidden1.draw(win)
Goutput.draw(win)


weighti11 = Line(Ginput1.getRight(),Ghidden1.getLeft())
weighti1o = Line(Ginput1.getRight(),Goutput.getLeft())
weighti21 = Line(Ginput2.getRight(),Ghidden1.getLeft())
weighti2o = Line(Ginput2.getRight(),Goutput.getLeft())
weight1o = Line(Ghidden1.getRight(),Goutput.getLeft())

weighti11.setArrow("last")
weighti1o.setArrow("last")
weighti21.setArrow("last")
weighti2o.setArrow("last")
weight1o.setArrow("last")


weighti11.draw(win)
weighti1o.draw(win)
weighti21.draw(win)
weighti2o.draw(win)
weight1o.draw(win)
