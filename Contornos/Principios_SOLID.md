# S- Single Responsibility Principle (SRP)

Hace referencia al diseño de nuestras clases ya que una clase debe tener una única responsabilidad.
Si en vez de una clase para cada tarea creamos una clase grande que las abarca nos encontraremos con:

- Una clase muy propensa a cambios, que se puede volver muy compleja y por ello muy propensa a errores.
- Una clase muy compleja a la hora de testearla ya que al ser grande los test serán largos e ineficientes y nos tocara modificar mas cantidad mas a menudo.
- El codigo crecerá mucho y de forma descontrolada haciendo cada vez mas complicado añadir funcionalidaddes.

Codigo Incorrecto

```java
class Vehiculo{
	String getMarca() { … }
	String getMatricula() { … }
    Date[] getFechasMultas(){ … }
    float[] getImportesMulta(){ … }
}
```

Codigo Correcto

```java
class Vehiculo{
	String getMarca() { … }
	String getMatricula() { … }

	Multa[] multas;

}

class Multa{
	Date getFecha() { … };
	float getImporte(){ … };
	float getTipo(){ ... };
}

```

# O- Open Closed Principle (OCP)

Una clase debe estar abierta a extensiones pero cerrada a modificaciones o lo que es lo mismo, el comportamiento de una clase debe ser alterado sin tener que modificar su código fuente.

Para esto la inyección de dependencias y el polimorfismo es crucial.

Codigo Incorrecto

```java
public class Sql {
	public Sql (String table, Column[] columns) {...}
	public String insert (Object[] fields) {...}
	public String findByKey (String keyColumn, String keyValue) {...}
	public String select (Criteria criteria) {...}
}
```

Codigo Correcto

```java
Correcto
abstract class Sql {
	public Sql (String table, Column[] columns) {...}
	public abstract String generate();
}

public class InsertSql extends Sql {
	public InsertSql (String table, Column[] columns, Object[] fields) {...}
	public String generate () {...}
}

public class FindByKeySql extends Sql {
	public FindByKeySql (String table, Column[] columns, String keyColumn, String keyValue) {...}
	public String generate () {...}
}
```

# L- Liskov Substitution Principle (LSP)

Una clase derivada no debe modificar el comportamiento de la clase base.

Codigo Incorrecto

```java
abstract class Ave{
	abstract void volar();
}

class Aguila extends Ave{
@Override
	void volar() {
		...
	}
}
class Pinguino extends Ave{
	@Override
void volar() {
		System.out.println("No puedo volar");
	}
}
```

Codigo Correcto

```java
abstract class Ave{

}

interface Voladora{
	void volar();
}

class Aguila extends Ave implements Voladora{
	@Override
	public void volar() {

	}
}

class Pinguino extends Ave{

}

```

# I- Interface Segregation Principle (ISP)

Una clase que implementa una interfaz no debe depender de métodos que no utiliza, lo que implica generalmente interfaces mas sencillas y con pocos metodos.

Codigo Incorrecto

```java
interface Ave{
	void comer();
	void nadar();
	void volar();
	void correr();
}

class Avestruz implements Ave{
	@Override public void comer() {}
	@Override public void nadar() {}
	@Override public void volar() {}
	@Override public void correr() {}
}

class Loro implements Ave{
	@Override public void comer() {}
	@Override public void nadar() {}
	@Override public void volar() {}
	@Override public void correr() {}
}
class Pinguino implements Ave{
	@Override public void comer() {}
	@Override public void nadar() {}
	@Override public void volar() {}
	@Override public void correr() {}
}
```

Codigo Correcto

```java
abstract class Ave{
	abstract void comer();
}
interface iCorredor{
	void correr();
}

interface iNadador{
	void nadar();
}
interface iVolador{
	void volar();
}

class Avestruz extends Ave implements iCorredor{
	@Override public void comer() {}
	@Override public void correr() {}
}

class Gaviota extends Ave implements iVolador, iNadador{
	@Override public void comer() {}
	@Override public void nadar() {}
	@Override public void volar() {}
}
class Pinguino extends Ave implements iNadador{
	@Override public void comer() {}
	@Override public void nadar() {}
}
```

# -D Dependency Inversion Principle (DIP)

Las clases de alto nivel, no deben depender de clases de bajo nivel si no que ambos deben depender de abstracciones.

Además las abstracciones no deben depender de los detalles, si no que los detalles deben depender de las abstracciones.

Codigo Incorrecto

```java
class Factura implements Imprimible{
}
class Carta implements Imprimible{
}
class Prospector implements Imprimible{
}

class Impresora{
    public Impresora(Factura f){

    }

}

```

Codigo Correcto

```java
interface Imprimible{

}

class Factura implements Imprimible{
}
class Carta implements Imprimible{
}
class Prospector implements Imprimible{
}


public class Impresora{
    public Impresora(Imprimible f){

    }
}

```
