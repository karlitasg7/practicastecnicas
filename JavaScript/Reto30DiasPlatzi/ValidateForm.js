/*
La función debe verificar que todos los campos requeridos del formulario (name, lastname, email y password) estén completos,
si falta algún campo, debe lanzar un error especificando los campos faltantes.

Para lanzar dicho error debes usar la siguiente sintaxis

throw new Error("Faltan los siguientes campos: name, email, etc...");

Además, la función debe verificar si el email ingresado ya existe en la lista de usuarios registrados.
Si el email ya está en uso, debe retornar un error especificando el email duplicado.

Si to do está correcto, se debe agregar el usuario a la lista de usuarios registrados con todos los datos excepto
la contraseña y retornar un mensaje indicando que el registro fue exitoso junto con el nombre y apellido del usuario.

 */

function validateForm(formData, registeredUsers) {
    const missingFields = [];
    if (!formData["name"]) {
        missingFields.push("name");
    }

    if (!formData["lastname"]) {
        missingFields.push("lastname");
    }

    if (!formData["email"]) {
        missingFields.push("email");
    }

    if (!formData["password"]) {
        missingFields.push("password");
    }

    if (missingFields.length > 0) {
        throw new Error("Faltan los siguientes campos: " + missingFields.join(","));
    }

    const exist = registeredUsers.find(item => item.email === formData.email);

    if (exist) {
        throw  new Error(formData.email);
    }

    const {password, ...data} = formData

    registeredUsers.push(
        {
            ...data,
        }
    );

    console.log(registeredUsers)

    return `Tu registro fue exitoso ${formData.name} ${formData.lastname}`;

}

console.log(validateForm({
            name: "Juan",
            lastname: "Perez",
            email: "juan@example.com",
            password: "123456"
        }
        ,
        [
            {name: "Pedro", lastname: "Gomez", email: "pedro@example.com"},
            {name: "Maria", lastname: "Garcia", email: "maria@example.com"},
        ]
    )
); // Output: "Tu registro fue exitoso Juan Perez"


console.log(
    validateForm({
            name: "Juan",
            password: "123456",
        },
        [
            {name: "Pedro", lastname: "Gomez", email: "pedro@example.com"},
            {name: "Maria", lastname: "Garcia", email: "maria@example.com"},
        ]
    )
); // Output: "Faltan los siguientes campos requeridos: lastname, email"
