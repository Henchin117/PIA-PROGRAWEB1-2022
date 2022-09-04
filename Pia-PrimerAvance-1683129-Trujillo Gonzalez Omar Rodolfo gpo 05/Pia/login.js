const UsuarioLogin = document.getElementById("Userlogin")
const Contraseñalogin = document.getElementById("passwordlogin")
const parrafo = document.getElementById("warnings")
const form = document.getElementById("login-box") 

form.addEventListener("submit" , e=>{
    e.preventDefault()
    let warnings = ""
    let entrar =false;
    let regexPassword = /^(?=(?:.*\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})\S{8,}$/
    let regexUser = /^[a-zA-Z0-9\_\-]{6,16}$/
    parrafo.innerHTML= "" ;

      
    if (!regexUser.test(Userlogin.value)) {
        alert ("El Usuario debe ser de minimo 6 posiciones, debe Tener Letras / Numeros y Guion medio o bajo")
        warnings += `Usuario no cumple especificaciones <br>`
        entrar = true;
    }


    /*Validacion contraseña // Minimo una Mayuscula // minimo una minuscula // minumo un numero // minimo 8 posiciones*/
    if (!regexPassword.test(passwordlogin.value)){
        alert ("Contraseña no valida debe cumplir con los siguientes lineamientos: Minimo 8 posiciones, Minimo una Mayuscula/Minuscula, Minimo 1 numero")
        warnings += `Contraseña invalida <br>`
        entrar = true;
    }
        
    /*Validacion para entrar*/
    if (entrar) {
        parrafo.innerHTML=warnings;
    }
})