class Father:
    def __init__(self,name):
        self.name=name

    def eat(self):
        print('I Dont waste food')
    def work(self):
        print('I can work well')
Father_1=Father('Shivakumar')
class son(Father):
    def __init__(self,name):
        self.name=name

    def work(self):
        print('I get more marks')
    def eat(self):
        print('I love biriyani')

Father_1=Father('Shivakumar')

print(Father_1.name)
Father_1.work()
Father_1.eat()

#print(son_1.name)
#print(son_1.work())
