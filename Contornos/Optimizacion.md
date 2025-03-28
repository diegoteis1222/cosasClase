# Tipos

- Coste temporal (Ct): tiempo de ejecución.
- Coste espacial (Ce): espacio de memoria RAM utilizado.

## Formas de optimizar

- Reutilización de expresiones comunes
- Reduce variables innecesarias.
- Elimina código innecesario de los bucles
- Pre-calcular expresiones constantes
- Reducir propagación de copias
- Crear métodos con pocos parámetros
- Eliminar redundancias en acceso matrices
- Tiempo de acceso
  - La encriptación y conexiones https tienen peor rendimiento.
  - La apertura de las bases de datos también tienen un rendimiento pobre.
  - El acceso al disco duro también tiene un alto coste
- Mejor multiplicar que dividir
- Eliminar el código muerto
- Reutilización de variables
- Nombrar como corresponde
  - camelCase: La primera letra de cada palabra nueva lleva mayúscula, a excepción de la primera. Ej unaFuncionCualquiera
  - Underscore: En la cual cada palabra es separada por un underscore o guión bajo. Ej una_funcion_cualquiera
  - KebabCase: Separamos cada palabra por un guión medio. Ej una-funcion-cualquiera
  - snake*case: Las palabras se separan por guiones bajo ( * ) sin espacios, con normalmente todas las palabras en minúscula. Usado en ocasiones en Ruby en la definición de variables y métodos. En las librerias estandar de C y C++
  - Hungarian (Systems) notation: iNumberOfPeople en esta notación precedemos con un caracter para indicar el tipo de variable (Ej i=integer)
  - Hungarian (Apps) notation: cntNumberOfPeople: En este caso precedemos la variable de un prefijo indicando su aplicación: (Ej cnt = variable usada como contador)
- Intenta evitar la creación de objetos de Java
- Trata de usar variables locales
- Evita el uso de métodos sincronizados (si es posible)
- Usar desplazamiento de bits en lugar de divisiones
- Evitar concatenaciones de Strings
- Reutilizar y hacer pool de objetos siempre que sea posible
- Liberar recursos tan pronto como sea posible
- Referenciar a null instancias de objetos que ya no se van a usar
- Utilizar buffers para leer datos a través de la red y leer los datos en porciones en lugar de byte a byte
- Contar hacia atrás es más rápido en los bucles
- Cuando sea posible evitar bucles
