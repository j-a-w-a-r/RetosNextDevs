# @Retos 🧩 Reto de la semana #1 — Gestor de biblioteca

Construye el sistema con clases desde el principio.

## 🥉 Nivel 1

Implementa:

- `agregar_libro(titulo, autor)`
- `listar_libros()` (ordenado alfabéticamente).

### Comprobación

> Si alguien modifica lo que devuelve `listar_libros()`, el estado interno de la biblioteca no debe cambiar.

## 🥈 Nivel 2

Añade `Revista` y `DVD`.

Cada uno con sus propios campos (no tienen por qué coincidir con los de `Libro`) y su propio plazo de préstamo:

- 📖 Libro = 15 días
- 📰 Revista = 7 días
- 💿 DVD = 3 días

Necesitas poder añadir los tres tipos:

- `agregar_libro()` ya lo tenías del Nivel 1.
- Ahora falta el equivalente para `Revista` y `DVD`.

`prestar(item)` es un único método que sirve para los tres tipos — `Libro` incluido — y calcula la fecha de devolución según el tipo del `item` que reciba.

### Comprobación

> Añadir un tipo nuevo de `item` con su propio plazo no debe requerir tocar ni una línea del método `prestar()`.

## 🥇 Nivel 3

Un usuario puede pedir que le avisen cuando un `item` prestado quede libre.

### Comprobación

> La clase `Biblioteca` no puede tener ningún código que sepa cómo se le notifica a un usuario.