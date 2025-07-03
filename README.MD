# 🩺 Sistema de Consultas y Diagnósticos

Este proyecto implementa un sistema básico de gestión de consultas médicas y sus respectivos diagnósticos, desarrollado en **Java** como práctica de programación orientada a objetos.

---

## 📌 **Descripción general**

El sistema permite registrar consultas médicas, cada una asociada a un diagnóstico que incluye su descripción y tratamiento. También determina si un tratamiento es extenso (más de 30 caracteres).

---

## ⚙️ **Clases principales**

### 🔹 `Diagnostico`

- **Atributos:**
  - `descripcion` (String)
  - `tratamiento` (String)

- **Métodos:**
  - Constructor con parámetros.
  - `esTratamientoLargo()`: retorna `true` si el tratamiento tiene más de 30 caracteres.

---

### 🔹 `Consulta`

- **Atributos:**
  - `codigo` (String)
  - `fecha` (String)
  - `diagnostico` (Diagnostico)

- **Métodos:**
  - Constructor con parámetros.
  - `mostrarConsulta()`: imprime los datos de la consulta y el diagnóstico asociado, indicando si el tratamiento es extenso.

---

## 💻 **Ejemplo de uso**

```java
public class Main {
    public static void main(String[] args) {
        Diagnostico diag = new Diagnostico(
            "Infección en la piel",
            "Administrar antibiótico tópico durante 10 días y monitorear reacción."
        );

        Consulta consulta = new Consulta("C001", "2025-07-01", diag);

        consulta.mostrarConsulta();
    }
}

Consulta #C001
Fecha: 2025-07-01
Diagnóstico: Infección en la piel
Tratamiento: Administrar antibiótico tópico durante 10 días y monitorear reacción.
El tratamiento es extenso, se requiere seguimiento adicional.
