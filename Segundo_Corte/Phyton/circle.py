class Circle:
  pi = 3.14
  def __init__(self, diameter):
    self.radius = diameter / 2
  def area(self):
    return self.pi * self.radius ** 2
  def perimeter(self):
    return self.pi * 2 * self.radius

medium_pizza = Circle(34)
print("Area media pizza", medium_pizza.area())
print("Perimetro media pizza",medium_pizza.perimeter())


