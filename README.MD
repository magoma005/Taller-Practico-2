# 🩺 Registro de Consultas y Diagnósticos Veterinarios

---

📄 Descripción
Este proyecto implementa un sistema básico en Java para registrar consultas veterinarias y sus respectivos diagnósticos. Está diseñado con principios de Programación Orientada a Objetos (POO), permitiendo asociar un diagnóstico a cada consulta y evaluar la longitud del tratamiento recomendado.

---

💻 Clases principales
1. Consulta.java
Representa una consulta veterinaria. Contiene:

Atributos:

codigo: Código identificador de la consulta.

fecha: Fecha en la que se realizó.

diagnostico: Objeto de tipo Diagnostico asociado a la consulta.

Métodos principales:

mostrarConsulta(): Imprime los datos completos de la consulta, incluyendo su diagnóstico y tratamiento, e indica si el tratamiento es largo.

2. Diagnostico.java
Representa el diagnóstico de una consulta. Contiene:

Atributos:

descripcion: Descripción breve del diagnóstico.

tratamiento: Recomendación de tratamiento.

Métodos principales:

esTratamientoLargo(): Retorna true si el tratamiento tiene más de 30 caracteres, indicando que requiere seguimiento.

3. Main.java
Clase de prueba para instanciar objetos Diagnostico y Consulta, mostrando su información en consola. Demuestra:

Creación de un diagnóstico.

Creación de una consulta asociada a dicho diagnóstico.

Ejecución del método mostrarConsulta() para imprimir los detalles.

---

🚀 Tecnologías utilizadas
Lenguaje: Java

Paradigma: Programación Orientada a Objetos (POO)

IDE sugerido: IntelliJ IDEA o NetBeans



---

✨ Propósitos académicos
Este proyecto fue desarrollado para:

Reforzar el uso de clases y objetos.

Aplicar relaciones de composición (Consulta contiene un Diagnostico).

Practicar getters, setters y métodos personalizados.

Implementar condicionales basadas en métodos booleanos.

