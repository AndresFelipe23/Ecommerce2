package com.afes.appecommerce.util

import android.util.Patterns

fun validateEmail(email: String): RegisterValidation{
    if (email.isEmpty())
        return RegisterValidation.Failed("El correo electrónico no puede estar vacío")

    if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        return RegisterValidation.Failed("Formato de correo electrónico incorrecto")

    return RegisterValidation.Success
}

fun validatePassword(password: String): RegisterValidation{
    if (password.isEmpty())
        return RegisterValidation.Failed("La contraseña no puede estar vacía")

    if (password.length < 6)
        return RegisterValidation.Failed("La contraseña debe contener 6 caracteres")

    return RegisterValidation.Success
}