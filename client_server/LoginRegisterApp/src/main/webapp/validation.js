function validateLogin() {

    let username = document.forms["loginForm"]["username"].value;
    let password = document.forms["loginForm"]["password"].value;

    if (username == "" || password == "") {
        alert("Please fill all fields.");
        return false;
    }
    return true;
}

function validateRegister() {

    let username = document.forms["registerForm"]["username"].value;
    let password = document.forms["registerForm"]["password"].value;
    let confirm = document.forms["registerForm"]["confirmPassword"].value;

    if (username == "" || password == "" || confirm == "") {
        alert("Please fill all fields.");
        return false;
    }

    if (password != confirm) {
        alert("Passwords do not match.");
        return false;
    }
    return true;
}