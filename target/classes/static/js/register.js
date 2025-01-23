const API_URL = window.location.hostname === 'localhost'
    ? 'http://localhost:8080'
    : 'https://lista-de-tareas-y8j7.onrender.com';

document.getElementById("registrationForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("password-2").value;
    console.log(password);

    if (password == confirmPassword){
        const formData = new FormData(this); // Obtiene los datos del formulario

        // Realiza una solicitud POST al backend
        fetch(`${API_URL}/users/register`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(Object.fromEntries(formData)) // Convierte FormData a un objeto y luego a JSON
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Error al registrar usuario');
            }
            return response.json();
        })
        .then(data => {
            // Maneja la respuesta del backend
            alert(`Usuario registrado: ${data.username}`);
            window.location.href = "/todo";
           
        })
        .catch(error => {
            console.error('Error:', error);
        });
    }
    else alert("Las contraseñas no coinciden!");

});