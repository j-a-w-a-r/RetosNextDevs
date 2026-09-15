const validarPila = (event) => {

    event.preventDefault();

    const texto = document.getElementById("texto").value;
    const pila = [];
    let posicionPila = 0;

    for (let i = 0; i < texto.length; i++) {

        const caracter = texto[i];

        // Símbolo de apertura: se añade a la pila.

        if (caracter === "(" || caracter === "[" || caracter === "{") {
            pila[posicionPila] = caracter;
            posicionPila++;
        }

        // Símbolo de cierre.

        else if (caracter === ")" || caracter === "]" || caracter === "}") {

            // No hay ninguna apertura pendiente.

            if (posicionPila === 0) {
                alert("Pila incorrecta: sobran símbolos de cierre.");
                document.getElementById("texto").value = "";
                return;
            }

            const ultimaApertura = pila[posicionPila - 1];

            // Comprobamos que el cierre corresponde con la última apertura.

            if (
                (caracter === ")" && ultimaApertura === "(") ||
                (caracter === "]" && ultimaApertura === "[") ||
                (caracter === "}" && ultimaApertura === "{")
            ) {
                posicionPila--;
            }
            
            else {
                alert("Pila incorrecta: símbolos de cierre no válidos.");
                document.getElementById("texto").value = "";
                return;
            }
        }

        // Cualquier otro carácter es inválido.

        else {
            alert("Pila incorrecta: se ha introducido un símbolo no válido.");
            document.getElementById("texto").value = "";
            return;
        }
    }

    // Quedan aperturas sin cerrar.
    
    if (posicionPila > 0) {
        alert("Pila incorrecta: faltan símbolos de cierre.");
        document.getElementById("texto").value = "";
        return;
    }

    alert("Pila correcta.");
    document.getElementById("texto").value = "";
};