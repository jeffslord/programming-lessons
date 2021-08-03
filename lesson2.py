class Fruit:
    def __init__(self, name, moldy, color):
        self.name = name
        self.moldy = moldy
        self.color = color

    @staticmethod
    def listFruits():
        print("Apple", "Banana", "Orange")

    def printInfo(self):
        print(
            "Name: {}\nMoldy: {}\nColor: {}".format(self.name, self.moldy, self.color)
        )


apple = Fruit("Apple", True, "Green")
apple.printInfo()

Fruit.listFruits()
