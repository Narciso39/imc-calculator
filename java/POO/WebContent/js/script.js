const form = document.getElementById('form');
const altura = document.querySelector('#height');
const peso = document.querySelector('#weight');
const result = document.querySelector('#values');
 
const imc = (peso, altura) => {
    const pesoNum = parseFloat(peso);
    const alturaNum = parseFloat(altura);
    if (isNaN(pesoNum) || isNaN(alturaNum) || alturaNum === 0) {
        return 'Valor inválido';
    }
    return pesoNum / (alturaNum ** 2);
}
form.addEventListener('submit', function(event) {
    event.preventDefault();


    const alturaValue = altura.value;
    const pesoValue = peso.value;
    const resultadoIMC = imc(pesoValue, alturaValue);

    document.getElementById('infos').classList.remove('hidden');
    result.innerHTML = resultadoIMC;
});

