# 🧩 Reto de la semana #2 — Pilas (LIFO)

## 🎯 Área

**Pilas (LIFO)**

Puedes usar un **array/lista por debajo**, pero solo tocando un extremo: **metes y sacas, nunca indexas ni troceas por el medio**.

🧩 **Requiere:** bucles, condicionales y listas — **nada de POO**.

---

## 🟢 Paréntesis bien puestos

Dado un texto con solo **paréntesis, corchetes y llaves**, di si todo lo que se abre se cierra en el orden correcto, usando una pila para recordar qué sigue abierto.

### ✅ Resuelto cuando

- Das una respuesta clara de **sí o no**.
- Distingues tres fallos distintos:
  - ❌ Un cierre que no corresponde con lo último abierto.
  - ❌ Algo que se queda sin cerrar.
  - ❌ Un cierre que sobra.

### 💡 Ejemplos

```text
"{[()]}"    → Correcto
"{[(])}"    → Incorrecto: cierre que no corresponde
"{[()]"     → Incorrecto: algo queda sin cerrar
"{[()]}}"   → Incorrecto: sobra un cierre