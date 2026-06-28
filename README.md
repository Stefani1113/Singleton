## Actividad de reflexión 

1. ¿Qué problema busca solucionar el patrón Singleton?
Evita que cada clase tenga que crear si popia instancia haciendo que multiples objetos ocupen memoria y manejen información diferente.

2. ¿Por qué es importante garantizar que una clase tenga una única instancia en determinados escenarios?
Por que asi se evitara que en cada clase se cree una nueva instancia y esta creara una instancias estática que sera accesible de forma global.

3. ¿Qué características identifican a una clase implementada mediante el patrón Singleton?
Tiene una instancia estática, un constructor privado y un metodo para obtener la instancia.

4. ¿Cuál es la diferencia entre crear múltiples instancias de una clase y utilizar una única instancia compartida?
La diferencia esta en que la las multiples intancias pueden de una clase pueden crear copias innecesarias, mientras que una instancia compartida puede ser usada en muchas clases sin duplicar información innecesaria.

5. ¿Cómo implementa Spring Boot el comportamiento del patrón Singleton en sus Beans?
Spring boot crea una sola instancia de cada Bean y la guarda en el contenerdor de Spring, cuando otra clase necesita el Bean Spring entrega la misma instancia.

6. ¿Qué ventajas ofrece utilizar Beans Singleton administrados por Spring Boot frente a implementar el patrón manualmente en Java?
Los Beans son más fáciles de usar ya que Spring es el encargado de crear, administrar y compartir la instancia automáticamente. Evitando más código y errores.

7. ¿En qué situaciones considera que el uso del patrón Singleton puede ser una buena alternativa dentro de una aplicación de software?
Puede ser una buena alternativa para: 
Gestionar la conexión a una base de datos 
Registro de eventos y logs



