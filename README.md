# Principios SOLID
## Single Responsability Principle
Aquí se demuestra el principio de responsabilidad única, donde cada clase tiene una única responsabilidad.

<img src="img.png"></img>
### Reflexiones
- De esta forma podemos tener un código más limpio y mantenible, a través de la separación de responsabilidades.
- Se puede tener un código más fácil de probar, ya que al tener una única responsabilidad, se pueden realizar pruebas unitarias de forma más sencilla.


## Open/Closed Principle
Este principio establece que una clase debe estar abierta para extensión, pero cerrada para modificación. Es decir, que una clase debe poder ser extendida sin necesidad de modificar su código fuente.
<img src="img_1.png"></img>

### Reflexiones
- Este principio nos permite tener un código más robusto y menos propenso a errores.
- Nos permite tener un código más mantenible, ya que al no tener que modificar el código fuente, se evitan errores en otras partes del código.
- Nos permite tener un código más escalable, ya que se pueden añadir nuevas funcionalidades sin tener que modificar el código fuente.

## Liskov Substitution Principle
Este principio establece que las clases derivadas deben poder ser sustituidas por sus clases base sin afectar el comportamiento del programa.
<img src="img_2.png"></img>

### Reflexiones
- Usar interfaces en lugar de herencia puede ser una buena forma de cumplir con este principio.
- Este principio nos permite tener un código más mantenible y escalable.
- Nos permite tener un código más fácil de probar, ya que al poder sustituir una clase derivada por su clase base, se pueden realizar pruebas unitarias de forma más sencilla.

## Interface Segregation Principle
Este principio establece que una clase no debe depender de interfaces que no utilice.
<img src="img_3.png"></img>

### Reflexiones
- Este principio es muy útil para evitar la dependencia de interfaces que no se utilizan.
- Nos permite tener un código más limpio y mantenible.
- Nos permite tener un código más escalable, ya que se pueden añadir nuevas interfaces sin afectar a las clases que no las utilizan.