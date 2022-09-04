const nombre = document.getElementById("name") /*check*/
const apellidos = document.getElementById("Apellidos")/*check*/
const Mail = document.getElementById("email")/*check*/
const Usuario = document.getElementById("User") /*check*/
const Contraseña = document.getElementById("passWord")/*check*/
const ConfirmaContraseña = document.getElementById("ConpassWord")/*check*/
const parrafo = document.getElementById("warnings")/*check*/
const form = document.getElementById("form") /*check*/


form.addEventListener("submit" , e=>{
    e.preventDefault()
    let warnings = ""
    let entrar =false;
    let regexEmail = /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/
    let regexNombre = /^[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s*[a-zA-ZÀ-ÿ\u00f1\u00d1]*)*[a-zA-ZÀ-ÿ\u00f1\u00d1]+$/g;
    let regexApellidos = /^[a-zA-ZÀ-ÿ\u00f1\u00d1]+(\s*[a-zA-ZÀ-ÿ\u00f1\u00d1]*)*[a-zA-ZÀ-ÿ\u00f1\u00d1]+$/g;
    let regexPassword = /^(?=(?:.*\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})\S{8,}$/
    let regexUser = /^[a-zA-Z0-9\_\-]{6,16}$/

    parrafo.innerHTML= "" ;

        /*Validacion Nombre // acepta solo letras // acepta ñ // acepta acentos*/
    if (!regexNombre.test(nombre.value)){
        alert ("El Nombre debe tener solo letras")
        warnings += `Nombre invalido <br>`
        entrar = true;
    }
        /*Validacion Apellido // acepta solo letras // acepta ñ // acepta acentos*/
    if (!regexApellidos.test(apellidos.value)){
        alert ("El Apellido debe tener solo letras")
        warnings += `Apellido invalido <br>`
        entrar = true;
    }
         /*Validacion Correo */
    if (!regexEmail.test(email.value)) {
        warnings += `Email no es valido <br>`
        entrar = true;
    }

    if (!regexUser.test(Usuario.value)) {
        alert ("El Usuario debe ser de minimo 6 posiciones, debe Tener Letras / Numeros y Guion medio o bajo")
        warnings += `Usuario no cumple especificaciones <br>`
        entrar = true;
    }


    /*Validacion contraseña // Minimo una Mayuscula // minimo una minuscula // minumo un numero // minimo 8 posiciones*/
    if (!regexPassword.test(Contraseña.value)){
        alert ("Contraseña no valida debe cumplir con los siguientes lineamientos: Minimo 8 posiciones, Minimo una Mayuscula/Minuscula, Minimo 1 numero")
        warnings += `Contraseña invalida <br>`
        entrar = true;
    }

    /*Validacion para confirmar contraseña*/
    if (!regexPassword.test(ConfirmaContraseña.value)){
        alert ("Contraseña no valida debe cumplir con los siguientes lineamientos: Minimo 8 posiciones, Minimo una Mayuscula/Minuscula, Minimo 1 numero")
        warnings += `Confirmacion de contraseña invalida <br>`
        entrar = true;
    }

    /*Validacion para confirmar contraseñas*/
    if (Contraseña.value != ConfirmaContraseña.value) {
        alert ("Las Contraseñas deben ser iguales")
        return false;
        }    else {
            alert ("Contraseña confirmadaS")
            entrar =true;
        }
        
    /*Validacion para entrar*/
    if (entrar) {
        parrafo.innerHTML=warnings;
    }
})