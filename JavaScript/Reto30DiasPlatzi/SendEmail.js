/*
La función sendEmail recibe tres parámetros: email, subject y body, los cuales son necesarios para enviar un correo.
Deberás implementar la lógica necesaria para usar promesas y enviar el correo después de 2 segundos.

En caso de faltar algún dato, deberás lanzar un error con el mensaje indicando que faltan campos para enviar el correo.
 */

function sendEmail(email, subject, body) {
    return new Promise((resolve, reject) => {
        if (!email || !subject || !body) {
            reject(new Error("Hacen falta campos para enviar el email"));
        }

        setTimeout(() => {
            resolve({
                email,
                subject,
                body
            });
        }, 2000);

    });

}

sendEmail(
    "test@mail.com",
    "Nuevo reto",
    "Únete a los 30 días de JS"
)
    .then(result => console.log(result))

/*
Output:

// Después de 2 segundos

{
  email: "test@mail.com"
  subject: "Nuevo reto",
  body:  "Únete a los 30 días de JS",
}
 */


///////
sendEmail(
    "test@mail.com",
    "",
    "Únete a los 30 días de JS"
)
    .then(result => console.log(result))
    .catch(error => console.log(error))

/*
Output:

// Después de 2 segundos
"Error: Hacen falta campos para enviar el email"
 */
