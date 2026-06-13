document.getElementById("studentForm").addEventListener("submit", function(event){

    event.preventDefault();

    let name = document.getElementById("name").value.trim();
    let age = document.getElementById("age").value;
    let email =document.getElementById("email").value.trim();
    let phone = document.getElementById("phone").value.trim();
    let course =document.getElementById("course").value;
    let gender =document.querySelector(
        "input[name='gender']:checked"
    );

    const nameRegex = /^[A-Za-z\s]{3,30}$/;
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const phoneRegex = /^[6-9]\d{9}$/;

    if (!nameRegex.test(name)){
        alert("Name must only contain alphabets")
        return;
    }

    if (!emailRegex.test(email)){
        alert("Invalid email")
        return;
    }

    if(!phoneRegex.test(phone)){
        alert("Phone number must contain 10 digits only")
        return;
    }

    if(age < 17 || age > 24){
        alert("age must be between 18 and 24")
        return;
    }

    if(course === ""){
        alert("Please select a course");
        return;
    }

    if(!gender){
        alert("Please select gender");
        return;
    }

    alert(
    `Registration Successful
    Name: ${name}
    Age: ${age}
    Email: ${email}
    Phone: ${phone}
    Course: ${course}
    Gender: ${gender.value}`
    );

});