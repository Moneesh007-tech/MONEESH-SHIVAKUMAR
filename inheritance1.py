#class Human:
 #   def eat(self):
  #      print('I can eat')
   # def work(self):
    #    print('I can work')
#class male(Human):
 #   def flirt(self):
  #      print('I can flirt')
   # def work(self):
    #    super().work()
     #   print('I can code well')
    #def eat(self):
     #   super().eat()
      #  print('I love biriyani')


#male_1=male()
#male_1.flirt()
#male_1.work()
#male_1.eat()





#super= To indicate both the sentence of same class and to add a new one.


class Human:
    def __init__(self):
        self.num_eyes = 2
        self.num_nose = 1

    def eat(self):
        print('I can eat')
    def work(self):
        print('I can work')
class male(Human):
    def __init__(self,name):
        super().__init__()
        self.name=name

    def work(self):
        super().work()
        print('I can code well')
    def eat(self):
        super().eat()
        print('I love biriyani')


male_1=male('Moneesh')
#male_1.flirt()
#male_1.work()
#male_1.eat()

print(male_1.name)
print(male_1.work())













