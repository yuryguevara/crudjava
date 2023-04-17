$(document).ready(function () {
    // lista
});

// Aca programamos la parte lógica
async function registrarclientes() {

    let datos = {};
    datos.id = document.getElementById('id').value;
    datos.nombres = document.getElementById('nombres').value;
    datos.celular = document.getElementById('celular').value;
    datos.email = document.getElementById('email').value;
    datos.direccion = document.getElementById('direccion').value;

  const request = await fetch('clientess', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  location.reload();

  //const clientess = await request.json();

}