class Lote:
  pi = 3.14
  def __init__(self, diameter):
    self.radius = diameter / 2
  def area(self):
    return self.pi * self.radius ** 2
  def perimeter(self):
    return self.pi * 2 * self.radius

lote = Lote(9)
print("Area del lote", lote.area())
print("Perimetro del lote",lote.perimeter())
